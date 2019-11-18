package database;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import usersPackage.*;
import Membership.Membership;

public class MySQLAccess {
  private Connection connect = null;
  private Statement statement = null;
  private PreparedStatement preparedStatement = null;
  private ResultSet resultSet = null;

  public void connectDB() throws Exception {
    try {
      // This will load the MySQL driver, each DB has its own driver
      Class.forName("com.mysql.jdbc.Driver");
      // Setup the connection with the DB
      connect = DriverManager
          .getConnection("jdbc:mysql://localhost/abcs?"
              + "user=root&password=");
      statement = connect.createStatement();
      // Result set get the result of the SQL query
      /*resultSet = statement
          .executeQuery("select * from abcs.user");
              
      System.out.println("The columns in the table are: ");
    
    System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
    for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
      System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
    }

*/
    }
    catch (Exception e) {
      throw e;
    } 
//finally {
//      close();
//    }

  }
  
  public boolean loginCheck(String username, String password) throws SQLException, Exception{
      connectDB();
      
     boolean login = false;
      String email = ""; 
      String pass = "";
      statement = connect.createStatement();
      
      preparedStatement = connect
      .prepareStatement("SELECT email, password FROM abcs.user where email = ? AND password = ?;");
      preparedStatement.setString(1, username);
      preparedStatement.setString(2, password);
      resultSet = preparedStatement.executeQuery();
      
      while(resultSet.next()){
           email = resultSet.getString("email");
           pass = resultSet.getString("password");
          
          if(email.equals(username) && pass.equals(password)){
              login = true;
          }
      }
     System.out.println("DBemail : "+ email + " DBpassword: "  + pass);
      close();
      
      return login;
  }
  
  public void viewFlights() throws SQLException, Exception{
      connectDB();
      
      String results = "";
      statement = connect.createStatement();
      
      preparedStatement = connect
      .prepareStatement("SELECT * FROM abcs.flight;");
      resultSet = preparedStatement.executeQuery();
      
      while(resultSet.next()){
          results += "\nFligh Number: ";
          results += resultSet.getString("flight_number");
          results += "\n";
          results += "\nArrival Time: ";
          results += resultSet.getTime("arrival_time");
          results += "\n";
          results += "\nArrival Date: ";
          results += resultSet.getDate("arrival_date");
          results += "\n";
          results += "\nArrival Airport: ";
          results += resultSet.getString("arrival_airport");
          results += "\n";
          results += "\nDeparture Time: ";
          results += resultSet.getTime("departure_time");
          results += "\n";
          results += "\nDeparture Date: ";
          results += resultSet.getDate("departure_date");
          results += "\n";
          results += "\nDeparture Airport: ";
          results += resultSet.getString("departure_airport");
          results += "\n";
          results += "\nAirplane ID: ";
          results += resultSet.getString("airplane_id");
          results += "\n\n--------------------------";
          results += "\n\n\n";
      }
      close();
      
      //results added together to see the scrollpane
      results+=results+results+results;
      System.out.println(results);
        JTextArea textArea = new JTextArea(results);
        JScrollPane scrollPane = new JScrollPane(textArea);  
        textArea.setLineWrap(true);  
        textArea.setWrapStyleWord(true); 
        scrollPane.setPreferredSize( new Dimension( 400, 400 ) );
        JOptionPane.showMessageDialog(null, scrollPane, "Flights",  
                                               JOptionPane.INFORMATION_MESSAGE);
  }
  
  public int getRole(String email, String password) throws SQLException, Exception{
         connectDB();
         int role = 0;
      
      statement = connect.createStatement();
      
      preparedStatement = connect
      .prepareStatement("SELECT role_id FROM abcs.user WHERE email = ? AND password = ?;");
      preparedStatement.setString(1, email);
      preparedStatement.setString(2, password);
      resultSet = preparedStatement.executeQuery();
      
      while(resultSet.next()){
          role = resultSet.getInt("role_id");
      }
      
      System.out.println(role);
      
      return role;
  }
  
