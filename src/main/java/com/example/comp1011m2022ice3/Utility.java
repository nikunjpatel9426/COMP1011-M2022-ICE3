package com.example.comp1011m2022ice3;

import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

/* Singleton */
public final class Utility {
  // step 1 - create a private static instance member

    private static Utility m_instance = null;

    //step 2 - Make the default constructor private
    private Utility(){}

    // step 3 - create an public static access method that returns an instance of the class
    public static Utility Instance()
    {
        // step 4 - ensure that your instance member variable is null
        if(m_instance == null)
        {
            // step 5 - create an instance of the class and save a reference int the private variable
            m_instance = new Utility();
        }
        //step 5- return an instance (reference) of the class
        return m_instance;
    }




    /*

    This Method returns the Distance from start to End
    * @param start - starting Vector
    * @param end - ending Vector
    * */
    public float Distance(Vector2D start,Vector2D end){

        float diffXs = end.getX() - start.getX();
        float diffYs = end.getY() - start.getY();
        return (float) Math.sqrt(diffXs*diffXs + diffYs*diffYs);
    }

    /*
    This Method returns the Distance from start to End
    * */
    public static float Distance(float x1,float y1,float x2,float y2){

        float diffXs = x2-x1;
        float diffYs = y2-y1;
        return (float) Math.sqrt(diffXs*diffXs + diffYs*diffYs);
    }
    public void ConfigureVector2DSpinner(Spinner<Double> spinner, double min, double max, double default_value, double increment_value){

        SpinnerValueFactory<Double> spinnerValueFactory  = new SpinnerValueFactory.DoubleSpinnerValueFactory(min,max,default_value,increment_value);

        spinner.setValueFactory(spinnerValueFactory);

        TextField x1SpinnerTextField = spinner.getEditor();

        x1SpinnerTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            try{
                Float.parseFloat(newValue);
            }catch(Exception e){
                x1SpinnerTextField.setText(oldValue);
            }
        });

    }

}