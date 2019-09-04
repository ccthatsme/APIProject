package co.grandcircus.APIProject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.grandcircus.APIProject.model.Recipe;

public interface RecipeRepo extends JpaRepository<Recipe, Long> {

	boolean existsByHref(String href);

	@Query(value = "select * from recipe where title like %?%", nativeQuery = true)
	List<Recipe> searchByKeyWord(String recipeName);
	
	@Query(value = "select * from recipe where ingredients like %?%", nativeQuery = true)
	List<Recipe> searchByIngredient(String ingredient);
}
