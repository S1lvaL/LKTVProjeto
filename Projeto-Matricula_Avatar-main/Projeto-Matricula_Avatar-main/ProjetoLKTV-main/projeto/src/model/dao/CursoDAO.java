package model.dao;

import model.bean.Curso;
import java.sql.Connection;
import conection.ConectionFactory;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class CursoDAO {
   public void create (Curso c) throws ClassNotFoundException, SQLException{
       Connection con = ConectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       stmt = con.prepareStatement("INSERT INTO Curso(nome_curso,carga_horaria,descricao) VALUES(?,?,?)");
       stmt.setString(1, c.getNome_curso());
       stmt.setInt(2, c.getCarga_horaria());
       stmt.setString(3, c.getDescricao());
       
        //Prepara e executa o sql
        stmt.executeUpdate();
        //Fecha a conexão 
        ConectionFactory.closeConnection(con, stmt);
   } 
}
