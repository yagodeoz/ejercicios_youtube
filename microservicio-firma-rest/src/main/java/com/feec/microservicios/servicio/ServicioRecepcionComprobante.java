package com.feec.microservicios.servicio;

import org.springframework.stereotype.Service;

import com.feec.microservicios.controladores.modelo.ModeloRecepcion;
import com.feec.microservicios.controladores.modelo.ModeloRecepcionRespuesta;

@Service
public class ServicioRecepcionComprobante {
 
	public ModeloRecepcionRespuesta recepcionComprobante(ModeloRecepcion lComprobanteXML) {

		ModeloRecepcionRespuesta lModeloRecepcion = new ModeloRecepcionRespuesta();
		if (lComprobanteXML.getLXML() == null) {
			lModeloRecepcion.setMensajeRespuestaRecepcion("El xml se encuntra vacio");
			lModeloRecepcion.setCodigoError("ERROR_DATO");
			return lModeloRecepcion;
		}

		return lModeloRecepcion;
	}

}
