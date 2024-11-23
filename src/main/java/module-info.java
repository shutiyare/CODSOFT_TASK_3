module com.shutiye.codesoft_task3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.shutiye.codesoft_task3 to javafx.fxml;
    exports com.shutiye.codesoft_task3;
}