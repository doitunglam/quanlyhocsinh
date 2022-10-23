module com.example.quanlyhocsinh {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.quanlyhocsinh to javafx.fxml;
    exports com.example.quanlyhocsinh;
}