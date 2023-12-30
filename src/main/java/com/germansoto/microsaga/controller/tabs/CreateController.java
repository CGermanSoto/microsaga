package com.germansoto.microsaga.controller.tabs;


import com.germansoto.microsaga.entity.Chapter;
import com.germansoto.microsaga.service.IPersonajeService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateController {
    @FXML
    private Button btn_create;
    @Autowired
    private IPersonajeService personajeService;

    @FXML
    private TextField chapterNameField;


    @FXML
    public void initialize() {
        btn_create.setOnAction(event -> {
        	onClickBtn_create();
        });
        
    }

    public void onClickBtn_create(){
        System.out.println(chapterNameField.getText());
    }

    @SuppressWarnings("exports")
	public TextField getChapterNameField() {
		return chapterNameField;
	}

	public void setChapterNameField(@SuppressWarnings("exports") TextField chapterNameField) {
		this.chapterNameField = chapterNameField;
	}

	public void saveChapter(Chapter chapter){
        this.personajeService.createChapter(chapter);
    }
}

