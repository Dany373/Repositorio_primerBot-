package dao;

import model.Respuesta2;
import db.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RespuestaDao2 {
    private Connection connection;



    public void save(Respuesta2 respuesta) throws SQLException {
        String query = "INSERT INTO tb_respuestas (seccion, telegram_id, pregunta_id, respuesta_texto) VALUES (?, ?, ?, ?)";
        try (Connection con = DatabaseConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, respuesta.getSeccion());
            ps.setLong(2, respuesta.getTelegramId());
            ps.setInt(3, respuesta.getPreguntaId());
            ps.setString(4, respuesta.getRespuestaTexto());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

