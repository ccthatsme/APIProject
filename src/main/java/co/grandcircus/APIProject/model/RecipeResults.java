package co.grandcircus.APIProject.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipeResults {

	private String href;
	@JsonProperty("results")
	private List<Recipe> recipes;
}
