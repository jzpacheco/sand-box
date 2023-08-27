package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoasNome {
    public static void main(String[] args) throws SQLException {
        Connection conexao = Conexao.getConexao();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe nome/letra por qual deseja procurar: ");
        String procura = entrada.nextLine();

        String sql = "SELECT * FROM PESSOAS WHERE nome like ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1,"%"+procura+"%");
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();
        while(resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for(Pessoa p:pessoas){
            System.out.println("Codigo: "+p.getCodigo()+" || Nome: "+p.getNome());
        }

        stmt.close();
        conexao.close();
        entrada.close();
    }
}
