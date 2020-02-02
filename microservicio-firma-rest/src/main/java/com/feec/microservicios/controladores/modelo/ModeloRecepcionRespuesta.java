package com.feec.microservicios.controladores.modelo;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@ApiModel("Modelo Recepcion response")
public class ModeloRecepcionRespuesta {

	private String mensajeRespuestaRecepcion;
	private String codigoError;
}
