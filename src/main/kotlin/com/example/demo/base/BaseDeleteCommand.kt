package com.example.demo.base

abstract class BaseDeleteCommand<E : BaseEntity, G : BaseGateway<E, Long>>(private val gateway: G) {
    fun execute(id: Long) = gateway.delete(id)

    fun execute(entity: E) = gateway.delete(entity)
}