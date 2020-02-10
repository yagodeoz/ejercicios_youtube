package com.feec.microservicios.controladores.modelo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@ApiModel("Modelo Recepcion response")
public class ModeloRecepcionRespuesta {

	private String mensajeRespuestaRecepcion;
	private String codigoError;
}
