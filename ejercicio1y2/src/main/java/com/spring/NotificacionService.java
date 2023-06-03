package com.spring;

import org.springframework.stereotype.Component;

@Component
public class NotificacionService {

    public String saludoNotificacionService() {
        return "Hola desde la clase NotificacionService";
    }
}