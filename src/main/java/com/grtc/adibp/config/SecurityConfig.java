package com.grtc.adibp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends GlobalMethodSecurityConfiguration {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(csrf -> csrf.disable())
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(http ->{
                    http.requestMatchers(HttpMethod.GET, "api/adibp/areas").hasRole("ADMIN");
                    http.requestMatchers(HttpMethod.GET, "api/adibp/areas/{id}").hasRole("ADMIN");
                    http.requestMatchers(HttpMethod.POST, "api/adibp/areas").hasRole("ADMIN");
                    http.requestMatchers(HttpMethod.POST, "api/adibp/areas/{id}").hasRole("ADMIN");
                    http.requestMatchers(HttpMethod.DELETE, "api/adibp/areas/{id}").hasRole("ADMIN");
                    http.requestMatchers(HttpMethod.GET, "api/adibp/empleados").hasRole("ADMIN");
                    http.requestMatchers(HttpMethod.GET, "api/adibp/empleados/{id}").hasRole("ADMIN");
                    http.requestMatchers(HttpMethod.POST, "api/adibp/empleados").hasRole("ADMIN");
                    http.requestMatchers(HttpMethod.POST, "api/adibp/empleados/{id}").hasRole("ADMIN");
                    http.requestMatchers(HttpMethod.DELETE, "api/adibp/empleados/{id}").hasRole("ADMIN");
                    http.anyRequest().authenticated();

                })
                .build();
    }
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception{
        return authenticationConfiguration.getAuthenticationManager();
    }
    @Bean
    public AuthenticationProvider authenticationProvider(UserDetailsService userDetailService){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailService);
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public UserDetailsService userDetailsService(){
        List<UserDetails> userDetails = new ArrayList<>();
        userDetails.add(User.withUsername("jefe")
                .password("$2a$10$Prrvuu9py9GBlu4vru/o/ujkx1DbyQybEAjdbV0.t62C68gez9uXS")
                .roles("ADMIN")
                .build());
        userDetails.add(User.withUsername("practicantes")
                .password("$2a$10$Tb9KNX8FFu/7yJ24po8.HODMJ7vleSqfm/I.mXnR/P4o5uemHjw4e")
                .roles("SUPPORT")
                .build());
        return new InMemoryUserDetailsManager(userDetails);
    }
}
