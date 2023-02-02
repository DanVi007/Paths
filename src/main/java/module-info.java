module no.ntnu.idatg2001.paths {
    requires javafx.controls;
    requires javafx.fxml;


    opens no.ntnu.idatg2001.paths to javafx.fxml;
    exports no.ntnu.idatg2001.paths;
}