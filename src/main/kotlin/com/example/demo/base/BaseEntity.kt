package com.example.demo.base

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseEntity(
        @Column(name = "create_date")
        open var createDate: LocalDateTime,

        @Column(name = "modify_date")
        open var modifyDate: LocalDateTime,

        @Column(name = "delete_date")
        open var deleteDate: LocalDateTime? = null,

        @Id
        open var id: Long? = null
) {
    constructor() : this(LocalDateTime.now(), LocalDateTime.now())
}