package web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.AppConfig;
import web.dao.UserDaoImpl;
import web.model.User;
import web.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserServiceImpl userServiceImpl = context.getBean(UserServiceImpl.class);
        userServiceImpl.save(new User(4, "vvv","&&&&","fguef@ufh.ru"));
        context.close();
    }
}
