package com.example.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Joseph Terzieva on 6/1/17.
 */
@Controller
@RequestMapping("/starter")
public class StarterController {

    @RequestMapping("")
    public String index() {
        return "index";
    }

}
