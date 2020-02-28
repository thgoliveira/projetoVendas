package br.com.projetoVendas.mapper;

import org.mapstruct.Mapper;

import br.com.projetoVendas.dto.VendedorDTO;
import br.com.projetoVendas.model.Vendedor;

@Mapper(componentModel = "spring")
public interface VendedorMapper {
	
	VendedorDTO toDTO(Vendedor vendedor);
	
	Vendedor toEntity(VendedorDTO vendedorDTO);

}
