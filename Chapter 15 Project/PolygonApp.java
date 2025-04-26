import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PolygonApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        RegularPolygonPane polygonPane = new RegularPolygonPane();

        Button btnIncrease = new Button("+1");
        Button btnDecrease = new Button("-1");

        // Button functionality
        btnIncrease.setOnAction(e -> {
            polygonPane.setSides(polygonPane.getSides() + 1);
        });

        btnDecrease.setOnAction(e -> {
            polygonPane.setSides(polygonPane.getSides() - 1);
        });

        // Layout for buttons
        HBox buttonPane = new HBox(10, btnIncrease, btnDecrease);
        buttonPane.setStyle("-fx-alignment: center; -fx-padding: 10;");

        BorderPane mainPane = new BorderPane();
        mainPane.setCenter(polygonPane);
        mainPane.setBottom(buttonPane);

        // Handle window resizing
        mainPane.widthProperty().addListener(e -> polygonPane.drawPolygon());
        mainPane.heightProperty().addListener(e -> polygonPane.drawPolygon());

        Scene scene = new Scene(mainPane, 400, 400);
        primaryStage.setTitle("N-Sided Regular Polygon");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}