   public void inputDetails(Test_customer user, String email, String password) throws Exception{
        connectDB();
        
         int role = 0;
         int userID = 0;
         String userEmail = "";
         String  pass = "";
         String firstName = "";
         String lastName = "";
         String dateOfBirth = "";
         int gender = 0;
         String contactNumber = "";
         int membership = 0;
      
      statement = connect.createStatement();
      
      preparedStatement = connect
      .prepareStatement("SELECT * FROM abcs.user WHERE email = ? AND password = ?;");
      preparedStatement.setString(1, email);
      preparedStatement.setString(2, password);
      resultSet = preparedStatement.executeQuery();
      
      while(resultSet.next()){
          userID = resultSet.getInt("user_id");
          userEmail = resultSet.getString("email");
          pass = resultSet.getString("password");
          role = resultSet.getInt("role_id");
      }
      
      
     statement = connect.createStatement();
      
      preparedStatement = connect
      .prepareStatement("SELECT * FROM abcs.user_details WHERE user_id = ?;");
      preparedStatement.setInt(1, userID);
      resultSet = preparedStatement.executeQuery();
      
      while(resultSet.next()){
          firstName = resultSet.getString("first_name");
          lastName = resultSet.getString("last_name");
          dateOfBirth = resultSet.getString("dob");
          gender = resultSet.getInt("sex");
          contactNumber = resultSet.getString("contact_number");
      }
      close();
      
      
      
      user.setUserID(userID);
      user.setEmail(userEmail);
      user.setPassword(pass);
      user.setRole(role);
      user.setFirstName(firstName);
      user.setLastName(lastName);
      user.setDateOfBirth(dateOfBirth);
      user.setGender(gender);
      user.setContactNumber(contactNumber);
      
      System.out.println(userID);
      System.out.println(userEmail);
      System.out.println(pass);
      System.out.println(role);
      System.out.println(firstName);
      System.out.println(lastName);
      System.out.println(dateOfBirth);
      System.out.println(gender);
      System.out.println(contactNumber);
      
  }
  
  public int setMembershipPoints(int userID) throws SQLException, Exception{
      
      connectDB();
      int membership = 0;
      
      statement = connect.createStatement();
      
      preparedStatement = connect
      .prepareStatement("SELECT points FROM abcs.membership WHERE user_id = ?;");
      preparedStatement.setInt(1, userID);
      resultSet = preparedStatement.executeQuery();
      
      while(resultSet.next()){
          membership = resultSet.getInt("points");
      }
      
      return membership;
  }
  
  public void addMembershipPoints(int userID, int points) throws SQLException, Exception{
      
      
      connectDB();
      int membership = 0;
      
      statement = connect.createStatement();
      
      preparedStatement = connect
      .prepareStatement("SELECT points FROM abcs.membership WHERE user_id = ? ;");
      preparedStatement.setInt(1, userID);
      resultSet = preparedStatement.executeQuery();
      
      while(resultSet.next()){
          membership = resultSet.getInt("points");
      }
     
      membership = membership + points;
      
      statement = connect.createStatement();
      
      preparedStatement = connect
      .prepareStatement("UPDATE membership SET points = ? FROM abcs.membership WHERE user_id = ?  ;");
      preparedStatement.setInt(1, membership);
      preparedStatement.setInt(2, userID);
      resultSet = preparedStatement.executeQuery();
      
      while(resultSet.next()){
          membership = resultSet.getInt("points");
      }
     
  }
   public String [] getFlightNumber() throws Exception{
       
       connectDB();
       
       int flightNumber = 0;
       int counter = 0;
      
      
       statement = connect.createStatement();
      
      preparedStatement = connect
      .prepareStatement("SELECT flight_number FROM abcs.flight_bookings;");
      resultSet = preparedStatement.executeQuery();
      
      while(resultSet.next()){
          counter++;
      }
      
      String [] flights = new String[counter];
      counter = 0;
      
       statement = connect.createStatement();
      
      preparedStatement = connect
      .prepareStatement("SELECT flight_number FROM abcs.flight_bookings;");
      resultSet = preparedStatement.executeQuery();
      
      while(resultSet.next()){
          flightNumber = resultSet.getInt("flight_number");
          flights[counter] = Integer.toString(flightNumber);
          counter++;
      }
      
      close();
      
      
      return flights;
  }
 
  

  
  
  
  private void close() {
    try {
      if (resultSet != null) {
        resultSet.close();
      }

      if (statement != null) {
        statement.close();
      }

      if (connect != null) {
        connect.close();
      }
    } catch (Exception e) {

    }

    }
}