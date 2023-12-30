
module com.rpg.microsaga {
        requires javafx.controls;
        requires javafx.fxml;

        requires org.controlsfx.controls;
        requires org.kordamp.bootstrapfx.core;

        requires spring.context;
        requires spring.core;
        requires spring.beans;
        requires java.sql;
        requires java.persistence;
        requires org.hibernate.orm.core;

        // Abre todos los paquetes bajo com.rpg.microsaga a los módulos especificados
        opens com.rpg.microsaga to javafx.fxml, spring.core, spring.beans, spring.context;

        // Abre el paquete de configuración específico a los módulos de Spring
        opens com.rpg.microsaga.config to spring.core, spring.beans;
        opens com.rpg.microsaga.service to spring.beans, spring.core;
        opens com.rpg.microsaga.service.impl to spring.beans, spring.core;
        opens com.rpg.microsaga.controller to javafx.fxml, spring.beans, spring.context, spring.core;
        opens com.rpg.microsaga.controller.tabs to javafx.fxml, spring.beans, spring.context, spring.core;
        opens com.rpg.microsaga.controller.listener to javafx.fxml, spring.beans, spring.context, spring.core;
        opens com.rpg.microsaga.model to spring.beans, spring.core, spring.context;
        opens com.rpg.microsaga.entity to spring.beans, spring.core, spring.context;

        // Exporta todos los paquetes bajo com.rpg.microsaga
        exports com.rpg.microsaga;
        exports com.rpg.microsaga.config;
        exports com.rpg.microsaga.controller;
        exports com.rpg.microsaga.controller.tabs;
        exports com.rpg.microsaga.controller.listener;
        exports com.rpg.microsaga.service;
        exports com.rpg.microsaga.service.impl;
        exports com.rpg.microsaga.model;
        exports com.rpg.microsaga.entity;
        exports com.rpg.microsaga.dao.impl;
        }
