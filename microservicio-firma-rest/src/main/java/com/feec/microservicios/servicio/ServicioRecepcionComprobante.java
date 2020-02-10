package com.feec.microservicios.servicio;

import org.springframework.stereotype.Service;

import com.feec.microservicios.controladores.modelo.ModeloRecepcion;
import com.feec.microservicios.controladores.modelo.ModeloRecepcionRespuesta;

@Service
public class ServicioRecepcionComprobante {

	public ModeloRecepcionRespuesta recepcionComprobante(ModeloRecepcion lComprobanteXML) {

		ModeloRecepcionRespuesta lModeloRecepcion = null;
		if (lComprobanteXML.getLXML() == null) {
			lModeloRecepcion = new ModeloRecepcionRespuesta("El xml se encuntra vacio", "ERROR_DATO");
			return lModeloRecepcion;
		}

		return lModeloRecepcion;
	}

}
