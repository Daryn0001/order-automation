package kz.sdu.stu.dsalimov.register;

import kz.sdu.stu.dsalimov.dto.db.Dish;
import kz.sdu.stu.dsalimov.dto.filter.DishFilter;

import java.util.List;

public interface DishRegister {
    List<Dish> getDishes();

    Dish findById(String uuid);

    List<Dish> getDishesByEvent(String uuid);

    List<Object> getDishesByFilter(DishFilter filter);

    List<Dish> getDishesByCategory(int categoryId);

    void insert(Dish dish);

    void delete(String uuid);

    void update(String uuid, Dish dish);

    void updateTitle(String uuid, String title);

    void updateDescription(String uuid, String description);

    void updatePicture(String uuid, String pictures);

    void updateIngredients(String uuid, String ingredients);

    void updateAmount(String uuid, int amount);

    void updateNotes(String uuid, String notes);

    void updateCategoryId(String uuid, int category_id);
}
