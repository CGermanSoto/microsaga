module com.germansoto.microsaga {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    requires spring.context;
    requires spring.core;
    requires spring.beans;
    requires java.sql;

    // Abre todos los paquetes bajo com.germansoto.microsaga a los módulos especificados
    opens com.germansoto.microsaga to javafx.fxml, spring.core, spring.beans, spring.context;

    // Abre el paquete de configuración específico a los módulos de Spring
    opens com.germansoto.microsaga.config to spring.core, spring.beans;
    opens com.germansoto.microsaga.controller to spring.beans, spring.core;
    opens com.germansoto.microsaga.service to spring.beans, spring.core;
    opens com.germansoto.microsaga.service.impl to spring.beans, spring.core;

    // Exporta todos los paquetes bajo com.germansoto.microsaga
    exports com.germansoto.microsaga;
    exports com.germansoto.microsaga.config;
    exports com.germansoto.microsaga.controller;
    exports com.germansoto.microsaga.service;
    exports com.germansoto.microsaga.service.impl;
}
