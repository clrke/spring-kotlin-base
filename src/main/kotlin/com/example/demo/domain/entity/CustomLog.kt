package com.example.demo.domain.entity

import com.example.demo.base.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity

@Entity
data class CustomLog(
        @Column(name = "message")
        var message: String,

        override var createDate: LocalDateTime = LocalDateTime.now(),

        override var modifyDate: LocalDateTime = LocalDateTime.now(),

        override var deleteDate: LocalDateTime? = null,

        override var id: Long? = null
) : BaseEntity(
        createDate,
        modifyDate,
        deleteDate,
        id
)
