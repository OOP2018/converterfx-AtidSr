package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.awt.*;


public class ConverterController {

    @FXML
    TextField mileTextField;
    @FXML
    TextField kilometerTextField;

    private double cons = 1.609344;
    private double result = 0;

    public void handleConvert(ActionEvent event){

        try {

            String text;

                 text = mileTextField.getText().trim();

            System.out.println("handleConvert converting"+text);

            double kilo = Double.parseDouble(text);
            result = kilo*cons;
            String format = String.format("%.4g",result);

            kilometerTextField.setText(format);

        }catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error ");
            alert.setHeaderText("Invalid number!!");
            alert.setContentText("Please try again!!!");
            alert.showAndWait();
        }

    }


    public void handleClear(ActionEvent event){
        kilometerTextField.clear();
        mileTextField.clear();

        System.out.println("Clear is Clicked!!!");

    }

    public void handleConvert2(ActionEvent event){

        try {

            String text;
            text = kilometerTextField.getText().trim();

            System.out.println("handleConvert converting"+text);

            double kilo = Double.parseDouble(text);
            result = kilo*cons;
            String format = String.format("%.4g",result);

            mileTextField.setText(format);

        }catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error ");
            alert.setHeaderText("Invalid number!!");
            alert.setContentText("Please try again!!!");
            alert.showAndWait();
        }

    }

}
