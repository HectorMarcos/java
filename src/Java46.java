import java.sql.*;
import java.io.InputStream;
import java.util.Scanner;

public class Java46 {
    void create(String name, Integer age, String nationality) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test", "root", "admin");
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO `db_test`.`usuarios`(`nombre`,`edad`,`nacionalidad`)VALUES('" + name + "','" + age + "','" + nationality + "')");
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
                System.out.println(resultSet.getString("nombre") + " " + resultSet.getString("edad") + " " + resultSet.getString("nacionalidad"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void update(String table, Integer user_id, String name, Integer age, String nationality) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test", "root", "admin");
            Statement statement = connection.createStatement();
            statement.executeUpdate("UPDATE `db_test`.`" + table + "`SET`nombre` = '" + name + "',`edad` = '" + age + "',`nacionalidad` = '" + nationality + "' WHERE `id_usuarios` = '" + user_id + "'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void delete(String table, Integer user_id) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test", "root", "admin");
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM `db_test`.`" + table + "` WHERE id_usuarios = " + user_id + "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void select() {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        System.out.println("Select one option:");
        System.out.println("[1] Create");
        System.out.println("[2] Read");
        System.out.println("[3] Update");
        System.out.println("[4] Delete");
        Integer i = null;
        i = sc.nextInt();
        if (i == 1) {
            String name;
            int age;
            String nationality;
            System.out.println("Name:");
            name = sc.next();
            System.out.println("Age:");
            age = sc.nextInt();
            System.out.println("Nationality:");
            nationality = sc.next();
            create("" + name, age, "" + nationality);
        }
        if (i == 2) {
            String table;
            System.out.println("Table:");
            table = sc.next();
            read("" + table);
        }
        if (i == 3) {
            String table;
            int user_id;
            String name;
            int age;
            String nationality;
            System.out.println("Table:");
            table = sc.next();
            System.out.println("Tell me witch ID you want to Update:");
            user_id = sc.nextInt();
            System.out.println("Name:");
            name = sc.next();
            System.out.println("Age:");
            age = sc.nextInt();
            System.out.println("Nationality:");
            nationality = sc.next();
            update("" + table, user_id, "" + name, age, "" + nationality);
        }
        if (i == 4) {
            Integer option = null;
            System.out.println("Tell me witch ID you want to remove:");
            option = sc.nextInt();
            delete("usuarios", option);
        }
        if (i != 1 && i != 2 && i != 3 && i != 4){
            System.out.println("WRONG!!!!");
        }
    }


    public static void main(String[] args) throws SQLException {
        Java46 java46 = new Java46();

//        java46.create("Pedro",44, "Frances");
//        java46.update("usuarios", 1, "David", 38, "Espanya" );
//        java46.delete("usuarios", 4);
//        java46.read("usuarios");
        java46.select();

    }
}
