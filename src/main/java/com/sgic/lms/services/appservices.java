package com.sgic.lms.services;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

import java.util.Map;

@Service
public class appservices {
    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appversion;

    public Map<String,String> getAppInfo(){
        return  Map.of(
                "name",appName,
                "version",appversion
        );
    }

}
