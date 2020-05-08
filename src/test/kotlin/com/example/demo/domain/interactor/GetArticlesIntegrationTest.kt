package com.example.demo.domain.interactor

import com.example.demo.domain.entity.Article
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.domain.PageRequest
import java.time.LocalDateTime
import java.util.stream.Collectors


@SpringBootTest
internal class GetArticlesIntegrationTest {

    @Autowired
    private var createArticle: CreateArticle? = null

    @Autowired
    private var getArticles: GetArticles? = null

    @Autowired
    private var deleteArticle: DeleteArticle? = null

    @Test
    fun createArticle_shouldCreateArticle() {
        assertEquals(emptyList<Article>(), getArticles!!.execute(PageRequest.of(0, 10)).get().collect(Collectors.toList()))

        val article1 = Article(
                "Hello",
                "World",
                LocalDateTime.of(2020, 4, 7, 9, 30, 0),
                LocalDateTime.of(2020, 4, 7, 9, 30, 0),
                id = 1L
        )

        createArticle!!.execute(article1)

        assertEquals(listOf(article1), getArticles!!.execute(PageRequest.of(0, 10)).get().collect(Collectors.toList()))

        deleteArticle!!.execute(article1)
    }

    @Test
    fun deleteArticle_shouldDeleteArticle_givenEntity() {
        assertEquals(emptyList<Article>(), getArticles!!.execute(PageRequest.of(0, 10)).get().collect(Collectors.toList()))

        val article1 = Article(
                "Hello",
                "World",
                LocalDateTime.of(2020, 4, 7, 9, 30, 0),
                LocalDateTime.of(2020, 4, 7, 9, 30, 0),
                id = 1L
        )

        createArticle!!.execute(article1)

        assertEquals(listOf(article1), getArticles!!.execute(PageRequest.of(0, 10)).get().collect(Collectors.toList()))

        deleteArticle!!.execute(article1)

        assertEquals(emptyList<Article>(), getArticles!!.execute(PageRequest.of(0, 10)).get().collect(Collectors.toList()))
    }

    @Test
    fun deleteArticle_shouldDeleteArticle_givenId() {
        assertEquals(emptyList<Article>(), getArticles!!.execute(PageRequest.of(0, 10)).get().collect(Collectors.toList()))

        val article1 = Article(
                "Hello",
                "World",
                LocalDateTime.of(2020, 4, 7, 9, 30, 0),
                LocalDateTime.of(2020, 4, 7, 9, 30, 0),
                id = 1L
        )

        createArticle!!.execute(article1)

        assertEquals(listOf(article1), getArticles!!.execute(PageRequest.of(0, 10)).get().collect(Collectors.toList()))

        deleteArticle!!.execute(1L)

        assertEquals(emptyList<Article>(), getArticles!!.execute(PageRequest.of(0, 10)).get().collect(Collectors.toList()))
    }
}