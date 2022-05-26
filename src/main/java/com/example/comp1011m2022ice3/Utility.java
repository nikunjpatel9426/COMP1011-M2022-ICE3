package com.example.comp1011m2022ice3;

public class Utility {

    /*

    This Method returns the Distance from start to End
    * @param start - starting Vector
    * @param end - ending Vector
    * */
    public static float Distance(Vector2D start,Vector2D end){

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

}