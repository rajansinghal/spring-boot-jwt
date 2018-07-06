package com.auth0.samples.authapi;

/**
 * Created by rsinghal on 7/5/2018.
 */
import com.practice.springbootjwt.SpringBootJwtApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class AuthApplication {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

   /*public static void main(String[] args)
       {
           SpringApplication.run(AuthApplication.class, args);
       }*/

}
