package com.wisely.highlight_spring4.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareServicewq aws = context.getBean(AwareServicewq.class);
        aws.outputResoult();
        context.close();
    }
}
