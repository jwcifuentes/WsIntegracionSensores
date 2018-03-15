/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.informatica.odt;

import java.util.ArrayList;

/**
 *
 * @author jcifuentesz
 */
public class TipoSensor {
    private String idSensor;
    private String descripcionSensor;
    private String tipoSensor;
    private String ubicacion;
    private ArrayList<TipoLectura> tipoLecturas;

    public String getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(String idSensor) {
        this.idSensor = idSensor;
    }

    public String getDescripcionSensor() {
        return descripcionSensor;
    }

    public void setDescripcionSensor(String descripcionSensor) {
        this.descripcionSensor = descripcionSensor;
    }

    public String getTipoSensor() {
        return tipoSensor;
    }

    public void setTipoSensor(String tipoSensor) {
        this.tipoSensor = tipoSensor;
    }

    public ArrayList<TipoLectura> getTipoLecturas() {
        return tipoLecturas;
    }

    public void setTipoLecturas(ArrayList<TipoLectura> tipoLecturas) {
        this.tipoLecturas = tipoLecturas;
    }

    

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
}
