package com.henry.customer

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Controller("/customerApp")
class CustomerAppController {
    private static final Logger logger = LoggerFactory.getLogger(CustomerAppController)

    @Get(uri = "/", produces = MediaType.TEXT_JSON)
    MutableHttpResponse index() {
        logger.info("YO YO YO!")
        HttpResponse.ok([hello: "world"])
    }

    @Get(uri = "/test", produces = MediaType.TEXT_PLAIN)
    String test() {
        logger.info("YO YO!")
        return "hahaha"
    }
}