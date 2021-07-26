package com.example.demo;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.demo.model.AvancadoCategoria;
import com.example.demo.model.AvancadoProduto;
import com.example.demo.model.Cadastro;
import com.example.demo.model.CadastroId;
import com.example.demo.model.TipoCadastro;
import com.example.demo.repository.AvancadoCategoriaRepository;
import com.example.demo.repository.AvancadoProdutoRepository;
import com.example.demo.repository.CadastroRepository;

@SpringBootApplication
public class JavaEstudoJpa2Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaEstudoJpa2Application.class, args);
	}
	
	@Autowired
	private CadastroRepository cadastroRepository;
	
	@EventListener
	public void run(ApplicationReadyEvent event) {
		CadastroId cId = new CadastroId("Ricardo", "3333-3333");
		Cadastro c = new Cadastro();
		c.setCodigo(cId);
		c.setDataCadastro(LocalDate.now());
		c.setFoto(null);
		c.setLongText("apenas um teste");
		c.setTipoCadastro(TipoCadastro.TESTE);
		
		this.cadastroRepository.save(c);
		this.produtoAndCategoria();
		
		Optional<Cadastro> cAux = this.cadastroRepository.findById(new CadastroId("Ricardo", "3333-3333"));
		Optional<Cadastro> cAux2 = this.cadastroRepository.findById(new CadastroId("Ricardo", "3333-3332"));
		
		if(cAux.isPresent()) {
			System.out.print("1 Achou!!");
		}
		if(cAux2.isPresent()) {
			System.out.print("2 Achou!!");
		}
		
	}
	
	@Autowired
	private AvancadoProdutoRepository produtoRepository;
	
	@Autowired
	private AvancadoCategoriaRepository categoriaRepository;
	
	public void produtoAndCategoria() {
		AvancadoCategoria categoria = new AvancadoCategoria();
		categoria.setNome("Bebidas");
		categoria = this.categoriaRepository.save(categoria);
		
		AvancadoProduto p1 = new AvancadoProduto();
		p1.setNome("Refrigerante");
		p1.setCategoria(categoria);
		this.produtoRepository.save(p1);
		
		AvancadoProduto p2 = new AvancadoProduto();
		p2.setNome("Cerveja");
		p2.setCategoria(categoria);
		this.produtoRepository.save(p2);
		
		AvancadoProduto p3 = new AvancadoProduto();
		p3.setNome("Agua");
		p3.setCategoria(categoria);
		this.produtoRepository.save(p3);
	}

}
