package fcu.web._20240814springbootpractice;

import org.springframework.stereotype.Component;

@Component
public class CanonPrinter implements Printer {
@Override
public void print(String message){
System.out.println("Canon 印表機 :"+ message);
}
}

