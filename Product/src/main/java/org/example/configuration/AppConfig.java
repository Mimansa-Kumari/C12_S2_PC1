package org.example.configuration;

import org.example.domain.Product;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("bean1")
    public Product method1()
    {
        return new Product(111,"Cupboard",30000);
    }
    @Bean("bean2")
    public Product method2()
    {
        Product obj = new Product();
        obj.setProductId(222);
        obj.setProductName("Chair");
        obj.setProductPrice(3000);
        return obj;
    }
}
