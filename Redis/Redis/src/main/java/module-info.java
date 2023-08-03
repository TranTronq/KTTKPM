module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    requires redis.clients.jedis;
    requires log4j;

    requires java.naming;

    requires javax.jms.api;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}