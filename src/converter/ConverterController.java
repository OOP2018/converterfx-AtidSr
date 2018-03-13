package converter;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;


public class ConverterController {
    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;
    @FXML
    private ComboBox<Length> leftCombobox;
    @FXML
    private ComboBox<Length> rightCombobox;


    /**
     * JavaFX calls the initialize() method of your controller when
     * it creates the UI form, after the components have been created   * and @FXML annotated attributes have been set.
     * This is a hook to initialize anything your controller or UI needs.
     */
    public void initialize() {
        // This is for testing
        System.out.println("Running initialize");
        if (leftCombobox != null) {
            leftCombobox.getItems().addAll(Length.values());
            leftCombobox.getSelectionModel().select(0);// select an item to show
        }
        if (rightCombobox != null) {
            rightCombobox.getItems().addAll(Length.values());
            rightCombobox.getSelectionModel().select(1); // select an item to show
        }
    }

    public void handleConvert(ActionEvent event){

        String text = "";
        String format = "";
        try {
            Length unit1 = leftCombobox.getValue();
            Length unit2 = rightCombobox.getValue();

            if (!textField1.getText().isEmpty()){

                text = textField1.getText().trim();
                double inputUnit = Double.parseDouble(text);
                format = String.format("%.4g",  (unit1.getValue()/unit2.getValue()) * inputUnit);
                textField2.setText(format);

            }else {
                text = textField2.getText().trim();
                double inputUnit = Double.parseDouble(text);
                format = String.format("%.4g",  (unit2.getValue()/unit1.getValue()) * inputUnit);
                textField1.setText(format);

            }



        }catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error ");
            alert.setHeaderText("Invalid number!!");
            alert.setContentText("Input value is not a number: "+text);
            alert.showAndWait();
        }

    }


    public void handleClear(ActionEvent event){
        textField1.clear();
        textField2.clear();

        System.out.println("Clear is Clicked!!!");

    }


}
