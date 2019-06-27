package com.br.face.zup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.face.zup.models.PostagemModel;
import com.br.face.zup.services.PostagemService;

@Controller
public class PostagemController {
	
	@Autowired
	private PostagemService postagemService;
	
	//método get retorna a lista de post
	@GetMapping
	public ModelAndView  mostrarPostagens(){
		ModelAndView modelAndView = new ModelAndView("postagens.html");
		modelAndView.addObject("postagens", postagemService.retornarPostagens());
		return modelAndView;
	}
	//Método Post salvar a infos da lista
	@PostMapping
	public String salvarPostagem(PostagemModel postagemModel) {
		postagemService.salvarPostagem(postagemModel);
		return "redirect:/";
	}
	
}
