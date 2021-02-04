package com.krm.tirinhas.model;

public class Tirinha {

	private int num;
	private String titulo;
	private String link;
	private String imagem;

	public Tirinha(int num, String titulo, String link, String imagem) {
		this.num = num;
		this.titulo = titulo;
		this.link = link;
		this.imagem = imagem;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

}
