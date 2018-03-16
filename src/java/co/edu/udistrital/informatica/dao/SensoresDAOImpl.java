/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.informatica.dao;

import co.edu.udistrital.informatica.odt.TipoLectura;
import co.edu.udistrital.informatica.odt.TipoSensor;
import co.edu.udistrital.informatica.utils.SensoresUtils;
import java.util.ArrayList;

/**
 *
 * @author jcifuentesz
 */
public class SensoresDAOImpl implements SensoresDAO{

    @Override
    public ArrayList<TipoSensor> obtenerListadoSensores() {
        
        return SensoresUtils.listadoSensores();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoSensor consultarUltimaLectura(String idSensor) {
        ArrayList<TipoSensor> sensores = SensoresUtils.listadoSensores();
        
        for(TipoSensor sensor: sensores){
            if(idSensor.equals(sensor.getIdSensor())){
                return sensor;
            }
        }
        return null;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TipoLectura> obtenerHistoricoLecturas(String idSensor) {
        ArrayList<TipoLectura> lecturas = new ArrayList<>();
        ArrayList<TipoSensor> sensores = SensoresUtils.listadoSensores();
        boolean existe=false;
        for(TipoSensor sensor: sensores){
            if(idSensor.equals(sensor.getIdSensor())){
                existe=true;
                for(int i=0;i<20;i++){
                   TipoLectura lectura= new TipoLectura();
                   lectura.setUnidadMedida(sensor.getTipoLecturas().get(0).getUnidadMedida());
                   lectura.setMedida(""+SensoresUtils.valorRandom(15));
                   lecturas.add(lectura);
                }
            }
        }
        if(existe){
            return lecturas;
        }else{
            return null;
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
