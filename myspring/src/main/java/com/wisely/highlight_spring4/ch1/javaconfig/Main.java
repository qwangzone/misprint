package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
//        UseFunctionService useFunctionService1 = context.getBean(UseFunctionService.class);
//        System.out.println("是否相等： "+ useFunctionService.equals(useFunctionService1));
        FunctionService functionService = context.getBean(FunctionService.class);

        System.out.println(useFunctionService.SayHello("java config"));
        context.close();
    }
}
