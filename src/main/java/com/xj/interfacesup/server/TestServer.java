package com.xj.interfacesup.server;

import com.xj.interfacesup.bean.User;
import com.xj.interfacesup.dao.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServer {
    @Autowired
    private UserRepository userRepository;
    private static final Logger log = LoggerFactory.getLogger(TestServer.class);

    public User select(Long id) {
        log.info("into  param:{}", id);
        return userRepository.findById(id).get();
    }
}
