package br.com.projetoVendas.mapper;

import org.mapstruct.Mapper;

import br.com.projetoVendas.dto.ProdutoDTO;
import br.com.projetoVendas.model.Produto;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {
	
	ProdutoDTO toDTO(Produto produto);
	
	Produto toEntity(ProdutoDTO produtoDTO);

}
