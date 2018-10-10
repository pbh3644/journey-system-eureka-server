package com.pbh.journey.system;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author pangbohuan
 * @description Spring Security 默认开启了所有 CSRF 攻击防御，需要禁用 /eureka 的防御。
 * @date 2018-08-21 10:52
 **/
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().ignoringAntMatchers("/eureka/**").and().authorizeRequests().anyRequest()
                .authenticated().and().httpBasic();
    }
}
