import java.sql.*;

public class Java45 {

    Statement connection(String dburl, String user, String pwd) {
        try {
            Connection connection = DriverManager.getConnection("" + dburl, "" + user, "" + pwd);
            Statement statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    void create(String name, Integer age, String nationality) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test", "root", "admin");
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO `db_test`.`usuarios`(`nombre`,`edad`,`nacionalidad`)VALUES('" + name + "','"+age+"','"+nationality+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void read(String table) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test", "root", "admin");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from " + table);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("nombre")+" "+resultSet.getString("edad")+" "+resultSet.getString("nacionalidad"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void update(String table, Integer user_id, String name, Integer age, String nationality ){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test", "root", "admin");
            Statement statement = connection.createStatement();
            statement.executeUpdate("UPDATE `db_test`.`"+table+"`SET`nombre` = '"+name+"',`edad` = '"+age+"',`nacionalidad` = '"+nationality+"' WHERE `id_usuarios` = '"+user_id+"'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void delete(String table, Integer user_id){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test", "root", "admin");
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM `db_test`.`"+table+"` WHERE id_usuarios = "+user_id+"");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws SQLException {
        Java45 java45 = new Java45();
//        java45.create("Pedro",44, "Frances");
//        java45.update("usuarios", 1, "David", 38, "Espanya" );
//        java45.delete("usuarios", 4);
        java45.read("usuarios");

    }
}
