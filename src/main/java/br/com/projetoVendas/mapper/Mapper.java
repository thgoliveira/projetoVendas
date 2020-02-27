package br.com.projetoVendas.mapper;

import org.mapstruct.factory.Mappers;

import br.com.projetoVendas.dto.ClienteDTO;
import br.com.projetoVendas.dto.EmpresaDTO;
import br.com.projetoVendas.dto.ProdutoDTO;
import br.com.projetoVendas.dto.VendedorDTO;
import br.com.projetoVendas.model.Cliente;
import br.com.projetoVendas.model.Empresa;
import br.com.projetoVendas.model.Produto;
import br.com.projetoVendas.model.Vendedor;

@org.mapstruct.Mapper
public interface Mapper {
	
	Mapper INSTANCE = Mappers.getMapper(Mapper.class);
	
	ClienteDTO clienteDTO(Cliente cliente);	
	Cliente cliente(ClienteDTO clienteDTO);
	
	EmpresaDTO empresaDTO(Empresa empresa);
	Empresa empresa(EmpresaDTO empresaDTO);
	
	ProdutoDTO produtoDTO(Produto produto);
	Produto produto(ProdutoDTO produtoDTO);
	
	VendedorDTO vendedorDTO(Vendedor vendedor);
	Vendedor vendedor(VendedorDTO vendedorDTO);

}
