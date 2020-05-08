package com.example.demo.domain.interactor

import com.example.demo.base.BaseDeleteCommand
import com.example.demo.domain.entity.Article
import com.example.demo.domain.gateway.ArticleGateway
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DeleteArticle @Autowired constructor(gateway: ArticleGateway) : BaseDeleteCommand<Article, ArticleGateway>(gateway)