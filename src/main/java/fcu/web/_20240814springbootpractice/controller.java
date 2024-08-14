package fcu.web._20240814springbootpractice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

@RequestMapping("/SpringBootInitPractice")
public String test(){

    System.out.println("Hello from SpringBoot !");
    return "hello from JAVASpringBoot ";


    }
}
