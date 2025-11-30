package model.dao;


import conection.ConectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Deficiencia;

public class DeficienciaDAO {

    public List<Deficiencia> read() throws ClassNotFoundException, SQLException {
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Deficiencia> lista = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT codtipo_deficiencia, nome FROM tipo_deficiencia");
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("codtipo_deficiencia");
                String nome = rs.getString("nome");
                lista.add(new Deficiencia(id, nome));
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler deficiências: " + e.getMessage());
        } finally {
            ConectionFactory.closeConnection(con, stmt, rs);
        }

        return lista;
    }
}
