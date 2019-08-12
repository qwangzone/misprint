package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        FunctionService functionService = context.getBean(FunctionService.class);
        System.out.println(functionService.sayHello("di==="));

        context.close();
//        UseFunctionService useFunctionService1 = new UseFunctionService();
//        System.out.println(useFunctionService1.SayHello("222"));

    }
}
