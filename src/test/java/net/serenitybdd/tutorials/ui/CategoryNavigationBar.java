package net.serenitybdd.tutorials.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.tutorials.model.Category;

/**
 * Created by FlavianDurigu on 4/4/2017.
 */
public class CategoryNavigationBar extends PageObject{
    public void selectCategory(Category category) {
        $("[role=list]").find(By.linkText(category.name())).click();
    }
}
