package com.feec.microservicios.controladores.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ControladorRegistroComprobanteXML
{
	private static final String SER_FACT_INT_COL_PROC = "SER_FACT_INT_COL_PROC";
	private static final String NAMESPACE_URI = "http://controladores.jax.servicios.fe.onix.com";
	
	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ServicioInterfazColaProcesoFacturaPort")
    @ResponsePayload
    public String getStudent(@RequestPayload String request) {
        String response = "Hola " + SER_FACT_INT_COL_PROC;
        
        return response;
    }
}
