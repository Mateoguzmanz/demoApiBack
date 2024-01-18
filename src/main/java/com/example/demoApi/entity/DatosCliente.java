package com.example.demoApi.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DatosCliente {

    @Schema(description = "Tipo Nit del Cliente ", example = "Cedula de Ciudadania")
    private String Nit;
    @Id
    @Schema(description = "Número de documento", example = "1010943765")
    private String numeroDocumento;
    @Schema(description = "Nombre completo o Razon Social", example = "Example S.A")
    private String nombreYApellido;
    @Schema(description = "Direccion completa", example = "CRA 15 NO. 47 - 20")
    private String direccion;
    @Schema(description = "Ciudad", example = "Medellin")
    private String ciudad;
    @Schema(description = "Telefono", example = "3224567678")
    private String telefono;
    @Schema(description = "Correo", example = "correo@example.com")
    private String correo;

    private String direccionIp;
    private String protocoloDeConexion;
    private String nombreConexion;
    private String seguridadRed;
    private String canalDeComunicacion;

    private boolean isPickUpSelected;

    private String puertoConexion;

    private boolean isPagosSelected;
    private String pendientePago;
    private String procesadoPago;
    private String respuestaPago;

    private boolean isMulticashSelected;
    private String destinoMulticash;

    private boolean isFactoringSelected;
    private String pendienteFactoring;
    private String respuestaFactoring;
    private String documentoFactoring;

    private boolean isExtractosSelected;
    private String destinoExtractos;

    private String isRecaudosEntradaSelected;
    private String rutaRespuestaRecaudosEntrada;

    private String isRecaudosSalidaSelected;
    private String rutaArchivoRecaudosSalida;

    private String mecanismosDeSeguridad;
    private String asignarUsuario;
    private String asignarClave;

    private String archivoRespuesta;
    private int archivosEnviar;

    private String usuarioDos;
    private String usuarioTres;
    private String usuarioUno;

    private String observaciones;

    public DatosCliente(String nit, String numeroDocumento, String nombreYApellido, String direccion, String ciudad, String telefono, String correo, String direccionIp, String protocoloDeConexion, String nombreConexion, String seguridadRed, String canalDeComunicacion, boolean isPickUpSelected, String puertoConexion, boolean isPagosSelected, String pendientePago, String procesadoPago, String respuestaPago, boolean isMulticashSelected, String destinoMulticash, boolean isFactoringSelected, String pendienteFactoring, String respuestaFactoring, String documentoFactoring, boolean isExtractosSelected, String destinoExtractos, String isRecaudosEntradaSelected, String rutaRespuestaRecaudosEntrada, String isRecaudosSalidaSelected, String rutaArchivoRecaudosSalida, String mecanismosDeSeguridad, String asignarUsuario, String asignarClave, String archivoRespuesta, int archivosEnviar, String usuarioDos, String usuarioTres, String usuarioUno, String observaciones) {
        Nit = nit;
        this.numeroDocumento = numeroDocumento;
        this.nombreYApellido = nombreYApellido;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.correo = correo;
        this.direccionIp = direccionIp;
        this.protocoloDeConexion = protocoloDeConexion;
        this.nombreConexion = nombreConexion;
        this.seguridadRed = seguridadRed;
        this.canalDeComunicacion = canalDeComunicacion;
        this.isPickUpSelected = isPickUpSelected;
        this.puertoConexion = puertoConexion;
        this.isPagosSelected = isPagosSelected;
        this.pendientePago = pendientePago;
        this.procesadoPago = procesadoPago;
        this.respuestaPago = respuestaPago;
        this.isMulticashSelected = isMulticashSelected;
        this.destinoMulticash = destinoMulticash;
        this.isFactoringSelected = isFactoringSelected;
        this.pendienteFactoring = pendienteFactoring;
        this.respuestaFactoring = respuestaFactoring;
        this.documentoFactoring = documentoFactoring;
        this.isExtractosSelected = isExtractosSelected;
        this.destinoExtractos = destinoExtractos;
        this.isRecaudosEntradaSelected = isRecaudosEntradaSelected;
        this.rutaRespuestaRecaudosEntrada = rutaRespuestaRecaudosEntrada;
        this.isRecaudosSalidaSelected = isRecaudosSalidaSelected;
        this.rutaArchivoRecaudosSalida = rutaArchivoRecaudosSalida;
        this.mecanismosDeSeguridad = mecanismosDeSeguridad;
        this.asignarUsuario = asignarUsuario;
        this.asignarClave = asignarClave;
        this.archivoRespuesta = archivoRespuesta;
        this.archivosEnviar = archivosEnviar;
        this.usuarioDos = usuarioDos;
        this.usuarioTres = usuarioTres;
        this.usuarioUno = usuarioUno;
        this.observaciones = observaciones;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String nit) {
        Nit = nit;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccionIp() {
        return direccionIp;
    }

    public void setDireccionIp(String direccionIp) {
        this.direccionIp = direccionIp;
    }

    public String getProtocoloDeConexion() {
        return protocoloDeConexion;
    }

    public void setProtocoloDeConexion(String protocoloDeConexion) {
        this.protocoloDeConexion = protocoloDeConexion;
    }

    public String getNombreConexion() {
        return nombreConexion;
    }

    public void setNombreConexion(String nombreConexion) {
        this.nombreConexion = nombreConexion;
    }

    public String getSeguridadRed() {
        return seguridadRed;
    }

    public void setSeguridadRed(String seguridadRed) {
        this.seguridadRed = seguridadRed;
    }

    public String getCanalDeComunicacion() {
        return canalDeComunicacion;
    }

    public void setCanalDeComunicacion(String canalDeComunicacion) {
        this.canalDeComunicacion = canalDeComunicacion;
    }

    public boolean isPickUpSelected() {
        return isPickUpSelected;
    }

    public void setPickUpSelected(boolean pickUpSelected) {
        isPickUpSelected = pickUpSelected;
    }

    public String getPuertoConexion() {
        return puertoConexion;
    }

    public void setPuertoConexion(String puertoConexion) {
        this.puertoConexion = puertoConexion;
    }

    public boolean isPagosSelected() {
        return isPagosSelected;
    }

    public void setPagosSelected(boolean pagosSelected) {
        isPagosSelected = pagosSelected;
    }

    public String getPendientePago() {
        return pendientePago;
    }

    public void setPendientePago(String pendientePago) {
        this.pendientePago = pendientePago;
    }

    public String getProcesadoPago() {
        return procesadoPago;
    }

    public void setProcesadoPago(String procesadoPago) {
        this.procesadoPago = procesadoPago;
    }

    public String getRespuestaPago() {
        return respuestaPago;
    }

    public void setRespuestaPago(String respuestaPago) {
        this.respuestaPago = respuestaPago;
    }

    public boolean isMulticashSelected() {
        return isMulticashSelected;
    }

    public void setMulticashSelected(boolean multicashSelected) {
        isMulticashSelected = multicashSelected;
    }

    public String getDestinoMulticash() {
        return destinoMulticash;
    }

    public void setDestinoMulticash(String destinoMulticash) {
        this.destinoMulticash = destinoMulticash;
    }

    public boolean isFactoringSelected() {
        return isFactoringSelected;
    }

    public void setFactoringSelected(boolean factoringSelected) {
        isFactoringSelected = factoringSelected;
    }

    public String getPendienteFactoring() {
        return pendienteFactoring;
    }

    public void setPendienteFactoring(String pendienteFactoring) {
        this.pendienteFactoring = pendienteFactoring;
    }

    public String getRespuestaFactoring() {
        return respuestaFactoring;
    }

    public void setRespuestaFactoring(String respuestaFactoring) {
        this.respuestaFactoring = respuestaFactoring;
    }

    public String getDocumentoFactoring() {
        return documentoFactoring;
    }

    public void setDocumentoFactoring(String documentoFactoring) {
        this.documentoFactoring = documentoFactoring;
    }

    public boolean isExtractosSelected() {
        return isExtractosSelected;
    }

    public void setExtractosSelected(boolean extractosSelected) {
        isExtractosSelected = extractosSelected;
    }

    public String getDestinoExtractos() {
        return destinoExtractos;
    }

    public void setDestinoExtractos(String destinoExtractos) {
        this.destinoExtractos = destinoExtractos;
    }

    public String getIsRecaudosEntradaSelected() {
        return isRecaudosEntradaSelected;
    }

    public void setIsRecaudosEntradaSelected(String isRecaudosEntradaSelected) {
        this.isRecaudosEntradaSelected = isRecaudosEntradaSelected;
    }

    public String getRutaRespuestaRecaudosEntrada() {
        return rutaRespuestaRecaudosEntrada;
    }

    public void setRutaRespuestaRecaudosEntrada(String rutaRespuestaRecaudosEntrada) {
        this.rutaRespuestaRecaudosEntrada = rutaRespuestaRecaudosEntrada;
    }

    public String getIsRecaudosSalidaSelected() {
        return isRecaudosSalidaSelected;
    }

    public void setIsRecaudosSalidaSelected(String isRecaudosSalidaSelected) {
        this.isRecaudosSalidaSelected = isRecaudosSalidaSelected;
    }

    public String getRutaArchivoRecaudosSalida() {
        return rutaArchivoRecaudosSalida;
    }

    public void setRutaArchivoRecaudosSalida(String rutaArchivoRecaudosSalida) {
        this.rutaArchivoRecaudosSalida = rutaArchivoRecaudosSalida;
    }

    public String getMecanismosDeSeguridad() {
        return mecanismosDeSeguridad;
    }

    public void setMecanismosDeSeguridad(String mecanismosDeSeguridad) {
        this.mecanismosDeSeguridad = mecanismosDeSeguridad;
    }

    public String getAsignarUsuario() {
        return asignarUsuario;
    }

    public void setAsignarUsuario(String asignarUsuario) {
        this.asignarUsuario = asignarUsuario;
    }

    public String getAsignarClave() {
        return asignarClave;
    }

    public void setAsignarClave(String asignarClave) {
        this.asignarClave = asignarClave;
    }

    public String getArchivoRespuesta() {
        return archivoRespuesta;
    }

    public void setArchivoRespuesta(String archivoRespuesta) {
        this.archivoRespuesta = archivoRespuesta;
    }

    public int getArchivosEnviar() {
        return archivosEnviar;
    }

    public void setArchivosEnviar(int archivosEnviar) {
        this.archivosEnviar = archivosEnviar;
    }

    public String getUsuarioDos() {
        return usuarioDos;
    }

    public void setUsuarioDos(String usuarioDos) {
        this.usuarioDos = usuarioDos;
    }

    public String getUsuarioTres() {
        return usuarioTres;
    }

    public void setUsuarioTres(String usuarioTres) {
        this.usuarioTres = usuarioTres;
    }

    public String getUsuarioUno() {
        return usuarioUno;
    }

    public void setUsuarioUno(String usuarioUno) {
        this.usuarioUno = usuarioUno;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}


