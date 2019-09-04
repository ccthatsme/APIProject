package co.grandcircus.APIProject.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.grandcircus.APIProject.model.Recipe;
import co.grandcircus.APIProject.model.RecipeResults;
import co.grandcircus.APIProject.repo.RecipeRepo;

@Controller
public class RecipeController {

	@Autowired
	private RecipeRepo recipeRepo;
	
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
			mv.addObject("recipeList", parent.getRecipes());
			
			for(Recipe r: parent.getRecipes()) {
				if(!recipeRepo.existsByHref(r.getHref())) {
					recipeRepo.save(r);
				}
			}
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
		ModelAndView mv = new ModelAndView("search-results");

		if(word != null && !word.equals("")) {
			List<Recipe> results = recipeRepo.searchByKeyWord(word);
			mv.addObject("results", results);
			System.out.println();
		} else {
			System.out.println("Empty list");
		}
		return mv;
	}

}
