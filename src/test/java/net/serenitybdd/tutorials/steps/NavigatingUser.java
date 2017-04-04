package net.serenitybdd.tutorials.steps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.tutorials.model.Category;
import net.serenitybdd.tutorials.ui.CategoryNavigationBar;
import net.serenitybdd.tutorials.ui.CurrentPage;
import net.serenitybdd.tutorials.ui.EbayHomePage;
import net.thucydides.core.annotations.Step;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by FlavianDurigu on 4/4/2017.
 */

public class NavigatingUser {

    EbayHomePage ebayHomePage;
    CurrentPage currentPage;
    CategoryNavigationBar categoryNavigationBar;

    @Step("Mark is on the home page")
    public void isOnTheHomePage() {
        ebayHomePage.open();
    }

    @Step
    public void shouldSeePageTitleContaining(String expectedTitle) {
        assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
    }

    @Step
    public void navigatesToCategory(Category category) {
        categoryNavigationBar.selectCategory(category);
    }
}
