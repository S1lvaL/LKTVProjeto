package model.dao;

import conection.ConectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;
import model.bean.Aluno;

public class AlunoDAO {

    public void create(Aluno a) throws ClassNotFoundException, SQLException {
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement(
                "INSERT INTO Aluno(nomealuno, cpfaluno, data_nascimento, email_aluno, nomesocial_aluno, deficiente, tipo_deficiencia, enderecoaluno, telefonealuno, nomeresponsavel, cpfresponsavel, telefoneresponsavel) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");

        stmt.setString(1, a.getNomealuno());
        stmt.setString(2, a.getCpfaluno());
        stmt.setDate(3, new java.sql.Date(a.getData_nascimento().getTime()));
        stmt.setString(4, a.getEmail_aluno());
        // Nome social
        if (a.getNomesocial_aluno() != null && !a.getNomesocial_aluno().trim().isEmpty()) {
            stmt.setString(5, a.getNomesocial_aluno());
        } else {
            stmt.setNull(5, java.sql.Types.VARCHAR);
        }

        stmt.setBoolean(6, a.isDeficiente());

        // Tipo deficiência
        if (a.getTipo_deficiencia() == 0) {
            stmt.setNull(7, java.sql.Types.INTEGER);
        } else {
            stmt.setInt(7, a.getTipo_deficiencia());
        }

        stmt.setString(8, a.getEnderecoaluno());
        stmt.setString(9, a.getTelefonealuno());
        stmt.setString(10, a.getNomeresponsavel());
        stmt.setString(11, a.getCpfresponsavel());
        stmt.setString(12, a.getTelefoneresponsavel());

        stmt.executeUpdate();
        ConectionFactory.closeConnection(con, stmt);
    }

    public List<Aluno> read() throws ClassNotFoundException, SQLException {
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Aluno> alunos = new ArrayList<>();

        stmt = con.prepareStatement("SELECT * FROM Aluno");

        rs = stmt.executeQuery();

        while (rs.next()) {
            Aluno a = new Aluno();
            a.setCodaluno(rs.getInt("codaluno"));
            a.setNomealuno(rs.getString("nomealuno"));
            a.setCpfaluno(rs.getString("cpfaluno"));
            a.setData_nascimento(rs.getDate("data_nascimento"));
            a.setEmail_aluno(rs.getString("email_aluno"));
            a.setNomesocial_aluno(rs.getString("nomesocial_aluno"));
            a.setDeficiente(rs.getBoolean("deficiente"));
            a.setTipo_deficiencia(rs.getInt("tipo_deficiencia"));
            a.setEnderecoaluno(rs.getString("enderecoaluno"));
            a.setTelefonealuno(rs.getString("telefonealuno"));
            a.setNomeresponsavel(rs.getString("nomeresponsavel"));
            a.setCpfresponsavel(rs.getString("cpfresponsavel"));
            a.setTelefoneresponsavel(rs.getString("telefoneresponsavel"));

            alunos.add(a);
        }

        ConectionFactory.closeConnection(con, stmt, rs);
        return alunos;
    }

}
