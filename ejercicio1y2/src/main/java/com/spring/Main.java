package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //Creamos el contexto

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //Adquirimos el bean de saludo

        Saludo saludo = (Saludo) context.getBean("saludo");
        System.out.println(saludo.saludo());

        //Y ahora tenemos un bean de otro bean

        UserService userService = (UserService) context.getBean("userservice");
        System.out.println(userService.getNotificacionService().saludoNotificacionService());
    }
}