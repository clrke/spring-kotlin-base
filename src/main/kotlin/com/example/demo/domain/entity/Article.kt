package com.example.demo.domain.entity

import com.example.demo.base.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity

@Entity
data class Article(
        @Column(name = "title")
        var title: String,

        @Column(name = "body")
        var body: String,

        override var createDate: LocalDateTime,

        override var modifyDate: LocalDateTime,

        override var deleteDate: LocalDateTime? = null,

        override var id: Long? = null
) : BaseEntity(
        createDate,
        modifyDate,
        deleteDate,
        id
) {
    constructor() : this("", "", LocalDateTime.now(), LocalDateTime.now())
}
