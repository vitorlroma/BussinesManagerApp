module vr.app.bussinesmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens vr.app.bussinesmanager to javafx.fxml;
    exports vr.app.bussinesmanager;
}