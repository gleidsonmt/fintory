module io.github.gleidsonmt.fintory {
    requires javafx.controls;
    requires javafx.fxml;

    requires io.github.gleidsonmt.glad;

    opens io.github.gleidsonmt.fintory to javafx.fxml;
    exports io.github.gleidsonmt.fintory;
}