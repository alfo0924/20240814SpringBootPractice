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

    @RequestMapping("/test1")
    public String test1(){
    System.out.println("test1");
    return "Hello from SpringBoot test1 !";
    }
    @RequestMapping("/test2")
    public String test2(){
    System.out.println("test2");
    return"Hello from SpringBoot test2";
    }
    @RequestMapping("/test3")
    public String test3(){
    System.out.println("test3");
    return"Hello from SpringBoot test3";
    }
}

