package com.feec.microservicios.servicios;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.feec.microservicios.modelo.ComprobanteElectronico;
import com.feec.microservicios.repositorio.ComprobanteElectronicoRepositorio;

@Service
public class ComprobanteElectronicoServicio {

	@Autowired
	private ComprobanteElectronicoRepositorio lRepositorio;

	@Transactional()
	public void guardar(ComprobanteElectronico lComprobante) {
		lRepositorio.save(lComprobante);
	}

	@Transactional(readOnly = true)
	public List<ComprobanteElectronico> listaCompletaComprobante(String estado) {
		// TODO Auto-generated method stub
		return lRepositorio.findByEstado(estado);
	}

	@Transactional(readOnly = true)
	public List<String> listaCompletaClaves(String estado) {
		// TODO Auto-generated method stub
		List<Object> listaResultado = lRepositorio.listaClaves(estado);
		List<String> claves = listaResultado.stream().map(Object::toString).collect(Collectors.toList());
		return claves;
	}

	@Transactional(readOnly = true)
	public ComprobanteElectronico obtnerComprobante(String clave) {
		// TODO Auto-generated method stub
		return lRepositorio.findById(clave).orElse(null);
	}

}
