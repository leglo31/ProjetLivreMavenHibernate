package gaelo.livres.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gaelo.livres.Livres;
import gaelo.repositories.dao.LivresRepository;

@Controller
public class LivresController {

	@Autowired
	private LivresRepository livreRepository;
	
	@RequestMapping("/livres")
	//public List<Livres> livres(){
		//return livreRepository.findAll();
	public String index(){
		return "livres";
	
	}
	
}
