package com.feec.microservicios.controladores.modelo;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@ApiModel("Modelo Recepcion response")
public class ModeloCrudRespuesta<T extends Object> {

	private String mensajeRespuesta;
	private String codigoError;
	private T resultado;

	public ModeloCrudRespuesta(String mensajeRespuesta, String codigoError, T valor) {
		this.mensajeRespuesta = mensajeRespuesta;
		this.codigoError = codigoError;
		this.resultado = valor;
	}
}
