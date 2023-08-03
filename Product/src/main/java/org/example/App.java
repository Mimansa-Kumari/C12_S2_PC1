package org.example;

import org.example.configuration.AppConfig;
import org.example.domain.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Product product1 = (Product)applicationContext.getBean("bean1");
        System.out.println(product1);

        Product product2 = (Product)applicationContext.getBean("bean2");
        System.out.println(product2);
    }
}
