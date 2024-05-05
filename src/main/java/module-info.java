module example.projekrplbo4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens example.projekrplbo4 to javafx.fxml;
    exports example.projekrplbo4;
}