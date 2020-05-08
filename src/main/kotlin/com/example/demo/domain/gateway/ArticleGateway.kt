package com.example.demo.domain.gateway

import com.example.demo.base.BaseGateway
import com.example.demo.data.repository.ArticleRepository
import com.example.demo.domain.entity.Article

abstract class ArticleGateway(repository: ArticleRepository) : BaseGateway<Article, Long>(repository)