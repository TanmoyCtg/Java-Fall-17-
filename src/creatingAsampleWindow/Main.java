package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;// this loaded the button class.

public class Main extends Application {
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World"); // title of the window
        //----------------
        // this layout position the button
        // if you need to position your button like middle, top, below
        // then you use StackPane
        button = new Button();
        button.setText("Click Me!");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        // -------------------------
        Scene scene = new Scene(layout,400,300);
        primaryStage.setScene(scene);
        primaryStage.show(); // display the user

    }
    public static void main(String[] args) {
        launch(args);
    }
}
