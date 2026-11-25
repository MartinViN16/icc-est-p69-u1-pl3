package controllers;

import java.util.List;
import models.Incidente;

public class IncidenteController {
    public List<Incidente> sort(List<Incidente> incidentes) {
        incidentes.sort(null);
        return incidentes;
    }

    public int busquedaBinaria(List<Incidente> incidentes, Incidente objetivo) {
        int low = 0;
        int high = incidentes.size();
        
    }
}
