package com.example.restapi;
/**
 * import the springframework bind annotations
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/web")
/**
 * create a class  HelloRestController
 */
public class HelloRestController {


    @GetMapping("/message")
    public String message() {
        return "Hello From BridgeLabz";
    }
}
