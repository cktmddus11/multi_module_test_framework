module maestro.quintet.crm.jpa {
    requires javafx.controls;
    requires javafx.fxml;


    opens maestro.quintet.crm.jpa to javafx.fxml;
    exports maestro.quintet.crm.jpa;
}