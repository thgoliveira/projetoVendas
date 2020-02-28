package br.com.projetoVendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.projetoVendas.dto.ClienteDTO;
import br.com.projetoVendas.exceptions.NotFoundException;
import br.com.projetoVendas.mapper.ClienteMapper;
import br.com.projetoVendas.model.Cliente;
import br.com.projetoVendas.repository.ClienteRepository;

public class ClienteService {
	
	@Autowired
	private ClienteMapper mapper;
	
	@Autowired
	private ClienteRepository repository;
	
	public List<ClienteDTO> buscarTodos(){
		List<Cliente> lista = repository.findAll();
		
		if(lista.isEmpty()) {
			throw new NotFoundException("Nenhum registro encontrado!");
		}
		
		return mapper.toListDTO(lista);
	}
	

}
