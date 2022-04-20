package com.example.restapi;
/**
 * import the springframework bind annotations
 */

import org.springframework.web.bind.annotation.*;


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
    @GetMapping(value = "/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " From BridgeLabz";
    }
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " From BridgeLabz";
    }

}
