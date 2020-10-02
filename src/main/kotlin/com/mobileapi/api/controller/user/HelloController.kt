package com.mobileapi.api.controller.user

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


/*
* A controller is the one that handles a request from
* our clients and returns a response with the information requested.
* */

@RestController
//@RequestMapping("/api/v1")
class HelloController {

    @RequestMapping(value = ["/public/helloworld"], method = [RequestMethod.GET])
    fun getHelloWorld(): ResponseEntity<String> = ResponseEntity.ok("Hello World")

    @RequestMapping(value = ["/private/helloworld/{name}"], method = [RequestMethod.GET])
    fun getHelloWorldMessageWithName(
            @PathVariable("name")
            name:String
    ):ResponseEntity<Any> =
            if(name != "umar"){
                ResponseEntity.ok(
                        HelloResponse(
                                message = "Hello $name",
                                name = name
                        )
                )
            }else{
                ResponseEntity.badRequest().body("I am Umar")
            }
}

data class HelloResponse(
        val message: String,
        val name: String
)