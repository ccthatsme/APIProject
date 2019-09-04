package co.grandcircus.APIProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.APIProject.model.Recipe;

public interface RecipeRepo extends JpaRepository<Recipe, Long> {

	boolean existsByHref(String href);
}
