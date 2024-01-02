package com.rpg.microsaga.dao;

import com.rpg.microsaga.entity.Chapter;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface IChapterDAOService {
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveChapter(Chapter chapter);
}
