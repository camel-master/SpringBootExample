package me.dave;

import me.dave.config.BaseConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    private String printConfiguration;

    @Autowired
    private AccessProperties accessProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=============================");
        System.out.println(printConfiguration);
        System.out.println(accessProperties.getName());
        System.out.println("=============================");
    }
}
