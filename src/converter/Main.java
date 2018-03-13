package converter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * A main class for run converter application
 * @author Atid Srisukhantapeuk
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Converter");
        primaryStage.setScene(new Scene(root, 800, 50));
        primaryStage.show();


    }

    public static void main(String[] args) {

        launch(args);
    }
}
