package kodlama.io.demo.dataAccess.category;

import java.util.List;

import kodlama.io.demo.entities.Category;

public interface CategoryDao {
	public void addCategory(Category category);

	public void deletedCategory(Category category);

	List<Category> getList();
}
