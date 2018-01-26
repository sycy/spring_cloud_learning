package com.ybb.sericefeign.controller;

import com.ybb.sericefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    SchedualServiceHi serviceHi;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return serviceHi.sayHiFromClientOne(name);
    }


}
