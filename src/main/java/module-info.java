module com.germansoto.microsaga {
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
    requires lombok;

    // Abre todos los paquetes bajo com.germansoto.microsaga a los módulos especificados
    opens com.germansoto.microsaga to javafx.fxml, spring.core, spring.beans, spring.context, lombok;

    // Abre el paquete de configuración específico a los módulos de Spring
    opens com.germansoto.microsaga.config to spring.core, spring.beans, lombok;
    opens com.germansoto.microsaga.service to spring.beans, spring.core, lombok;
    opens com.germansoto.microsaga.service.impl to spring.beans, spring.core, lombok;
    opens com.germansoto.microsaga.controller to javafx.fxml, spring.beans, spring.context, spring.core, lombok;
    opens com.germansoto.microsaga.controller.tabs to javafx.fxml, spring.beans, spring.context, spring.core, lombok;
    opens com.germansoto.microsaga.controller.listener to javafx.fxml, spring.beans, spring.context, spring.core, lombok;
    opens com.germansoto.microsaga.model to spring.beans, spring.core, org.hibernate.annotations, spring.context, lombok;
    opens com.germansoto.microsaga.entity to spring.beans, spring.core, org.hibernate.annotations, spring.context, lombok;

    // Exporta todos los paquetes bajo com.germansoto.microsaga
    exports com.germansoto.microsaga;
    exports com.germansoto.microsaga.config;
    exports com.germansoto.microsaga.controller;
    exports com.germansoto.microsaga.controller.tabs;
    exports com.germansoto.microsaga.controller.listener;
    exports com.germansoto.microsaga.service;
    exports com.germansoto.microsaga.service.impl;
    exports com.germansoto.microsaga.model;
    exports com.germansoto.microsaga.entity;
    exports com.germansoto.microsaga.dao.impl;
}
