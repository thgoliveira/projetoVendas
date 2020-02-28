package br.com.projetoVendas.mapper;

import org.mapstruct.Mapper;

import br.com.projetoVendas.dto.EmpresaDTO;
import br.com.projetoVendas.model.Empresa;

@Mapper(componentModel = "spring")
public interface EmpresaMapper {
	
	EmpresaDTO toDTO(Empresa empresa);
	
	Empresa toEntity(EmpresaDTO empresaDTO);

}
