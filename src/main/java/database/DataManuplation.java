package database;

import java.sql.*;
import java.util.Scanner;

public class DataManuplation {

    public static void main(String[] args)  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee","root","root"
            );
            Statement stmt  = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select id,e_name from employee");
            Scanner sc = new Scanner(System.in);
            String n;
            System.out.println("Press \"n\" to next");
            System.out.println("Press \"p\" to previous");
            System.out.println("Press \"u\" to update");
            do {
                n= sc.nextLine();
              switch (n) {
                  case "n":
                      if (!rs.next())
                          rs.first();
                      System.out.println(rs.getInt(1) + "  " + rs.getString(2));
                      break;
                  case "p":
                      if (!rs.previous())
                          rs.last();
                      System.out.println(rs.getInt(1) + "  " + rs.getString(2));
                      break;
                  case "u":
                      System.out.println("enter the row");
                      int update = sc.nextInt();
                      sc.nextLine();
                      rs.absolute(update);
                      String name= sc.nextLine();
                      rs.updateString("e_name", name);
                      rs.updateRow();
                      break;
              }
            }while (n.equalsIgnoreCase("n") || n.equalsIgnoreCase("p")
                    || n.equalsIgnoreCase("u"));
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
