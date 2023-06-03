package com.spring;

import org.springframework.stereotype.Component;

@Component
    public class UserService {

        private NotificacionService notificacionService;

        public UserService(NotificacionService notificacionService) {
            this.notificacionService=notificacionService;
        }

        public NotificacionService getNotificacionService(){
            return notificacionService;
        }
    }
