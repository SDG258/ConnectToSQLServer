/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

/**
 *
 * @author Song Du
 */
public class StudensModify {

    public static List<Students> FindAll() throws SQLException {
        List<Students> studentsList = new ArrayList<>();
        
        java.sql.Connection connection = null;
        Statement statement = null;
        
        try {

            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Students;user=sa;password=Songdu1999#");

            
            //Query
            String sql = "Select *From Student";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {              
                Students students = new Students(
                        resultSet.getInt("ID"), 
                        resultSet.getString("Name"), 
                        resultSet.getFloat("Scores"), 
                        resultSet.getString("Picture"), 
                        resultSet.getString("Address"), 
                        resultSet.getString("Note"));
                studentsList.add(students);
            }
            
        } catch (Exception e) {
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudensModify.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
            if (connection != null) {
                connection.close();
            }
        }
        return studentsList;
    }
    
    public static List<Students> SortByIDAscending() throws SQLException {
        List<Students> studentsList = new ArrayList<>();
        
        java.sql.Connection connection = null;
        Statement statement = null;
        
        try {

            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Students;user=sa;password=Songdu1999#");

            
            //Query
            String sql = "Select *From Student order by ID ASC";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {              
                Students students = new Students(
                        resultSet.getInt("ID"), 
                        resultSet.getString("Name"), 
                        resultSet.getFloat("Scores"), 
                        resultSet.getString("Picture"), 
                        resultSet.getString("Address"), 
                        resultSet.getString("Note"));
                studentsList.add(students);
            }
            
        } catch (Exception e) {
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudensModify.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
            if (connection != null) {
                connection.close();
            }
        }
        return studentsList;
    }
    
    public static List<Students> SortByIDDecrease() throws SQLException {
        List<Students> studentsList = new ArrayList<>();
        
        java.sql.Connection connection = null;
        Statement statement = null;
        
        try {

            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Students;user=sa;password=Songdu1999#");

            
            //Query
            String sql = "Select *From Student order by ID DESC";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {              
                Students students = new Students(
                        resultSet.getInt("ID"), 
                        resultSet.getString("Name"), 
                        resultSet.getFloat("Scores"), 
                        resultSet.getString("Picture"), 
                        resultSet.getString("Address"), 
                        resultSet.getString("Note"));
                studentsList.add(students);
            }
            
        } catch (Exception e) {
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudensModify.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
            if (connection != null) {
                connection.close();
            }
        }
        return studentsList;
    }
    
    public static List<Students> SortByScoresAscending() throws SQLException {
        List<Students> studentsList = new ArrayList<>();
        
        java.sql.Connection connection = null;
        Statement statement = null;
        
        try {

            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Students;user=sa;password=Songdu1999#");

            
            //Query
            String sql = "Select *From Student order by Scores ASC";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {              
                Students students = new Students(
                        resultSet.getInt("ID"), 
                        resultSet.getString("Name"), 
                        resultSet.getFloat("Scores"), 
                        resultSet.getString("Picture"), 
                        resultSet.getString("Address"), 
                        resultSet.getString("Note"));
                studentsList.add(students);
            }
            
        } catch (Exception e) {
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudensModify.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
            if (connection != null) {
                connection.close();
            }
        }
        return studentsList;
    }
    
    public static List<Students> SortByScoresDecrease() throws SQLException {
        List<Students> studentsList = new ArrayList<>();
        
        java.sql.Connection connection = null;
        Statement statement = null;
        
        try {

            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Students;user=sa;password=Songdu1999#");

            
            //Query
            String sql = "Select *From Student order by Scores DESC";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {              
                Students students = new Students(
                        resultSet.getInt("ID"), 
                        resultSet.getString("Name"), 
                        resultSet.getFloat("Scores"), 
                        resultSet.getString("Picture"), 
                        resultSet.getString("Address"), 
                        resultSet.getString("Note"));
                studentsList.add(students);
            }
            
        } catch (Exception e) {
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudensModify.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
            if (connection != null) {
                connection.close();
            }
        }
        return studentsList;
    }
    
    public static void Add(Students students) throws SQLException {
        java.sql.Connection connection = null;
        PreparedStatement statement = null;
        
        try {

            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Students;user=sa;password=Songdu1999#");

            
            //Query
            String sql = "Insert into Student(ID, Name, Scores, Picture, Address, Note) values(?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, students.getID());
            statement.setString(2, students.getName());
            statement.setFloat(3, students.getScores());
            statement.setString(4, students.getPicture());
            statement.setString(5, students.getAddress());
            statement.setString(6, students.getNote());
            
            statement.execute();
        } catch (Exception e) {
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudensModify.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
            if (connection != null) {
                connection.close();
            }
        }
    }
    
    public static void Update(Students students) throws SQLException {
        java.sql.Connection connection = null;
        PreparedStatement statement = null;
        
        try {

            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Students;user=sa;password=Songdu1999#");

            
            //Query
            String sql = "Update Student set Name = ?, Scores = ?, Picture = ?, Address = ?, Note = ? where ID = ?";
            statement = connection.prepareCall(sql);
            
            
            statement.setString(1, students.getName());
            statement.setFloat(2, students.getScores());
            statement.setString(3, students.getPicture());
            statement.setString(4, students.getAddress());
            statement.setString(5, students.getNote());
            statement.setInt(6, students.getID());
            
            statement.execute();
        } catch (Exception e) {
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudensModify.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
            if (connection != null) {
                connection.close();
            }
        }
    }
    
    public static void Delete(int ID) throws SQLException {
        java.sql.Connection connection = null;
        PreparedStatement statement = null;
        
        try {

            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Students;user=sa;password=Songdu1999#");

            //Query
            String sql = "DELETE  FROM Student WHERE ID = ?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, ID);
            
            statement.execute();
        } catch (Exception e) {
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudensModify.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
            if (connection != null) {
                connection.close();
            }
        }
    }
}
