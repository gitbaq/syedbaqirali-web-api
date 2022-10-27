package com.syedbaqirali.sbapersonalweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping(value = "/home")
    public String getHome() {
        return "You're at www.syedbaqirali.com Web API Deployed successfully!";
    }


}
