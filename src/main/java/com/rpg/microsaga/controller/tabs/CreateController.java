package com.rpg.microsaga.controller.tabs;

import com.rpg.microsaga.controller.listener.CreateControllerListener;
import com.rpg.microsaga.entity.Chapter;
import com.rpg.microsaga.service.IPersonajeService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CreateController {

    @FXML
    public ComboBox<String> linageNameField;
    @FXML
    public ComboBox<String> specializationNameField;
    @FXML
    private Button btn_create;
    @Autowired
    private IPersonajeService personajeService;

    @FXML
    private TextField chapterNameField;

    private CreateControllerListener listener;

    @FXML
    public void initialize() {
        this.cargarPantallar();
        btn_create.setOnAction(event -> {
       	onClickBtn_create();
            if (listener != null) {
                listener.onCreateButtonClick(chapterNameField.getText());
            }
        });
    }

    public void cargarPantallar(){
        ObservableList<String> specializationOptions = FXCollections.observableArrayList("Esp1", "Esp2", "Esp3");
        ObservableList<String> linageOptions = FXCollections.observableArrayList("Lin1", "Lin2", "Lin3");
        if(this.specializationNameField != null){
            this.specializationNameField.setItems(specializationOptions);
        }
        this.linageNameField.setItems(linageOptions);
    }

    public void onClickBtn_create(){
        Chapter newChapter = new Chapter();
        this.setChapterData(newChapter);
        this.saveChapter(newChapter);
    }

    public void setChapterData(Chapter chapter){
        chapter.setId(1L);
        chapter.setName(chapterNameField.getText());
        chapter.setLife(100);
        chapter.setDefense(50);
        chapter.setLinage(linageNameField.getValue());
        chapter.setSpecialization("prueba");
        chapter.setLevel(1);
        chapter.setAttack(100);
    }

	public void saveChapter(Chapter chapter){
        this.personajeService.createChapter(chapter);
    }
	
    public void setListener(CreateControllerListener listener) {
        this.listener = listener;
    }

    @SuppressWarnings("exports")
    public TextField getChapterNameField() {
        return chapterNameField;
    }

    public void setChapterNameField(@SuppressWarnings("exports") TextField chapterNameField) {
        this.chapterNameField = chapterNameField;
    }

    public ComboBox getLinageNameField() {
        return linageNameField;
    }

    public void setLinageNameField(ComboBox linageNameField) {
        this.linageNameField = linageNameField;
    }

    public ComboBox getSpecializationNameField() {
        return specializationNameField;
    }

    public void setSpecializationNameField(ComboBox specializationNameField) {
        this.specializationNameField = specializationNameField;
    }

    public Button getBtn_create() {
        return btn_create;
    }

    public void setBtn_create(Button btn_create) {
        this.btn_create = btn_create;
    }

    public IPersonajeService getPersonajeService() {
        return personajeService;
    }

    public void setPersonajeService(IPersonajeService personajeService) {
        this.personajeService = personajeService;
    }
}

