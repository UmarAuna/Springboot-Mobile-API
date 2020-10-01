package com.mobileapi.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer


@SpringBootApplication
//@EnableJpaAuditing //Enabling JPA Auditing
//@EnableSwagger2
class ApiApplication : SpringBootServletInitializer()

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}
