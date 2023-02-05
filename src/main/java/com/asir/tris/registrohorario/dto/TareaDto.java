package com.asir.tris.registrohorario.dto;

import java.util.Date;

public class TareaDto {
	private Long idTarea;
	private String nombreTarea;
	private Long idTipoTarea;
	private String nombreTipoTarea;
	private Date fechaInicio;
	private Date fechafin;
	private Long activo;
	private Long idUsuario;
	private Long tiempo;
	private String comentarios;
	private Date fecha;
	
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Long getIdTarea() {
		return idTarea;
	}
	public void setIdTarea(Long idTarea) {
		this.idTarea = idTarea;
	}
	public String getNombreTarea() {
		return nombreTarea;
	}
	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
	}
	public Long getIdTipoTarea() {
		return idTipoTarea;
	}
	public void setIdTipoTarea(Long idTipoTarea) {
		this.idTipoTarea = idTipoTarea;
	}
	public String getNombreTipoTarea() {
		return nombreTipoTarea;
	}
	public void setNombreTipoTarea(String nombreTipoTarea) {
		this.nombreTipoTarea = nombreTipoTarea;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechafin() {
		return fechafin;
	}
	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}
	public Long getActivo() {
		return activo;
	}
	public void setActivo(Long activo) {
		this.activo = activo;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Long getTiempo() {
		return tiempo;
	}
	public void setTiempo(Long tiempo) {
		this.tiempo = tiempo;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

}
