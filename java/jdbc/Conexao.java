package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection getConexao(){
        try {
            final String url = "jdbc:mysql://localhost/java_test?verifiedServerCert=false&useSSL=true";
            final String usuario = "root";
            final String senha = "admin123";

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }
}
