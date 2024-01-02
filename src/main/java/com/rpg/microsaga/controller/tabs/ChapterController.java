package com.rpg.microsaga.controller.tabs;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@Component
public class ChapterController implements Initializable {

    @FXML
    private TableView<String> tableView;

    @FXML
    private TableColumn<String, String> statsColumn;

    @FXML
    private TableColumn<String, String> otrosColumn;

    private List<String> listStats;
    private List<String> listPoints;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> datos = FXCollections.observableArrayList(this.listStat());
        tableView.setItems(datos);

        // Configura cómo se deben mostrar los datos en las columnas
        statsColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue()));
        otrosColumn.setCellValueFactory(data -> new SimpleStringProperty("Stats " + data.getValue()));
    }

    public List<String> listStat(){
        listStats = new ArrayList<>();
        listStats.add("1");
        listStats.add(" 2");
        listStats.add(" 3");
        listStats.add(" 1");
        listStats.add(" 2");
        listStats.add(" 3");
        listStats.add(" 3");
        listStats.add(" 1");
        listStats.add(" 2");
        listStats.add(" 3");
        listStats.add(" 1");
        listStats.add(" 2");
        listStats.add(" 3");
        listStats.add(" 3");
        return listStats;
    }
}
