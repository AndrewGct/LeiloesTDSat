package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConectaDAO {

    public Connection connectDB() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/uc11", "root", "abcd1234"
            );
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver MySQL não encontrado: " + e.getMessage());
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco: " + erro.getMessage());
        }

        return conn;
    }
}