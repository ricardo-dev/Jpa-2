package com.example.demo.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AvancadoCategoria;
import com.example.demo.model.AvancadoProduto;
import com.example.demo.model.Cadastro;
import com.example.demo.repository.AvancadoCategoriaRepository;
import com.example.demo.repository.AvancadoProdutoRepository;
import com.example.demo.repository.CadastroRepository;

@RestController
@RequestMapping(value = "/cadastro")
public class CadastroResource {

	@Autowired
	private CadastroRepository cadastroRepository;
	
	@Autowired
	private AvancadoProdutoRepository produtoRepository;
	
	@Autowired
	private AvancadoCategoriaRepository categoriaRepository;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> salvar(@RequestBody @Valid Cadastro cadastro, HttpServletResponse response) {
		Cadastro cadastroSalvo = this.cadastroRepository.save(cadastro);
		return ResponseEntity.status(HttpStatus.CREATED).body(cadastroSalvo);
	}

	
	  @RequestMapping(method=RequestMethod.GET) 
	  public ResponseEntity<?> listar(){
		  List<Cadastro> cadastros = this.cadastroRepository.findAll();
		  return ResponseEntity.ok(cadastros); 
	  }
	  
	  @RequestMapping(method=RequestMethod.GET, value="/produto")
	  public ResponseEntity<?> pegarProdutos(){
			List<AvancadoProduto> pt = this.produtoRepository.findAll();
			return ResponseEntity.ok(pt);
	  }
	  
	  @RequestMapping(method=RequestMethod.GET, value="/produto/{id}")
	  public ResponseEntity<?> pegarProduto(@PathVariable("id") Long id){
			Optional<AvancadoProduto> pt = this.produtoRepository.findById(id);
			return pt.isPresent() ? ResponseEntity.ok(pt) : ResponseEntity.notFound().build();
	  }
	  
	  @RequestMapping(method=RequestMethod.GET, value="/categoria")
	  public ResponseEntity<?> pegarCategorias(){
			List<AvancadoCategoria> ct = this.categoriaRepository.findAll();
			return ResponseEntity.ok(ct);
	  }
}
