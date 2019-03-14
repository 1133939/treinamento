package com.stefanini.treinamento.model;

public class Cachorro {
private String nome;
private int idade;

public Cachorro(String nome, int idade) {
	this.nome = nome;
	this.idade = idade;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public void latir() {
	System.out.println("auau");
}
public void correr() {
	System.out.println("vrumm");
}

}
