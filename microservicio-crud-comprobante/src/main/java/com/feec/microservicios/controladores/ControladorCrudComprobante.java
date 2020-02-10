package com.feec.microservicios.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feec.microservicios.controladores.modelo.ModeloCrudRespuesta;
import com.feec.microservicios.modelo.ComprobanteElectronico;
import com.feec.microservicios.servicios.ComprobanteElectronicoServicio;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/crud_comprobante")
@Api(value = "Controlador crud de comprobantes")
@Slf4j
public class ControladorCrudComprobante {

	@Autowired
	private ComprobanteElectronicoServicio lServicio;

	@PostMapping(path = "/guardar", consumes = "application/json", produces = "application/json")
	@ApiOperation(value = "Método que permite registrar un comprobante en base de datos", response = ModeloCrudRespuesta.class)
	public ModeloCrudRespuesta<String> guardar(ComprobanteElectronico lComprobante) {
		log.info("Inicio de metodo de registro de comprobante");
		try {
			lServicio.guardar(lComprobante);
			log.info("Registro de comprobante exitoso", new ModeloCrudRespuesta<>("Registro Exitoso", "0000", ""));
			return new ModeloCrudRespuesta<>("Registro Exitoso", "0000", "");
		} catch (Exception e) {
			String msg = "Error al realizar el registro del comprobante, CLASS ControladorCrudComprobante - guardar ";
			log.error(msg, e);
			return new ModeloCrudRespuesta<String>(msg, "1111", "");
		}
	}

	@GetMapping(path = "/listaCompletaComprobante/{estado}", produces = "application/json")
	@ApiOperation(value = "Método que devuleve todos los comprobantes de la base por estado", response = ArrayList.class)
	public ModeloCrudRespuesta<List<ComprobanteElectronico>> listaCompletaComprobante(@PathVariable String estado) {
		log.info("Inicio de metodo de lista completa de comprobantes");
		try {
			List<ComprobanteElectronico> listaComprobante = lServicio.listaCompletaComprobante(estado);
			log.info("Consulta de comprobantes exitosa -- Total de comprobantes : " + listaComprobante.size());
			log.debug("Consulta de comprobantes exitosa " + listaComprobante);
			return new ModeloCrudRespuesta<List<ComprobanteElectronico>>("Consulta Exitosa", "0000", listaComprobante);
		} catch (Exception e) {
			String msg = "Error al realizar la consulta de la lista de comprobantes, CLASS ControladorCrudComprobante - listaCompletaComprobante ";
			log.error(msg, e);
			return new ModeloCrudRespuesta<List<ComprobanteElectronico>>(msg, "1111",
					new ArrayList<ComprobanteElectronico>());
		}
	}

	@GetMapping(path = "/listaCompletaClaves/{estado}", produces = "application/json")
	@ApiOperation(value = "Método que devuleve todas las claves de los comprobantes de la base por estado", response = ArrayList.class)
	public ModeloCrudRespuesta<List<String>> listaCompletaClaves(@PathVariable String estado) {
		log.info("Inicio de metodo de lista completa de comprobantes");
		try {
			List<String> listaComprobante = lServicio.listaCompletaClaves(estado);
			log.info(
					"Consulta de claves de comprobantes exitosa -- Total de comprobantes : " + listaComprobante.size());
			log.debug("Consulta de claves de comprobantes exitosa", listaComprobante);
			return new ModeloCrudRespuesta<List<String>>("Consulta Exitosa", "0000", listaComprobante);
		} catch (Exception e) {
			String msg = "Error al realizar la consulta de la lista de comprobantes, CLASS ControladorCrudComprobante - listaCompletaClaves ";
			log.error(msg, e);
			return new ModeloCrudRespuesta<List<String>>(msg, "1111", new ArrayList<String>());
		}
	}

	@GetMapping(path = "/obtnerComprobante/{clave}", produces = "application/json")
	@ApiOperation(value = "Método que devuleve un comprobante en base a su clave de acceso", response = ArrayList.class)
	public ModeloCrudRespuesta<ComprobanteElectronico> obtnerComprobante(@PathVariable String clave) {
		log.info("Inicio de metodo obtener comprobante por su clave");
		try {
			ComprobanteElectronico lComprobante = lServicio.obtnerComprobante(clave);
			log.info("Consulta de comprobante por su clave exitosa ");
			log.debug("Consulta de comprobante por su clave exitosa ", lComprobante);
			return new ModeloCrudRespuesta<ComprobanteElectronico>("Consulta Exitosa", "0000", lComprobante);
		} catch (Exception e) {
			String msg = "Error al realizar el registro del comprobante, CLASS ControladorCrudComprobante - listaCompletaClaves ";
			log.error(msg, e);
			return new ModeloCrudRespuesta<ComprobanteElectronico>(msg, "1111", null);
		}
	}

}
