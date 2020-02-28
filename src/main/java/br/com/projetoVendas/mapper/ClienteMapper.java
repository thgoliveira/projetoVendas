package br.com.projetoVendas.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import br.com.projetoVendas.dto.ClienteDTO;
import br.com.projetoVendas.model.Cliente;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

	ClienteDTO toDTO(Cliente cliente);	
	
	Cliente toEntity(ClienteDTO clienteDTO);
	
	List<ClienteDTO> toListDTO(List<Cliente> cliente);
	
	List<Cliente> toListEntity(List<ClienteDTO> clienteDTO);
	
}
