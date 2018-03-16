/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.informatica.sensores;

import co.edu.udistrital.informatica.dao.SensoresDAO;
import co.edu.udistrital.informatica.dao.SensoresDAOImpl;
import co.edu.udistrital.informatica.odt.TipoLectura;
import co.edu.udistrital.informatica.odt.TipoSensor;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jcifuentesz
 */
@WebService(serviceName = "ConsultaSensores")
public class ConsultaSensores {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarListadoSensores")
    public ArrayList<TipoSensor> consultarListadoSensores() {
        SensoresDAO sensorDao = new SensoresDAOImpl();
        return sensorDao.obtenerListadoSensores();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarUltimaLectura")
    public TipoLectura consultarUltimaMedida(@WebParam(name = "idSensor") String idSensor) throws Exception {
        SensoresDAO sensorDao = new SensoresDAOImpl();
        TipoSensor retorno = sensorDao.consultarUltimaLectura(idSensor);
        if(retorno!=null){
            return retorno.getTipoLecturas().get(0);
        }else{
            throw new Exception("El sensor con id "+idSensor+" No existe");
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarHistoricoLecturasSensor")
    public ArrayList<TipoLectura> consultarHistoricoMedidasSensor(@WebParam(name = "idSensor") String idSensor) throws Exception {
        SensoresDAO sensorDao = new SensoresDAOImpl();
        ArrayList<TipoLectura> retorno = sensorDao.obtenerHistoricoLecturas(idSensor);
        if(retorno!=null){
            return retorno;
        }else{
            throw new Exception("El sensor con id "+idSensor+" No existe");
        }
    }

}
