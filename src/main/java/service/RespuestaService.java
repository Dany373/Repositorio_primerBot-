package service;

import model.Respuesta;
import dao.RespuestaDao;

public class RespuestaService {
    private RespuestaDao respuestaDao;

    public RespuestaService() {
        this.respuestaDao = new RespuestaDao();
    }

    public void saveRespuesta(Respuesta respuesta) {
        try {
            respuestaDao.save(respuesta);
        } catch (Exception e) {System.err.println("Error al guardar el respuesta");}
    }


}