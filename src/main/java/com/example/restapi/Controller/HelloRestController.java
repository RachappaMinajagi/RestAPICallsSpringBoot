package com.example.restapi.Controller;
/**
 * import the springframework bind annotations
 */
import com.example.restapi.model.User;

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
        return "Hello "+user.getFirstName()+" "+user.getFirstName()+" from BridgeLabz";
    }
    @PutMapping("/put/{fName}")
    public String sayHello(@PathVariable String getFirstName, @RequestParam String lastName) {
        return "Hello " + lastName + " " + lastName + " from BridgeLabz..!";
    }

}
