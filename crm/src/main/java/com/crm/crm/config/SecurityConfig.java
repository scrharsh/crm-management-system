package com.crm.crm.config;
import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class SecurityConfig {
 @Bean SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
  return http.authorizeHttpRequests(a->a.requestMatchers("/","/login","/css/**","/js/**").permitAll().anyRequest().authenticated())
   .formLogin(f->f.loginPage("/login").defaultSuccessUrl("/dashboard",true).failureUrl("/login?error").permitAll())
   .logout(l->l.logoutSuccessUrl("/login?logout").permitAll()).build();
 }
 @Bean UserDetailsService userDetailsService(PasswordEncoder e) {
  UserDetails admin=User.builder().username("admin").password(e.encode("admin123")).roles("ADMIN").build();
  UserDetails manager=User.builder().username("manager").password(e.encode("manager123")).roles("MANAGER").build();
  UserDetails executive=User.builder().username("executive").password(e.encode("executive123")).roles("EXECUTIVE").build();
  return new InMemoryUserDetailsManager(admin,manager,executive);
 }
 @Bean PasswordEncoder passwordEncoder(){return new BCryptPasswordEncoder();}
}
