package com.mobileapi.api.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter

/*
* This class sets the access for every web service. The difference between part 2 of this series and this one
* is that there is a new level of security, the role ADMIN. This is for the services under the/admin path.
*
* */
@Configuration
@EnableResourceServer
class ResourceServerConfig : ResourceServerConfigurerAdapter() {
    override fun configure(http: HttpSecurity?) {
        http?.csrf()?.disable()
                ?.formLogin()?.disable()
                ?.anonymous()?.disable()
                ?.authorizeRequests()
                ?.antMatchers("/admin/**")?.hasRole("ADMIN")
                ?.antMatchers("/user/**")?.hasRole("USER")
                ?.antMatchers("/signUp")?.authenticated()
    }

}