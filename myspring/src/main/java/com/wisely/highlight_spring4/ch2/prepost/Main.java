package com.wisely.highlight_spring4.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(PrePostConfig.class);

        BeanWayService bs = context.getBean(BeanWayService.class);
        JS250WayService js250 = context.getBean(JS250WayService.class);
        context.close();
    }
}
