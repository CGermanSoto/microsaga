module com.rpg.microsaga {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires spring.data.jpa;
    requires spring.jdbc;
    requires spring.orm;
    requires spring.tx;
    requires jakarta.persistence;

    // Abre todos los paquetes bajo com.rpg.microsaga a los módulos especificados
    opens com.rpg.microsaga to javafx.fxml, spring.core, spring.beans, spring.context, spring.data.jpa, spring.jdbc;

    // Abre el paquete de configuración específico a los módulos de Spring
    opens com.rpg.microsaga.config to spring.core, spring.beans, spring.data.jpa, spring.jdbc;

    // Abre el paquete de servicio y sus implementaciones
    opens com.rpg.microsaga.service to spring.beans, spring.core, spring.data.jpa, spring.jdbc;
    opens com.rpg.microsaga.service.impl to spring.beans, spring.core, spring.data.jpa, spring.jdbc;

    // Abre los paquetes relacionados con los controladores
    opens com.rpg.microsaga.controller to javafx.fxml, spring.beans, spring.context, spring.core, spring.data.jpa, spring.jdbc;
    opens com.rpg.microsaga.controller.tabs to javafx.fxml, spring.beans, spring.context, spring.core, spring.data.jpa, spring.jdbc;
    opens com.rpg.microsaga.controller.listener to javafx.fxml, spring.beans, spring.context, spring.core, spring.data.jpa, spring.jdbc;

    // Abre el paquete de entidades
    opens com.rpg.microsaga.entity to spring.beans, spring.core, spring.context, spring.data.jpa, spring.jdbc;

    // Abre el paquete de implementación de DAO
    opens com.rpg.microsaga.dao.impl to spring.core, spring.data.jpa, spring.jdbc;

    // Exporta todos los paquetes bajo com.rpg.microsaga
    exports com.rpg.microsaga;
    exports com.rpg.microsaga.config;
    exports com.rpg.microsaga.controller;
    exports com.rpg.microsaga.controller.tabs;
    exports com.rpg.microsaga.controller.listener;
    exports com.rpg.microsaga.service;
    exports com.rpg.microsaga.service.impl;
    exports com.rpg.microsaga.entity;
    exports com.rpg.microsaga.dao.impl;
    exports com.rpg.microsaga.dao;
}
