package com.asir.tris.registrohorario.dto;

import java.util.ArrayList;
import java.util.List;

public class ProyectoDto {
	private Long idProyecto;
	private String nombreProyecto;
	private Long idTipoProyecto;
	private String nombreTipoProyecto;
	private List<TareaDto> lstTareaDto;
	
	public ProyectoDto() {
		lstTareaDto = new ArrayList<>();
	}
	public Long getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(Long idProyecto) {
		this.idProyecto = idProyecto;
	}
	public String getNombreProyecto() {
		return nombreProyecto;
	}
	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}
	public Long getIdTipoProyecto() {
		return idTipoProyecto;
	}
	public void setIdTipoProyecto(Long idTipoProyecto) {
		this.idTipoProyecto = idTipoProyecto;
	}
	public String getNombreTipoProyecto() {
		return nombreTipoProyecto;
	}
	public void setNombreTipoProyecto(String nombreTipoProyecto) {
		this.nombreTipoProyecto = nombreTipoProyecto;
	}
	public List<TareaDto> getLstTareaDto() {
		return lstTareaDto;
	}
	public void setLstTareaDto(List<TareaDto> lstTareaDto) {
		this.lstTareaDto = lstTareaDto;
	}
	
	
	
	
}
