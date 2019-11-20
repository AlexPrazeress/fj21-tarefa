package br.com.caelum.tarefas.controller;


@Controller
public class OlaMundoController {
	
	@RequestMapping("/olaMundoSpring")
	private String execute() {
		System.out.println("Executando a logica com spring mvc");
		return "ok";
	}

}
