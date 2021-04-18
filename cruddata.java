import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studetails","root","psnumber#3525");
        
        //Statement st=con.createStatement();
        //st.execute("Create table student( studentid int(3),studentname varchar(10))");
        //remove the above statement for new entries and execute the below line for each entry
        //st.executeUpdate("insert into student values(104,'inosuke')");
        
        PreparedStatement st=con.prepareStatement("insert into student values(?,?)");
        st.setInt(1, 105); //( index value of the column, value to be added)
        st.setString(2, "Prashant");
        st.setInt(1, 106); //( index value of the column, value to be added)
        st.setString(2, "Unnati");
        st.setInt(1, 107); //( index value of the column, value to be added)
        st.setString(2, "Manzar");
        st.executeUpdate();
        System.out.println("record is created");
        System.out.println("table is created");
        con.close();
    }
}
