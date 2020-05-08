package com.example.demo.data.gateway

import com.example.demo.data.repository.ArticleRepository
import com.example.demo.domain.gateway.ArticleGateway
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ArticleGatewayImpl @Autowired constructor(repository: ArticleRepository) : ArticleGateway(repository) {
    override fun findByTitle() {

    }
}