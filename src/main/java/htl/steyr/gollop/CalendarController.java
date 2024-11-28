package htl.steyr.gollop;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Alert;

import java.util.Objects;

public class CalendarController {
    @FXML
    private GridPane calendarGrid;

    public void initialize() {
        int buttonCount = 24;

        // Create 24 buttons for the calendar
        for (int i = 1; i <= buttonCount; i++) {
            Button button = new Button(String.valueOf(i));
            int day = i; // Capture the current day for the lambda
            button.setOnAction(e -> openImage(day));
            calendarGrid.add(button, (i - 1) % 6, (i - 1) / 6); // Positioning in a 6x4 grid
        }
    }

    private void openImage(int day) {
        // Load the corresponding image
        String imagePath = "img/image" + day + ".png";
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(imagePath)));

        // Display the image in an alert
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Türchen " + day);

        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(400);  // Set width
        imageView.setPreserveRatio(true);

        alert.getDialogPane().setContent(imageView);
        alert.showAndWait();
    }
}
