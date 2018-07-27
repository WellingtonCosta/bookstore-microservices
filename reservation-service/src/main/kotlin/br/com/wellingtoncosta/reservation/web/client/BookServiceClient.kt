package br.com.wellingtoncosta.reservation.web.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

/**
 * @author Wellington Costa on 27/07/18.
 */
@FeignClient(path = "/books", value = "book-service")
interface BookServiceClient {

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: String): Any?

}