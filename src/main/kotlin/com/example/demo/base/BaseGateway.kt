package com.example.demo.base

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

abstract class BaseGateway<E : BaseEntity, I>(private val repository: BaseRepository<E, I>) {
    fun findAll(pageable: Pageable): Page<E> = repository.findAllByDeleteDateIsNull(pageable)

    fun save(entity: E): E = repository.save(entity)

    fun delete(entity: E) = repository.delete(entity)

    fun delete(id: I) = repository.deleteById(id)
}
