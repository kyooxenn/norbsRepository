package sakilaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println();
        SpringApplication.run(MainApplication.class,args);
    }

}
