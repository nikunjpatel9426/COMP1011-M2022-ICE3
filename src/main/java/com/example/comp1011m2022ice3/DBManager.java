package com.example.comp1011m2022ice3;

import java.sql.*;

/******************singleton*****************/
public class DBManager
{
    // Step 1. private static instance member variable
    private static DBManager  m_instance = null;
    // Step 2. make the default constructor private
    private DBManager(){}
    // Step 3. Create a public static entry point / instance method
    public static DBManager Instance()
    {

        //Step 4. Check if the private instance member variable is null
        if(m_instance == null)
        {

            //Step 5. Initiate a new DBMember instance
            m_instance = new DBManager();
        }
        return m_instance;
    }
    /*************************/
     //private instance member variables
    private String m_user = "root";
    private String m_password = "Nik@12";
    private String m_connectURL = "jdbc:mysql://localhost:3306/comp1011m2022";

    public int insertVector2D(Vector2D vector2D) throws SQLException {

        int vectorID = -1;

        ResultSet resultSet = null;

        String sql = "INSERT INTO vectors(X, Y) VALUES(?, ?);";

        try
                (
                        Connection connection = DriverManager.getConnection(m_connectURL, m_user, m_password);
                        PreparedStatement statement = connection.prepareStatement(sql, new String[]{"vectorID"});
                ) {
            statement.setFloat(1, vector2D.getX());
            statement.setFloat(2, vector2D.getY());

            statement.executeUpdate();

            resultSet = statement.getGeneratedKeys();
            while (resultSet.next()) {
                // get the VectorID from the Database
                vectorID = resultSet.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
        }

        return vectorID;

    }

}
