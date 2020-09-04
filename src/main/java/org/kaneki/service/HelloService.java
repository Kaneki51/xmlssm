package org.kaneki.service;

import org.springframework.stereotype.Service;

/**
 * @author Kaneki
 * @date 2020/9/4 20:41
 */
@Service
public class HelloService {

    public String sayHello() {
        return "hello Java 技术！";
    }
}
