package ru.citlab.citlab24.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().permitAll() // Настройка для разрешения доступа всем пользователям
                .and()
                .csrf().disable(); // Отключаем CSRF для простоты
        return http.build();
    }

    // Закомментированный блок для дальнейшего разграничения прав
    // @Bean
    // public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    //     http
    //         .authorizeRequests()
    //             .antMatchers("/admin/**").hasRole("ADMIN") // Только для админов
    //             .antMatchers("/user/**").hasRole("USER") // Только для пользователей
    //             .anyRequest().permitAll()
    //             .and()
    //         .formLogin() // Включаем форму для логина
    //             .permitAll()
    //             .and()
    //         .logout()
    //             .permitAll();
    //     return http.build();
    // }

    // Пример создания пользователей в памяти
    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build());
        manager.createUser(User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin")
                .roles("ADMIN")
                .build());
        return manager;
    }
}
