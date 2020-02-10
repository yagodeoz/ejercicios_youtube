package com.feec.microservicios.tareas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.feec.microservicios.servicios.ServicioEnvioRecepcionComprobante;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TareaEnvioRecepcionComprobante {

	@Autowired
	private ServicioEnvioRecepcionComprobante lServicio;

	@Scheduled(fixedDelayString = "${proceso.tiempoejecucion}")
	public void ejecutarTareaRecepcion() {
		log.info("INCIO DE TAREA DE RECEPCION DE COMPROBANTE");
		try {
			lServicio.envioRecepcionComprobantes();
		} catch (Throwable lError) {
			log.error("ERROR AL REALIZAR LA TAREA DE ENVIO DE RECEPCION DE COMPROBANTES", lError);
			lError.printStackTrace();
		}
		log.info("FIN DE TAREA DE RECEPCION DE COMPROBANTE");
	}
}
