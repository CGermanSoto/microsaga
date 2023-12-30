package com.rpg.microsaga.service.impl;

import com.rpg.microsaga.dao.IChapterDAOService;
import com.rpg.microsaga.entity.Chapter;
import com.rpg.microsaga.service.IPersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeService implements IPersonajeService {

    @Autowired
    private IChapterDAOService chapterDAOService;
    @Override
    public void createChapter(Chapter chapter) {
        this.chapterDAOService.saveChapter(chapter);
    }
}
