package pl.jacob_the_liar.sandbox.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 31.07.2019 09:09
 * *
 * @className: HelloController
 * *
 * *
 ******************************************************/
@RestController
public class HelloController {

    /*
        @RequestMapping - mapuje tylko metody GET
     */

    @RequestMapping("/hello")
    public String sayHi(){
        return "Hello there!";
    }

}
