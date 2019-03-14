package org.goodrain.restdemo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.goodrain.restdemo.domain.RbdRestResponse;
import org.goodrain.restdemo.domain.RbdService;
import org.goodrain.restdemo.domain.RbdServiceList;
import org.goodrain.restdemo.service.RestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class RestDemoController {
    @Autowired
    private RestDemoService restDemoService;

    @GetMapping("/api/v1/services")
    public RbdRestResponse<RbdServiceList> dummy() {
        RbdServiceList list = new RbdServiceList();
        RbdService svc1 = new RbdService("c020d6d7010a2e29b77d18649fe8c064", "q2m6fa4k",
                "gre8c064", "rainbond", "adfadf");
        list.getList().add(svc1);
        RbdService svc2 = new RbdService("c020d6d7010a2e29b77d18649fe8c0642", "q2m6fa4k2",
                "gre8c0642", "rainbond", "adfadf2");
        list.getList().add(svc2);

        RbdRestResponse<RbdServiceList> res = new RbdRestResponse<>();
        res.setCode("0");
        res.setMsg("success");
        res.setMsgShow("查询成功");
        res.setData(list);
        return res;
    }

    @GetMapping("/list-services")
    public void listServices() throws IOException {
        RbdServiceList list = restDemoService.ListServices();
        ObjectMapper mapper = new ObjectMapper();
        // TODO: blabla

        System.out.printf("list: " + mapper.writeValueAsString(list));
    }
}
