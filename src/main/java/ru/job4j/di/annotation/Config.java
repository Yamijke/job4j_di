package ru.job4j.di.annotation;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "ru.job4j.di.annotation")
@PropertySource("classpath:application.properties")
public class Config {

    @Bean
    @Primary
    public Dog getAlfaDog() {
        return new Dog("AlfaDog");
    }

    @Bean(name = "SecondDog")
    public Dog getDog() {
        return new Dog("SecondDog");
    }

    @Bean
    public Dog someDog() {
        return new Dog("Dog");
    }
}
