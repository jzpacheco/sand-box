package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco  {
    public static void main(String[] args) throws SQLException {
        Connection conexao = Conexao.getConexao();

        Statement smtm = conexao.createStatement();
        smtm.execute("CREATE DATABASE IF NOT EXISTS java_test");

        System.out.println("DB CRIADO COM SUCESSO!!!");
        conexao.close();
    }
}
