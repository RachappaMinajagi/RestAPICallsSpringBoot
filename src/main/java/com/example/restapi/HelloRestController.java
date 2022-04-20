package com.example.restapi;
/**
 * import the springframework bind annotations
 */

import org.apache.catalina.User;
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

    @PostMapping("/post")
    public String userData(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
    @PutMapping("/put/{fName}")
    public String sayHello(@PathVariable String fName, @RequestParam String lName) {
        return "Hello " + fName + " " + lName + " from BridgeLabz..!";
    }

}
