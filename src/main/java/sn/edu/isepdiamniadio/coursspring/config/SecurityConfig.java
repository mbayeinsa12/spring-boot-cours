package sn.edu.isepdiamniadio.coursspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authorize) -> authorize
//                        .requestMatchers(HttpMethod.GET,"/api/v1/ecole/").permitAll()
//                        .requestMatchers(HttpMethod.GET,"/api/v1/ecole/**").permitAll()
                        .requestMatchers(HttpMethod.GET,"/home").permitAll()
                        .requestMatchers(HttpMethod.GET,"/home/**").permitAll()
                        .requestMatchers(HttpMethod.GET,"/home/nom/**").permitAll()
                        .requestMatchers(HttpMethod.GET,"/home/nom/**/age/**").permitAll()
                        .anyRequest().authenticated()
                )
                .logout(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults());

        return http.build();
    }
}
