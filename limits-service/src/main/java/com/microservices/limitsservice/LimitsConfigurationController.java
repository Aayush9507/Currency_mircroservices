package com.microservices.limitsservice;


import com.microservices.limitsservice.bean.LimitConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    @Autowired
    private Configuration configuration;


    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations(){

    	
        return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
    
    @GetMapping("/fault-limits")
    @HystrixCommand(fallbackMethod="fallbackretrieveConfiguration")
    public LimitConfiguration retrieveConfigurations(){

    	
        throw new RuntimeException("not avaibale");
    }
    
    public LimitConfiguration fallbackretrieveConfiguration() {
    	return new LimitConfiguration(9, 999);
    }
}

