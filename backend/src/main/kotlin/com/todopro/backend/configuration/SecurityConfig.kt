package com.todopro.backend.securityconfig

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain


@Configuration
class SecurityConfig {

    @Bean
    fun securityFilterChain(httpSecurity: HttpSecurity): SecurityFilterChain {

        httpSecurity.csrf { it.disable() }.formLogin { it.disable() }.httpBasic { it.disable() }.cors { it.disable() }



        return httpSecurity.build()

    }
}