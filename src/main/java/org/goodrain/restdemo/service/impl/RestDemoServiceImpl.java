package org.goodrain.restdemo.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.goodrain.restdemo.domain.RbdRestResponse;
import org.goodrain.restdemo.domain.RbdServiceList;
import org.goodrain.restdemo.service.RestDemoService;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class RestDemoServiceImpl implements RestDemoService {
    public RbdServiceList ListServices() throws IOException {
        ObjectMapper mapper = new ObjectMapper(); // TODO: mapper 可以是公用的

        //  httpclient 文档: https://hc.apache.org/httpcomponents-client-ga/quickstart.html
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:5000/api/v1/services");
        httpGet.addHeader("Authorization", ":asdasdasd"); // TODO: use real value
        CloseableHttpResponse resp = httpclient.execute(httpGet);
        RbdServiceList list = null;
        try {
            System.out.println(resp.getStatusLine());
            // TODO: 处理http状态码
            HttpEntity entity = resp.getEntity();
            // do something useful with the response body
            // and ensure it is fully consumed
            RbdRestResponse<RbdServiceList> r = mapper.readValue(entity.getContent(),
                    new TypeReference<RbdRestResponse<RbdServiceList>>() {
                    });

            if ("0".equals(r.getCode())) {
                list = r.getData();
            } else {
                // TODO: RestResponse 中的 code 进行相应处理
            }

            EntityUtils.consume(entity);
        } finally {
            resp.close();
        }
        return list;
    }
}
