package com.springboot.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.application.model.Usuario;
import com.springboot.application.repository.UsuarioRepository;

@SpringBootTest
class ProjetoBasicoApplicationTests {

	@Test
	void testarCadastro() {
		UsuarioRepository usuarioRepository ;
		Usuario usuario = new Usuario();
		
		usuario.setNome("vuribi");
		usuario.setEmail("asdas@gmail.com");
		usuario.setFilial("arcoverde");
		usuario.setSetor("pedrada");
		
		System.out.printf("teste " + usuario.getNome());
		System.out.printf("teste 2" + usuario.getEmail());
		
		Assertions.assertTrue(usuario.getNome().equals("vuribi"));
		Assertions.assertTrue(usuario.getEmail().equals("asdas@gmail.co"));
		Assertions.assertTrue(usuario.getFilial().equals("arcoverde"));
		Assertions.assertTrue(usuario.getSetor().equals("pedrada"));
		
	}
	

}
