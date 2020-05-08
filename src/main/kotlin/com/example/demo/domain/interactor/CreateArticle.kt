package com.example.demo.domain.interactor

import com.example.demo.base.BaseCreateCommand
import com.example.demo.domain.entity.Article
import com.example.demo.domain.entity.CustomLog
import com.example.demo.domain.gateway.ArticleGateway
import com.example.demo.domain.subinteractor.CreateLog
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CreateArticle @Autowired constructor(
        val createLog: CreateLog,
        gateway: ArticleGateway
) : BaseCreateCommand<Article, ArticleGateway>(gateway) {
    override fun execute(entity: Article): Article {
        val response = super.execute(entity)

        createLog.execute(CustomLog("Created ${response.id}", id = 1L))

        return response
    }
}
