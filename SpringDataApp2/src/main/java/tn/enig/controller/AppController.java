package tn.enig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import tn.enig.dao.IMagasin;
import tn.enig.dao.IProduit;
import tn.enig.model.Magasin;
import tn.enig.model.Produit;

@Controller
public class AppController {
	@Autowired
	private IMagasin daoMagasin;
	public void setDao(IMagasin daoMagasin) {
		this.daoMagasin = daoMagasin;
	}
	
	
	@Autowired
	private IProduit daoProduit;
	public void setDaoProduit(IProduit daoProduit) {
		this.daoProduit = daoProduit;
	}
	@GetMapping("/home")
	public String home(Model m) {
		
		List<Produit> listep=daoProduit.findAll();
		List<Magasin> listem=daoMagasin.findAll();
		m.addAttribute("listeMagasin", listem);
		m.addAttribute("listeProduit", listep);
		return "Home";
		
	}
	@GetMapping("/addProduct")
	public String addProduct(Model m) {
		List<Magasin> liste=daoMagasin.findAll();
		Produit p=new Produit();
		m.addAttribute("produit", p);
		m.addAttribute("listeMagasin", liste);
		
		return "AddProd";
		
	}
	@PostMapping("/ajouterProduct")
	public String ajouterProduct(Model m,@ModelAttribute("produit") Produit produit) {
		daoProduit.save(produit);
		return "redirect:/AddProd";
		
	}
	
	@GetMapping("/listeProduits/{idm}")
	public String productsList(Model m,@PathVariable int idm) {
		List<Produit> liste=daoProduit.findByIdMagasin(idm);
		m.addAttribute("listeProduit", liste);
		return "ListeProd";
		
	}

}
