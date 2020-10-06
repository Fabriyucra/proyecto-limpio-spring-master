package ar.edu.unlam.tallerweb1.controladores;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Categoria;

@Controller
public class ControladorCategoria {
	
	@RequestMapping(path = "/inicio", method = RequestMethod.GET)
	public ModelAndView irACategoria(@ModelAttribute("categoria") Categoria categoria, HttpServletRequest request) {
		ModelMap modelo = new ModelMap();		
		Categoria restaurante = new Categoria ("Restaurante", "Comidas en diversos restaurantes");
		Categoria spa = new Categoria ("Spa", "Servicios de spa");
		Categoria actividades = new Categoria("Actividades", "Actividades para realizar al aire libre");
		modelo.put("categoriaVista", categoria);
		return new ModelAndView("login", modelo);
	}
}
