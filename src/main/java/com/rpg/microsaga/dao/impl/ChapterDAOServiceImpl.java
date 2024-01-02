package com.rpg.microsaga.dao.impl;

import com.rpg.microsaga.dao.IChapterDAOService;
import com.rpg.microsaga.entity.Chapter;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class ChapterDAOServiceImpl implements IChapterDAOService {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveChapter(Chapter chapter) {
        entityManager.persist(chapter);
    }
}

