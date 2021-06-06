package com.iuc.virtualFactory;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

@Configuration
@EnableOAuth2Client
@EnableWebSecurity
public class OAuth2Configuration extends WebSecurityConfigurerAdapter {

@Override
protected void configure(HttpSecurity http) throws Exception {
  // The configuration that you needed

  // If preflight requests are redirected by OAuth conf, you can try adding:
  // .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()

  // CORS configuration

  // This value must be parameterized according to your application needs 
  final String corsOrigin="http://localhost:8081";
  // The idea is to insert the CORS filter before the filter injected by
  // the @EnableOAuth2Sso annotation
  http.addFilterBefore(new CorsFilter(corsConfigurationSource(corsOrigin)), AbstractPreAuthenticatedProcessingFilter.class).csrf().disable();
}

private CorsConfigurationSource corsConfigurationSource(String corsOrigin) {
    CorsConfiguration configuration = new CorsConfiguration();
    configuration.setAllowedOrigins(Arrays.asList(corsOrigin));
    configuration.setAllowedMethods(Arrays.asList("GET","POST","HEAD","OPTIONS","PUT","PATCH","DELETE"));
    configuration.setMaxAge(10L);
    configuration.setAllowCredentials(true);
    configuration.setAllowedHeaders(Arrays.asList("Accept","Access-Control-Request-Method","Access-Control-Request-Headers",
      "Accept-Language","Authorization","Content-Type","Request-Name","Request-Surname","Origin","X-Request-AppVersion",
      "X-Request-OsVersion", "X-Request-Device", "X-Requested-With"));
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", configuration);
    return source;
}}

