module id.ac.upj.tif.javafx1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens id.ac.upj.tif.javafx1 to javafx.fxml;
    exports id.ac.upj.tif.javafx1;
}