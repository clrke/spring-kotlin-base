package com.example.demo.base

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface BaseRepository<E : BaseEntity, I> : JpaRepository<E, I> {
    fun findAllByDeleteDateIsNull(pageable: Pageable): Page<E>
}
