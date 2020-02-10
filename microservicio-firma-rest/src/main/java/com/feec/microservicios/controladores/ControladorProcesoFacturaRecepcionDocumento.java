package com.feec.microservicios.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feec.microservicios.controladores.modelo.ModeloRecepcion;
import com.feec.microservicios.controladores.modelo.ModeloRecepcionRespuesta;
import com.feec.microservicios.servicio.ServicioRecepcionComprobante;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/proceso_facturacion")
@Api(value = "Controlador de Firma Electronica XML")
@Slf4j
public class ControladorProcesoFacturaRecepcionDocumento {

	@Autowired
	private ServicioRecepcionComprobante servicioRecepcion;

	@PostMapping(path = "/recepcion_xml", consumes = "application/json", produces = "application/json")
	@ApiOperation(value = "Metodo que recibe un modelo de XML y responde las acciones realizadas sobre el XML, "
			+ "este método es la entrada para el proceso de registro de XML transferencia al SRI")
	public ModeloRecepcionRespuesta recepcionComprobanteXML(@RequestBody ModeloRecepcion lComprobanteXML) {
		log.info("Inicio de metodo recepción de comprobantes", lComprobanteXML);
		ModeloRecepcionRespuesta lRespuesta = null;
		try {
			lRespuesta = servicioRecepcion.recepcionComprobante(lComprobanteXML);
			log.info("Fin de metodo recepción de comprobantes ", lRespuesta);
			return lRespuesta;
		} catch (Throwable e) {
			String msg = "Error al realizar la recepción del comprobante, CLASS ControladorProcesoFacturaRecepcionDocumento - recepcionComprobanteXML ";
			log.error(msg, e);
			return new ModeloRecepcionRespuesta(msg, "1111");
		}

	}
}
