package co.grandcircus.APIProject.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.grandcircus.APIProject.model.RecipeResults;

@Controller
public class RecipeController {

	RestTemplate rt = new RestTemplate();
	ObjectMapper objMap = new ObjectMapper();

	@RequestMapping("/")
	public ModelAndView home() {
		String url = "http://www.recipepuppy.com/api/";

		String recipe = rt.getForObject(url, String.class);
		recipe = recipe.replace("\\/", "/");
		ModelAndView mv = new ModelAndView("index", "test", recipe);
		try {
			RecipeResults parent = objMap.readValue(recipe, RecipeResults.class);
			mv.addObject("parentObj", parent);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}

//		mv.addObject("results", parent);
		return mv;
	}

	@RequestMapping("Search")
	public ModelAndView search(@RequestParam(name = "search-word", required = false) String word, @RequestParam(name = "search-ingredient", required = false) String ingredient) {
		ModelAndView mv = new ModelAndView();

		return mv;
	}

}
