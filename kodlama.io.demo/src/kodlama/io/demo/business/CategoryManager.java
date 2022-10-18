package kodlama.io.demo.business;

import java.util.List;

import kodlama.io.demo.core_logging.Logger;
import kodlama.io.demo.dataAccess.category.CategoryDao;
import kodlama.io.demo.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private List<Logger> loggers;

	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void saved(Category category) {
		List<Category> categorys = categoryDao.getList();
		
		for(Category category1 : categorys) {
			if(category1.getCategoryName().equals(category.getCategoryName())) {
				System.out.println("category name must be undefined");
				return;
			}
		
		}
		categoryDao.addCategory(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
