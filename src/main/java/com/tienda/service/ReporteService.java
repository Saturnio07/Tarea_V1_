package com.tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.core.io.Resource;

/**
 *
 * @author Dennis
 */
public interface ReporteService {

    public ResponseEntity<Resource>
            generarReporte(
                    String reporte,
                    Map<String, Object> parametros,
                    String tipo)throws IOException;
}
