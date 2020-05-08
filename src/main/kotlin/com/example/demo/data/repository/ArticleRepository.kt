package com.example.demo.data.repository

import com.example.demo.base.BaseRepository
import com.example.demo.domain.entity.Article
import org.springframework.stereotype.Repository

@Repository
interface ArticleRepository : BaseRepository<Article, Long> {
    fun findAllByTitle()
}
