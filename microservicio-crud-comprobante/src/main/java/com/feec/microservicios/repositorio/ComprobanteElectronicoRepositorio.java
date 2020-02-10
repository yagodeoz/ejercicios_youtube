/**
 * @author BYRON
 * 
 */
package com.feec.microservicios.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.feec.microservicios.modelo.ComprobanteElectronico;

// TODO: Auto-generated Javadoc
/**
 * The Interface ComprobanteProcesadoIndividualEAO.
 */
@Repository
public interface ComprobanteElectronicoRepositorio extends JpaRepository<ComprobanteElectronico, String> {

	public static final String LISTA_CLAVES = "select clave_acceso from onix_comprobantes_elect where estado = :estado";

	public static final String LISTA_CLAVES_LIMITADO = "select * from onix_comprobantes_elect where estado = :estado limit :limite";

	@Query(value = LISTA_CLAVES, nativeQuery = true)
	public List<Object> listaClaves(@Param("estado") String estado);

	@Query(value = LISTA_CLAVES_LIMITADO, nativeQuery = true)
	public List<Object> listaClaves(@Param("estado") String estado, @Param("limite") String limite);

	public List<ComprobanteElectronico> findByEstado(String estado);

}
