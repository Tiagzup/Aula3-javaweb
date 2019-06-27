package com.br.face.zup.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.br.face.zup.models.PostagemModel;

@Service
public class PostagemService {
	
	private Map<Integer, PostagemModel> postagens = new HashMap<Integer, PostagemModel>(){{
	put(1, new PostagemModel("http://www.folhavitoria.com.br/entretenimento/blogs/receitas-do-chef/wp-content/uploads/2018/05/pudim-1-1200x800.png",
			"Tiago", "A melhor sobremesa do mundo"));	
	}};
		
	
	public Collection<PostagemModel> retornarPostagens(){
		return this.postagens.values();
		
	}
	//Método para salvar postagens
	public void salvarPostagem( PostagemModel postagemModel) {
		postagens.put(postagens.size()+1, postagemModel);
	}
	
}
