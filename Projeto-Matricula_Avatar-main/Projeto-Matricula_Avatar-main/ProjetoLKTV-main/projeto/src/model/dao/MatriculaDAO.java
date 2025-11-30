package model.dao;


import conection.ConectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.bean.Matricula;
import java.sql.SQLException;



public class MatriculaDAO {
    public void create(Matricula m) throws ClassNotFoundException, SQLException{
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        stmt = con.prepareStatement("INSERT INTO Matricula(cod_aluno,cod_curso,datamatricula)VALUES(?,?,?)");
        stmt.setInt(1,m.getCod_aluno());
        stmt.setInt(2,m.getCod_curso());
        stmt.setDate(3, new java.sql.Date(m.getDatamatricula().getTime())); //Não entendi, revisar

        //Prepara e executa o sql
        stmt.executeUpdate();
        //Fecha a conexão 
        ConectionFactory.closeConnection(con, stmt);
    }
}


