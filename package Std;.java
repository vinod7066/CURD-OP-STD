package Std;

import java.sql.*;
class FetchingData{
public static void main(String[] args){
    try {
   Class.forName("mysql.jdbc.Driver");
   Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/vinod/crudopn", "username", "passd");
   Statement mystatement = connect.createStatement();
   ResultSet output=mystatement.executeQuery("select * from data where username=\"vinod\"");
   while(output.next())
      {
          System.out.println(output.getString("rollno")+"  "+output.getString("student_name")+"  "+output.getString("dob")+" "+output.getString("email"));  
          
      }
      
         }   
         catch (Exception e){
     System.out.println(e);
    }
  }
}