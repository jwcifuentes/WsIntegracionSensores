/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.informatica.utils;

import co.edu.udistrital.informatica.odt.TipoLectura;
import co.edu.udistrital.informatica.odt.TipoSensor;
import java.util.ArrayList;

/**
 *
 * @author jcifuentesz
 */
public class SensoresUtils {
    
    public static int valorRandom(int n){
        int numero=0;
        numero = (int) (Math.random() * n) + 1;
        
        return numero;
    }
    
    public static ArrayList<TipoSensor> listadoSensores(){
        ArrayList<TipoSensor> listadoSensores = new  ArrayList<>();
        TipoSensor sensor = new TipoSensor();
        sensor.setDescripcionSensor("HUMEDAD");
        sensor.setIdSensor("01");
        sensor.setDescripcionSensor("Sensor que mide humedad relativa");
        sensor.setUbicacion("BOGOTA");
        TipoLectura lecuta = new TipoLectura();
        lecuta.setMedida(""+SensoresUtils.valorRandom(5));
        lecuta.setUnidadMedida("(%)");
        ArrayList<TipoLectura> tipoLecturas = new ArrayList<>();
        tipoLecturas.add(lecuta);
        sensor.setTipoLecturas(tipoLecturas);
        listadoSensores.add(sensor);
        
        sensor = new TipoSensor();
        sensor.setDescripcionSensor("CO");
        sensor.setIdSensor("02");
        sensor.setDescripcionSensor("Sensor que mide las particulas de CO en el aire");
        sensor.setUbicacion("BOGOTA");
        lecuta = new TipoLectura();
        lecuta.setUnidadMedida("Particulas por Millon");
        lecuta.setMedida(""+SensoresUtils.valorRandom(100));
        tipoLecturas = new ArrayList<>();
        tipoLecturas.add(lecuta);
        sensor.setTipoLecturas(tipoLecturas);
        listadoSensores.add(sensor);
        
        sensor = new TipoSensor();
        sensor.setDescripcionSensor("RUIDO");
        sensor.setIdSensor("03");
        sensor.setDescripcionSensor("Sensor que mide el riudo en un espacio específico");
        sensor.setUbicacion("BOGOTA");
        lecuta = new TipoLectura();
        lecuta.setUnidadMedida("dB");
        lecuta.setMedida(""+SensoresUtils.valorRandom(40));
        tipoLecturas = new ArrayList<>();
        tipoLecturas.add(lecuta);
        sensor.setTipoLecturas(tipoLecturas);
        listadoSensores.add(sensor);
        
        sensor = new TipoSensor();
        sensor.setDescripcionSensor("CO2");
        sensor.setIdSensor("04");
        sensor.setDescripcionSensor("Sensor que mide las particulas de CO2 en el aire");
        sensor.setUbicacion("BOGOTA");
        lecuta = new TipoLectura();
        lecuta.setUnidadMedida("particulas por millon");
        lecuta.setMedida(""+SensoresUtils.valorRandom(120));
        tipoLecturas = new ArrayList<>();
        tipoLecturas.add(lecuta);
        sensor.setTipoLecturas(tipoLecturas);
        listadoSensores.add(sensor);
        
        sensor = new TipoSensor();
        sensor.setDescripcionSensor("TEMPERATURA    ");
        sensor.setIdSensor("04");
        sensor.setDescripcionSensor("Sensor que mide la temperatura");
        sensor.setUbicacion("BOGOTA");
        lecuta = new TipoLectura();
        lecuta.setUnidadMedida("Grados celcius");
        lecuta.setMedida(""+SensoresUtils.valorRandom(1));
        tipoLecturas = new ArrayList<>();
        tipoLecturas.add(lecuta);
        sensor.setTipoLecturas(tipoLecturas);
        listadoSensores.add(sensor);
       
        return listadoSensores;
    }
    
}
