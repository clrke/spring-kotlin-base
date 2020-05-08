package com.example.demo.base

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

abstract class BaseGetCommand<E : BaseEntity, G : BaseGateway<E, Long>>(private val gateway: G) {
    fun execute(pageable: Pageable): Page<E> = gateway.findAll(pageable)
}