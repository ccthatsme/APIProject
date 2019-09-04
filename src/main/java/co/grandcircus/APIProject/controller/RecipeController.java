package co.grandcircus.APIProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RecipeController {
	
	RestTemplate rt = new RestTemplate();
	
	@RequestMapping("/")
	public ModelAndView home() {
		String url = "http://www.recipepuppy.com/api/";
		
		String recipe = rt.getForObject(url, String.class);
//		RecipeResults parent = rt.getForObject(url, RecipeResults.class);
		ModelAndView mv = new ModelAndView("index", "test", recipe);
//		mv.addObject("results", parent);
		return mv;
	}
	
}
