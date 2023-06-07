package com.digytal.myapidoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
@SpringBootApplication
public class MyApiDocApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApiDocApplication.class, args);
	}

	@GetMapping
	public Aluno getAluno() {
		Aluno gleyson = new Aluno("Gleyson", "Sampaio");
		return gleyson;
	}

}

class Aluno {

	private String nome;
	private String sobrenome;

	public Aluno(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
