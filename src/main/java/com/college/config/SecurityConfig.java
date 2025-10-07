//package com.college.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests(auth -> auth
//                                .anyRequest().permitAll()
//                );
//        return http.build();
//    }
//}
package com.college.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig implements WebMvcConfigurer {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Disable CSRF protection for stateless APIs
                .cors(withDefaults())
                .authorizeHttpRequests(auth -> auth
                                .requestMatchers("/**").permitAll() // Allow all requests without authentication
                                .anyRequest().permitAll()
                )
                .formLogin(form -> form.disable()) // Disable form login
                .httpBasic(basic -> basic.disable()); // Disable HTTP Basic authentication
        return http.build();
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Enable CORS for your frontend app
        registry.addMapping("/**")
                .allowedOriginPatterns("http://localhost:4200", "https://*.railway.app", "https://*.up.railway.app") // Angular frontend URL + Railway domains
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }

    // Optional: Configure CORS via CorsConfigurationSource (in case needed for more fine-grained control)
    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOriginPattern("http://localhost:4200"); // Angular frontend URL
        corsConfiguration.addAllowedOriginPattern("https://*.railway.app"); // Railway domains
        corsConfiguration.addAllowedOriginPattern("https://*.up.railway.app"); // Railway production domains
        corsConfiguration.addAllowedMethod("*"); // Allow all HTTP methods (GET, POST, etc.)
        corsConfiguration.addAllowedHeader("*"); // Allow all headers
        corsConfiguration.setAllowCredentials(true); // Allow credentials (cookies, etc.)

        org.springframework.web.cors.UrlBasedCorsConfigurationSource source = new org.springframework.web.cors.UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);
        return source;
    }
}
