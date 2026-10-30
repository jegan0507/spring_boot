package com.sgic.lms.controler;


import com.sgic.lms.services.appservices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/app")
public class app {
    private final appservices appservice;

    public app(appservices appservice){
        this.appservice= appservice;
    }

    @GetMapping("/info")
    public Map<String, String> getAppInfo(){
        return appservice.getAppInfo();
    }
}

