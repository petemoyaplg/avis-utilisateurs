package com.plg.avisutilisateurs.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
    return httpSecurity.csrf(AbstractHttpConfigurer::disable)
        .authorizeHttpRequests(
            authorize -> authorize
                .requestMatchers(HttpMethod.POST, "/inscription")
                .permitAll()
                .anyRequest()
                .authenticated())
        .build();
    // httpSecurity
    // .authorizeHttpRequests(
    // (auth) -> auth
    // .requestMatchers(AntPathRequestMatcher.antMatcher(HttpMethod.POST,
    // "/inscription"))
    // .permitAll()
    // .anyRequest()
    // .authenticated())
    // .httpBasic(Customizer.withDefaults());
    // return httpSecurity.build();

  }
}
