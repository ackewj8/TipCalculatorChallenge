module williamcsc325.tipcalculatorchallenge {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens williamcsc325.tipcalculatorchallenge to javafx.fxml;
    exports williamcsc325.tipcalculatorchallenge;
}