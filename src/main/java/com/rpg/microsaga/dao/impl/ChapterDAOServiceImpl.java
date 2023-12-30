package com.rpg.microsaga.dao.impl;

import com.rpg.microsaga.dao.IChapterDAOService;
import com.rpg.microsaga.entity.Chapter;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ChapterDAOServiceImpl implements IChapterDAOService {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveChapter(Chapter chapter) {
        try {
            entityManager.persist(chapter);
        } catch (Exception e) {
            // Manejar la excepción según tus requisitos
            e.printStackTrace();
        }
    }
}
