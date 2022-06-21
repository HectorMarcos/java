import java.sql.*;

public class MyJDBC {

    Statement connection(String dburl, String user ,String pwd){
        try{
            Connection connection = DriverManager.getConnection(""+dburl, ""+user, ""+pwd);
            Statement statement = connection.createStatement();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    void selectAll(String table) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "admin");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from "+table);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    void insert(String name){
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "admin");
            Statement statement = connection.createStatement();

            statement.executeUpdate("INSERT INTO `jdbc`.`people`(`name`)VALUES('"+name+"')");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        MyJDBC myjdbc = new MyJDBC();
        myjdbc.insert("Pedro");
        myjdbc.selectAll("people");

    }
}


//FIXME https://www.tutorialspoint.com/jdbc/jdbc-insert-records.htm
//FIXME https://www.youtube.com/watch?v=e8g9eNnFpHQ