package com.germansoto.microsaga.service.impl;

import com.germansoto.microsaga.dao.IChapterDAOService;
import com.germansoto.microsaga.entity.Chapter;
import com.germansoto.microsaga.service.IPersonajeService;
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
