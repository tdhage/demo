package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

/**
 * Created by Dev on 05-08-2017.
 */
@Controller
public class HomeController {

    private static final Logger LOGGER = Logger.getLogger(HomeController.class.getName());

    @RequestMapping("/")
    public String index() {
        LOGGER.info("Loading index page");
        return "index";
    }
}
