package com.example.demo6client;

import com.demo6.common.HelloSyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private HelloSyncService helloSyncService;

    @RequestMapping("/test1")
    public String test1(){
        return helloSyncService.saySync("haha");
    }
}
