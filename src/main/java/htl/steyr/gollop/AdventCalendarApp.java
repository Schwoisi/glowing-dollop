package htl.steyr.gollop;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdventCalendarApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("calendar.fxml"));
        primaryStage.setScene(new Scene(loader.load()));
        primaryStage.setTitle("Advent Calendar");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
