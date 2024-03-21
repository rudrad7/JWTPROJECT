package com.security.JWT.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails build = User.builder().username("rudra").password(passwordEncoder().encode("rudra")).roles("ADMIN").build();
        System.out.println(passwordEncoder().encode("rudra"));
        System.out.println(passwordEncoder().matches("rudra","$2a$10$UswCGZIdRWPYk4gA/XLy0ecPCIJVGYUIX3OM/i4XlVj0zkaFTQara"));
        return new InMemoryUserDetailsManager(build);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){

        return new BCryptPasswordEncoder();
    }

}
