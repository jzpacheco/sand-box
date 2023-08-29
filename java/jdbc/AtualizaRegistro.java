package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizaRegistro {
    public static void main(String[] args) throws SQLException {
        Connection conexao = Conexao.getConexao();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Código pra pesquisa: ");
        String codigo = entrada.nextLine();

        System.out.println("Novo nome: ");
        String novoNome = entrada.nextLine();

        String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1,novoNome);
        stmt.setString(2, codigo);
        stmt.execute();

        stmt.close();
        conexao.close();
        entrada.close();
    }
}
