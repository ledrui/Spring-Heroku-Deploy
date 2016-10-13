package com.iliassti.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zax on 10/13/16.
 */

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Holla, People";
    }

}
