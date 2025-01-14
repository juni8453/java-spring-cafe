package com.kakao.cafe.repository;

import com.kakao.cafe.domain.Article;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository {

    void createArticle(Article article);

    List<Article> findAllArticle();

    Optional<Article> findArticle(long articleIdx);
}
