package com.example.comp1011m2022ice3;

public class Vector2D {

    //Private fLoat initial Parameters
    private float m_x;
    private float m_y;

    public Vector2D() {
    }

    //Accessors and mutators Methods
    public float getX() {
        return m_x;
    }

    public void setX(float new_x) {
        m_x=new_x;
    }

    public float getY() {
        return m_y;
    }

    public void setY(float new_y) {
        m_y=new_y;
    }


    //Constrcuctor
    public void Vector2D() {
        m_x = 0.0f;
        m_y = 0.0f;
    }

    public Vector2D(float x, float y) {
        m_x = x;
        m_y = y;
    }

    public Vector2D add(Vector2D vector) {

        m_x += vector.getX();
        m_y += vector.getY();
        return this;
    }

    public Vector2D substrct(Vector2D vector) {
        m_x = vector.getX()-m_x;
        m_y += vector.getY()-m_y;
        return this;
    }

    @Override
    public String toString() {
        return ("(" +getX() +", "  + getY() + ")");
    }
}