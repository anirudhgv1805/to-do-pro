package com.todopro.backend.securityconfig

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.SecurityConfigurer


@Configuration
class SecurityConfig {

    @Bean
    fun securityFilterChain(httpSecurity : HttpSecurity) : SecurityFilterChain {

        httpSecurity.csrf{it.disable()}

        httpSecurity.formLogin{it.disable()}
        httpSecurity.httpBasic{it.disable()}



        return httpSecurity.build()

    }
}