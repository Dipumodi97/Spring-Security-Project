package com.dipu.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // this class used to represent java class as a configuration class
@EnableWebSecurity // this is used to enable security,and customize the security.
public class SecurityConfig {
    /**
     * SecurityFilterChain is customizing as per our project requirement and
     * pass HttpSecurity as a parameter and
     * http.authorizeHttpRequests() taking customizer object to customize the request.
     *
     * @param http
     * @return
     * @throws Exception
     */
   // @Bean
    /*public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests((request) ->
                request.antMatchers("/","/login","/about").permitAll()
                        .anyRequest().authenticated()).formLogin();

        return http.build();
    }*/
    // to configure this is a bean
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests((request) -> request
                        .requestMatchers("/", "/about","/login").permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin(Customizer.withDefaults());

        return http.build();
    }
}
