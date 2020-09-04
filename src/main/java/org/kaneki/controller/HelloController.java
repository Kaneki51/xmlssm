package org.kaneki.controller;

import org.kaneki.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kaneki
 * @date 2020/9/4 20:40
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    /**
     * produces 防止乱码
     * @GetMapping 实际上就是 @RequestMapping(method = {RequestMethod.GET})
     */
    @GetMapping(value = "/hello", produces = "text/html;charset=utf-8")
    public String hello(){
        return helloService.sayHello();
    }
}
