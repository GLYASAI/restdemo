package org.goodrain.restdemo.service;

import org.goodrain.restdemo.domain.RbdServiceList;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface RestDemoService {
    RbdServiceList ListServices() throws IOException;
}
