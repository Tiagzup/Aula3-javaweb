package com.br.face.zup.models;

public class PostagemModel {
	private String foto;
	private String usuario;
	private String postagem;
	
	public PostagemModel (){
		
	}
	public PostagemModel (String foto, String usuario, String postagem) {
		this.foto = foto;
		this.usuario = usuario;
		this.postagem = postagem;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getPostagem() {
		return postagem;
	}
	public void setPostagem(String postagem) {
		this.postagem = postagem;
	}
	public String getUsuario() {
		return usuario;
	}
	public String setUsuario() {
		return usuario;
	}
	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		
		modelo.append("Usuario: " + this.usuario);
		modelo.append("\n");
		modelo.append("Postou: " + this.postagem);
		
		return modelo.toString();
	}
	
}















































