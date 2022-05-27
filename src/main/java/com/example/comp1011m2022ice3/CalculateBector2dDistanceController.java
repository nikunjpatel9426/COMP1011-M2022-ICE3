package com.example.comp1011m2022ice3;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculateBector2dDistanceController implements Initializable {

    @FXML
    private TextField resultTextField;

    @FXML
    private Spinner<Double> x1spinner;

    @FXML
    private Spinner<Double> x2spinner;

    @FXML
    private Spinner<Double> y1spinner;

    @FXML
    private Spinner<Double> y2spinner;

    @FXML
    void onCalculateButtonClick(ActionEvent event) {
        try {

            float x1 = x1spinner.getValue().floatValue();
            float x2 = x2spinner.getValue().floatValue();
            float y1 = y1spinner.getValue().floatValue();
            float y2 = y2spinner.getValue().floatValue();

            Vector2D point1 = new Vector2D(x1, y1);
            Vector2D point2 = new Vector2D(x2, y2);

            float distance = Utility.Instance().Distance(point1, point2);

            resultTextField.setText("" + distance);

        } catch (Exception e) {
            resultTextField.setText("Please Enter Valid Number");
        }
    }

    @FXML
    void onResetButtonClick(ActionEvent event) {
        x1spinner.getValueFactory().setValue(0.0);
        y1spinner.getValueFactory().setValue(0.0);
        x2spinner.getValueFactory().setValue(0.0);
        y2spinner.getValueFactory().setValue(0.0);
        resultTextField.clear();

        x1spinner.requestFocus();
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Utility.Instance().ConfigureVector2DSpinner(x1spinner,-1000.0,1000.0,0.0,5.0);
        Utility.Instance().ConfigureVector2DSpinner(x2spinner,-1000.0,1000.0,0.0,5.0);
        Utility.Instance().ConfigureVector2DSpinner(y1spinner,-1000.0,1000.0,0.0,5.0);
        Utility.Instance().ConfigureVector2DSpinner(y2spinner,-1000.0,1000.0,0.0,5.0);
    }
}



