package com.mezereon.springtest;

import com.avos.avoscloud.AVOSCloud;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.mezereon.springtest")
@ComponentScan("com.mezereon.springtest")
public class SpringTestApplication {

    private final static String AID = "X4mktq9D0EI47GTGdJz0qSGw-gzGzoHsz";
    private final static String APPK = "7mgzzSTHIPA8agtGFgTFKvzf";
    private final static String MK = "fKHnPzxa5DKqmkf01Gkx7KD6";

    public static void main(String[] args) {
        AVOSCloud.initialize(AID, APPK, MK);
        SpringApplication.run(SpringTestApplication.class, args);
    }
}
