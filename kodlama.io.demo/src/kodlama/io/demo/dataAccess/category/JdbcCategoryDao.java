package kodlama.io.demo.dataAccess.category;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.demo.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	@Override
	public void addCategory(Category category) {
		System.out.println("Added category " + category.getCategoryName());
	}

	@Override
	public void deletedCategory(Category category) {
		System.out.println("Deleted category " + category.getCategoryName());

	}

	@Override
	public List<Category> getList() {
		List<Category> categorys = new ArrayList<>();
		categorys.add(new Category("Software"));
		categorys.add(new Category("Database"));
		return categorys;
	}
}
