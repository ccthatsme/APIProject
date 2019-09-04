package co.grandcircus.APIProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String href;
	private String ingredients;
	private String thumbnail;
	
	public Recipe() {
		super();
	}

	public Recipe(Long id, String title, String href, String ingredients, String thumbnail) {
		super();
		this.id = id;
		this.title = title;
		this.href = href;
		this.ingredients = ingredients;
		this.thumbnail = thumbnail;
	}

	public Recipe(String title, String href, String ingredients, String thumbnail) {
		super();
		this.title = title;
		this.href = href;
		this.ingredients = ingredients;
		this.thumbnail = thumbnail;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Recipe [id=" + id + ", title=" + title + ", href=" + href + ", ingredients=" + ingredients
				+ ", thumbnail=" + thumbnail + "]";
	}
	
	
}
