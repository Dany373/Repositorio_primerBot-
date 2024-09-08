package service;

import model.Respuesta2;
import dao.RespuestaDao2;

public class RespuestaService2 {
    private RespuestaDao2 respuestaDao;

    public RespuestaService2() {
        this.respuestaDao = new RespuestaDao2();
    }

    public void saveRespuesta(Respuesta2 respuesta) {
        try {
            respuestaDao.save(respuesta);
        } catch (Exception e) {System.err.println("Error al guardar el respuesta");}
    }


}