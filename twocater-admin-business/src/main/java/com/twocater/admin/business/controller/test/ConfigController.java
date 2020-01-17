package com.twocater.admin.business.controller.test;

import com.twocater.admin.business.config.BusinessConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Autowired
    private BusinessConfig businessConfig;

    @RequestMapping("/from")
    public String from() {
        return this.businessConfig.getFrom();
    }

}
