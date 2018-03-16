/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.informatica.dao;

import co.edu.udistrital.informatica.odt.TipoLectura;
import co.edu.udistrital.informatica.odt.TipoSensor;
import java.util.ArrayList;

/**
 *
 * @author jcifuentesz
 */
public interface SensoresDAO {
    
    public ArrayList<TipoSensor> obtenerListadoSensores();
    
    public TipoSensor consultarUltimaLectura(String idSensor);
    
    public ArrayList<TipoLectura> obtenerHistoricoLecturas(String idSensor);
    
}
