package io.moview.gatewayservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @Value("${spring.application.name}")
    private String name;
    @Value("${server.port}")
    private String port;
    @Value("${eureka.client.service-url.defaultZone}")
    private String defaultZone;

    @GetMapping("info")
    public String get_info() {
        String res = "name : " + name + " port : " + port + " defaultZone : " + defaultZone;
        return res;
    }
}
