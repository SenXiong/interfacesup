package com.xj.interfacesup.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestServer {
    private static final Logger log = LoggerFactory.getLogger(TestServer.class);

    public int add(int s) {
        log.info("into  param:{}", s);
        return s++;
    }
}
