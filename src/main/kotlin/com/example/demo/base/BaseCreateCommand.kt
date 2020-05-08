package com.example.demo.base

abstract class BaseCreateCommand<E : BaseEntity, G : BaseGateway<E, Long>>(private val gateway: G) {
    open fun execute(entity: E): E = gateway.save(entity)
}