package com.example.comp1011m2022ice3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculateBector2dDistanceController {

    @FXML
    private TextField resultTextField;

    @FXML
    private TextField x1TextField;

    @FXML
    private TextField x2TextField;

    @FXML
    private TextField y1TextField;

    @FXML
    private TextField y2TextField;

    @FXML
    void onCalculateButtonClick(ActionEvent event) {
        try {

            float x1 = Float.parseFloat(x1TextField.getText());
            float x2 = Float.parseFloat(x2TextField.getText());
            float y1 = Float.parseFloat(y1TextField.getText());
            float y2 = Float.parseFloat(y2TextField.getText());

            Vector2D point1 = new Vector2D(x1,y1);
            Vector2D point2 = new Vector2D(x2,y2);

            float distance = Utility.Instance().Distance(point1,point2);

            resultTextField.setText("" + distance);

        }catch (Exception e){
            resultTextField.setText("Please Enter Valid Number");
        }
    }

    @FXML
    void onResetButtonClick(ActionEvent event) {
        x1TextField.clear();
        x2TextField.clear();
        y1TextField.clear();
        y2TextField.clear();

        resultTextField.clear();
    }
}
