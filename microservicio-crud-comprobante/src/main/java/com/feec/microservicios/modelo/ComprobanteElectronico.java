/**
 * @author BYRON
 * 
 */
package com.feec.microservicios.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


// TODO: Auto-generated Javadoc
/**
 * The Class ComprobanteElectronico.
 */
@Entity
@Table(name = "ONIX_COMPROBANTES_ELECT")
public class ComprobanteElectronico implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The clave acceso. */
	private String claveAcceso;
	
	/** The estado. */
	private String estado;
	
	/** The fecha registro. */
	private Date fechaRegistro;
	
	/** The fecha actualizacion. */
	private Date fechaActualizacion;
	
	/** The observacion. */
	private String observacion;
	
	/** The error. */
	private String error;
	
	/** The autorizacion. */
	private String autorizacion;
	
	/** The version comprobante. */
	private String versionComprobante;
	
	/** The xml comprobante. */
	private String xmlComprobante;
	
	/** The xml respuesta autorizacion. */
	private String xmlRespuestaAutorizacion;
	
	/** The xml respuesta comprobacion. */
	private String xmlRespuestaComprobacion;
	
	/** The respuesta autorizacion. */
	private String respuestaAutorizacion;
	
	/** The respuesta comprobacion. */
	private String respuestaComprobacion;
	
	/** The fecha autorizacion. */
	private Date fechaAutorizacion;
	
	/** The fecha comprobacion. */
	private Date fechaComprobacion;
	
	/** The ambiente. */
	private String ambiente;
	
	/** The fecha envio mail. */
	private Date fechaEnvioMail;
	
	/** The identificacion cliente. */
	private String identificacionCliente; 
	
	/** The email cliente. */
	private String emailCliente;
	
	/** The tipo documento. */
	private String tipoDocumento;
	
	/** The version. */
	private Long version;
	
	/** The numero intento. */
	private Integer numeroIntento;
	
	/** The compania. */
	private String compania;
	
	/** The fecha emision. */
	private Date fechaEmision;
	
	/** The nombre cliente. */
	private String nombreCliente;
	
	/** The celular. */
	private String celular;
	
	/** The fecha inicio firmado. */
	private Date fechaInicioFirmado;
	
	/** The fecha fin firmado. */
	private Date fechaFinFirmado;
	
	/** The ultimo codigo error. */
	private String ultimoCodigoError;
	
	/** The num documento. */
	private String numDocumento;
	
	/** The total documento. */
	private Double totalDocumento;
	
	/** The id suscriptor. */
	private Long idSuscriptor;
	
	/** The vendedor. */
	private String vendedor;
	
	/** The documento modificaddo. */
	private String documentoModificaddo;
	
	/** The sub total. */
	private Double subTotal;
	
	/** The descuento. */
	private Double descuento;
	
	/** The impuesto 12. */
	private Double impuesto12;
	
	/** The impuesto 0. */
	private Double impuesto0;
	
	/** The id empresa cliente. */
	private String idEmpresaCliente;
	
	/** The nombre archivo cliente. */
	private String nombreArchivoCliente;
	
	/** The establecimiento. */
	private String establecimiento;
	
	/** The punto emision. */
	private String puntoEmision;
	
	/** The secuencial. */
	private String secuencial;
	

	

	/**
	 * Gets the clave acceso.
	 *
	 * @return the clave acceso
	 */
	@Id
	@Column(name = "CLAVE_ACCESO")
	public String getClaveAcceso() {
		return claveAcceso;
	}

	/**
	 * Sets the clave acceso.
	 *
	 * @param claveAcceso the new clave acceso
	 */
	public void setClaveAcceso(String claveAcceso) {
		this.claveAcceso = claveAcceso;
	}

	/**
	 * Gets the estado.
	 *
	 * @return the estado
	 */
	@Column(name = "ESTADO")
	public String getEstado() {
		return estado;
	}

	/**
	 * Sets the estado.
	 *
	 * @param estado the new estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Gets the fecha registro.
	 *
	 * @return the fecha registro
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA_REGISTRO")
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * Sets the fecha registro.
	 *
	 * @param fechaRegistro the new fecha registro
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * Gets the fecha actualizacion.
	 *
	 * @return the fecha actualizacion
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA_ACTUALIZACION")
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	/**
	 * Sets the fecha actualizacion.
	 *
	 * @param fechaActualizacion the new fecha actualizacion
	 */
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	/**
	 * Gets the observacion.
	 *
	 * @return the observacion
	 */
	@Column(name = "OBSERVACION")
	public String getObservacion() {
		return observacion;
	}

	/**
	 * Sets the observacion.
	 *
	 * @param observacion the new observacion
	 */
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	/**
	 * Gets the error.
	 *
	 * @return the error
	 */
	@Column(name = "ERROR")
	public String getError() {
		return error;
	}

	/**
	 * Sets the error.
	 *
	 * @param error the new error
	 */
	public void setError(String error) {
		this.error = error;
	}

	/**
	 * Gets the autorizacion.
	 *
	 * @return the autorizacion
	 */
	@Column(name = "AUTORIZACION")
	public String getAutorizacion() {
		return autorizacion;
	}

	/**
	 * Sets the autorizacion.
	 *
	 * @param autorizacion the new autorizacion
	 */
	public void setAutorizacion(String autorizacion) {
		this.autorizacion = autorizacion;
	}


	/**
	 * Gets the version comprobante.
	 *
	 * @return the version comprobante
	 */
	@Column(name = "VERSION_COMPROBANTE")
	public String getVersionComprobante() {
		return versionComprobante;
	}

	/**
	 * Sets the version comprobante.
	 *
	 * @param versionComprobante the new version comprobante
	 */
	public void setVersionComprobante(String versionComprobante) {
		this.versionComprobante = versionComprobante;
	}

	
	/**
	 * Gets the xml comprobante.
	 *
	 * @return the xml comprobante
	 */
	@Column(name = "XML_COMPROBANTE")
	public String getXmlComprobante() {
		return xmlComprobante;
	}

	/**
	 * Sets the xml comprobante.
	 *
	 * @param xmlComprobante the new xml comprobante
	 */
	public void setXmlComprobante(String xmlComprobante) {
		this.xmlComprobante = xmlComprobante;
	}

	
	/**
	 * Gets the xml respuesta autorizacion.
	 *
	 * @return the xml respuesta autorizacion
	 */
	@Column(name = "XML_RESPUESTA_AUTORIZACION")
	public String getXmlRespuestaAutorizacion() {
		return xmlRespuestaAutorizacion;
	}

	/**
	 * Sets the xml respuesta autorizacion.
	 *
	 * @param xmlRespuestaAutorizacion the new xml respuesta autorizacion
	 */
	public void setXmlRespuestaAutorizacion(String xmlRespuestaAutorizacion) {
		this.xmlRespuestaAutorizacion = xmlRespuestaAutorizacion;
	}

	/**
	 * Gets the xml respuesta comprobacion.
	 *
	 * @return the xml respuesta comprobacion
	 */
	@Column(name = "XML_RESPUESTA_COMPROBACION")
	public String getXmlRespuestaComprobacion() {
		return xmlRespuestaComprobacion;
	}

	/**
	 * Sets the xml respuesta comprobacion.
	 *
	 * @param xmlRespuestaComprobacion the new xml respuesta comprobacion
	 */
	public void setXmlRespuestaComprobacion(String xmlRespuestaComprobacion) {
		this.xmlRespuestaComprobacion = xmlRespuestaComprobacion;
	}

	/**
	 * Gets the respuesta autorizacion.
	 *
	 * @return the respuesta autorizacion
	 */
	@Column(name = "RESPUESTA_AUTORIZACION")
	public String getRespuestaAutorizacion() {
		return respuestaAutorizacion;
	}

	/**
	 * Sets the respuesta autorizacion.
	 *
	 * @param respuestaAutorizacion the new respuesta autorizacion
	 */
	public void setRespuestaAutorizacion(String respuestaAutorizacion) {
		this.respuestaAutorizacion = respuestaAutorizacion;
	}

	/**
	 * Gets the respuesta comprobacion.
	 *
	 * @return the respuesta comprobacion
	 */
	@Column(name = "RESPUESTA_COMPROBACION")
	public String getRespuestaComprobacion() {
		return respuestaComprobacion;
	}

	/**
	 * Sets the respuesta comprobacion.
	 *
	 * @param respuestaComprobacion the new respuesta comprobacion
	 */
	public void setRespuestaComprobacion(String respuestaComprobacion) {
		this.respuestaComprobacion = respuestaComprobacion;
	}

	
	/**
	 * Gets the fecha autorizacion.
	 *
	 * @return the fecha autorizacion
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA_AUTORIZACION")
	public Date getFechaAutorizacion() {
		return fechaAutorizacion;
	}

	/**
	 * Sets the fecha autorizacion.
	 *
	 * @param fechaAutorizacion the new fecha autorizacion
	 */
	public void setFechaAutorizacion(Date fechaAutorizacion) {
		this.fechaAutorizacion = fechaAutorizacion;
	}

	/**
	 * Gets the fecha comprobacion.
	 *
	 * @return the fecha comprobacion
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA_COMPROBACION")
	public Date getFechaComprobacion() {
		return fechaComprobacion;
	}

	/**
	 * Sets the fecha comprobacion.
	 *
	 * @param fechaComprobacion the new fecha comprobacion
	 */
	public void setFechaComprobacion(Date fechaComprobacion) {
		this.fechaComprobacion = fechaComprobacion;
	}

	/**
	 * Gets the fecha envio mail.
	 *
	 * @return the fecha envio mail
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA_ENVIO_MAIL")
	public Date getFechaEnvioMail() {
		return fechaEnvioMail;
	}

	/**
	 * Sets the fecha envio mail.
	 *
	 * @param fechaEnvioMail the new fecha envio mail
	 */
	public void setFechaEnvioMail(Date fechaEnvioMail) {
		this.fechaEnvioMail = fechaEnvioMail;
	}

	

	/**
	 * Gets the identificacion cliente.
	 *
	 * @return the identificacion cliente
	 */
	@Column(name = "IDENTIFICACION_CLIENTE")
	public String getIdentificacionCliente() {
		return identificacionCliente;
	}

	/**
	 * Sets the identificacion cliente.
	 *
	 * @param identificacionCliente the new identificacion cliente
	 */
	public void setIdentificacionCliente(String identificacionCliente) {
		this.identificacionCliente = identificacionCliente;
	}

	/**
	 * Gets the email cliente.
	 *
	 * @return the email cliente
	 */
	@Column(name = "EMAIL_CLIENTE")
	public String getEmailCliente() {
		return emailCliente;
	}

	/**
	 * Sets the email cliente.
	 *
	 * @param emailCliente the new email cliente
	 */
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	/**
	 * Gets the tipo documento.
	 *
	 * @return the tipo documento
	 */
	@Column(name = "TIPO_DOCUMENTO")
	public String getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * Sets the tipo documento.
	 *
	 * @param tipoDocumento the new tipo documento
	 */
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	@Column(name = "VERSION")
	public Long getVersion() {
		return version;
	}

	/**
	 * Sets the version.
	 *
	 * @param version the new version
	 */
	public void setVersion(Long version) {
		this.version = version;
	}

	/**
	 * Gets the numero intento.
	 *
	 * @return the numero intento
	 */
	@Column(name = "NUMERO_INTENTO")
	public Integer getNumeroIntento() {
		return numeroIntento;
	}
	
	/**
	 * Sets the numero intento.
	 *
	 * @param numeroIntento the new numero intento
	 */
	public void setNumeroIntento(Integer numeroIntento) {
		this.numeroIntento = numeroIntento;
	}
	
	
	/**
	 * Gets the compania.
	 *
	 * @return the compania
	 */
	@Column(name = "COMPANIA")
	public String getCompania() {
		return compania;
	}

	/**
	 * Sets the compania.
	 *
	 * @param compania the new compania
	 */
	public void setCompania(String compania) {
		this.compania = compania;
	}

	/**
	 * Gets the fecha emision.
	 *
	 * @return the fecha emision
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA_EMISION")
	public Date getFechaEmision() {
		return fechaEmision;
	}

	/**
	 * Sets the fecha emision.
	 *
	 * @param fechaEmision the new fecha emision
	 */
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}


	/**
	 * Gets the nombre cliente.
	 *
	 * @return the nombre cliente
	 */
	@Column(name = "NOMBRE_CLIENTE")
	public String getNombreCliente() {
		return nombreCliente;
	}

	/**
	 * Sets the nombre cliente.
	 *
	 * @param nombreCliente the new nombre cliente
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	/**
	 * Gets the celular.
	 *
	 * @return the celular
	 */
	@Column(name = "CELULAR")
	public String getCelular() {
		return celular;
	}

	/**
	 * Sets the celular.
	 *
	 * @param celular the new celular
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}

	/**
	 * Gets the fecha inicio firmado.
	 *
	 * @return the fecha inicio firmado
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_INICIO_FIRMADO")
	public Date getFechaInicioFirmado() {
		return fechaInicioFirmado;
	}

	/**
	 * Sets the fecha inicio firmado.
	 *
	 * @param fechaInicioFirmado the new fecha inicio firmado
	 */
	public void setFechaInicioFirmado(Date fechaInicioFirmado) {
		this.fechaInicioFirmado = fechaInicioFirmado;
	}

	/**
	 * Gets the fecha fin firmado.
	 *
	 * @return the fecha fin firmado
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_FIN_FIRMADO")
	public Date getFechaFinFirmado() {
		return fechaFinFirmado;
	}

	/**
	 * Sets the fecha fin firmado.
	 *
	 * @param fechaFinFirmado the new fecha fin firmado
	 */
	public void setFechaFinFirmado(Date fechaFinFirmado) {
		this.fechaFinFirmado = fechaFinFirmado;
	}
	
	
	
	/**
	 * Gets the ambiente.
	 *
	 * @return the ambiente
	 */
	@Column(name="AMBIENTE")
	public String getAmbiente() {
		return ambiente;
	}
	
	/**
	 * Sets the ambiente.
	 *
	 * @param ambiente the new ambiente
	 */
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	
	
	/**
	 * Gets the ultimo codigo error.
	 *
	 * @return the ultimo codigo error
	 */
	@Column(name="ULT_COD_ERROR")
	public String getUltimoCodigoError() {
		return ultimoCodigoError;
	}
	
	/**
	 * Sets the ultimo codigo error.
	 *
	 * @param ultimoCodigoError the new ultimo codigo error
	 */
	public void setUltimoCodigoError(String ultimoCodigoError) {
		this.ultimoCodigoError = ultimoCodigoError;
	}
	
	/**
	 * Gets the num documento.
	 *
	 * @return the num documento
	 */
	@Column(name="NUM_DOCUMENTO")
	public String getNumDocumento() {
		return numDocumento;
	}
	
	/**
	 * Sets the num documento.
	 *
	 * @param numDocumento the new num documento
	 */
	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}
	
	/**
	 * Gets the total documento.
	 *
	 * @return the total documento
	 */
	@Column(name="VALOR_TOTAL_DOCUMENTO")
	public Double getTotalDocumento() {
		return totalDocumento;
	}
	
	/**
	 * Sets the total documento.
	 *
	 * @param totalDocumento the new total documento
	 */
	public void setTotalDocumento(Double totalDocumento) {
		this.totalDocumento = totalDocumento;
	}
	
	/**
	 * Gets the id suscriptor.
	 *
	 * @return the id suscriptor
	 */
	@Column(name="ID_SUSCRIPTOR")
	public Long getIdSuscriptor() {
		return idSuscriptor;
	}
	
	/**
	 * Sets the id suscriptor.
	 *
	 * @param idSuscriptor the new id suscriptor
	 */
	public void setIdSuscriptor(Long idSuscriptor) {
		this.idSuscriptor = idSuscriptor;
	}
	
	/**
	 * Gets the vendedor.
	 *
	 * @return the vendedor
	 */
	@Column(name="VENDEDOR")
	public String getVendedor() {
		return vendedor;
	}

	/**
	 * Sets the vendedor.
	 *
	 * @param vendedor the new vendedor
	 */
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	
	/**
	 * Gets the documento modificaddo.
	 *
	 * @return the documento modificaddo
	 */
	@Column(name="DOC_MODIFICADO")
	public String getDocumentoModificaddo() {
		return documentoModificaddo;
	}

	/**
	 * Sets the documento modificaddo.
	 *
	 * @param documentoModificaddo the new documento modificaddo
	 */
	public void setDocumentoModificaddo(String documentoModificaddo) {
		this.documentoModificaddo = documentoModificaddo;
	}

	/**
	 * Gets the sub total.
	 *
	 * @return the sub total
	 */
	@Column(name="SUBTOTAL")
	public Double getSubTotal() {
		return subTotal;
	}

	/**
	 * Sets the sub total.
	 *
	 * @param subTotal the new sub total
	 */
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	/**
	 * Gets the descuento.
	 *
	 * @return the descuento
	 */
	@Column(name="DESCUENTO_TOTAL")
	public Double getDescuento() {
		return descuento;
	}

	/**
	 * Sets the descuento.
	 *
	 * @param descuento the new descuento
	 */
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	/**
	 * Gets the impuesto 12.
	 *
	 * @return the impuesto 12
	 */
	@Column(name="IMPUESTO12")
	public Double getImpuesto12() {
		return impuesto12;
	}

	/**
	 * Sets the impuesto 12.
	 *
	 * @param impuesto12 the new impuesto 12
	 */
	public void setImpuesto12(Double impuesto12) {
		this.impuesto12 = impuesto12;
	}

	/**
	 * Gets the impuesto 0.
	 *
	 * @return the impuesto 0
	 */
	@Column(name="IMPUESTO0")
	public Double getImpuesto0() {
		return impuesto0;
	}

	/**
	 * Sets the impuesto 0.
	 *
	 * @param impuesto0 the new impuesto 0
	 */
	public void setImpuesto0(Double impuesto0) {
		this.impuesto0 = impuesto0;
	}
	
	/**
	 * Gets the id empresa cliente.
	 *
	 * @return the id empresa cliente
	 */
	@Column(name="ID_EMPRESA_CLIENTE")
	public String getIdEmpresaCliente() {
		return idEmpresaCliente;
	}
	
	/**
	 * Sets the id empresa cliente.
	 *
	 * @param idEmpresaCliente the new id empresa cliente
	 */
	public void setIdEmpresaCliente(String idEmpresaCliente) {
		this.idEmpresaCliente = idEmpresaCliente;
	}

	/**
	 * Gets the nombre archivo cliente.
	 *
	 * @return the nombre archivo cliente
	 */
	@Column(name="NOMBRE_ARCHIVO_CLIENTE")
	public String getNombreArchivoCliente() {
		return nombreArchivoCliente;
	}

	/**
	 * Sets the nombre archivo cliente.
	 *
	 * @param nombreArchivoCliente the new nombre archivo cliente
	 */
	public void setNombreArchivoCliente(String nombreArchivoCliente) {
		this.nombreArchivoCliente = nombreArchivoCliente;
	}

	/**
	 * Gets the establecimiento.
	 *
	 * @return the establecimiento
	 */
	@Column(name="ESTABLECIMIENTO")
	public String getEstablecimiento() {
		return establecimiento;
	}

	/**
	 * Sets the establecimiento.
	 *
	 * @param establecimiento the new establecimiento
	 */
	public void setEstablecimiento(String establecimiento) {
		this.establecimiento = establecimiento;
	}

	/**
	 * Gets the punto emision.
	 *
	 * @return the punto emision
	 */
	@Column(name="PUNTO_EMISION")
	public String getPuntoEmision() {
		return puntoEmision;
	}

	/**
	 * Sets the punto emision.
	 *
	 * @param puntoEmision the new punto emision
	 */
	public void setPuntoEmision(String puntoEmision) {
		this.puntoEmision = puntoEmision;
	}

	

	/**
	 * Gets the secuencial.
	 *
	 * @return the secuencial
	 */
	@Column(name="SECUENCIAL")
	public String getSecuencial() {
		return secuencial;
	}

	/**
	 * Sets the secuencial.
	 *
	 * @param secuencial the new secuencial
	 */
	public void setSecuencial(String secuencial) {
		this.secuencial = secuencial;
	}
	
		
	
}
