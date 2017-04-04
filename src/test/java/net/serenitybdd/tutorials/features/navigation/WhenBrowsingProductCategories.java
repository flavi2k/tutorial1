package net.serenitybdd.tutorials.features.navigation;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.tutorials.model.Category;
import net.serenitybdd.tutorials.steps.NavigatingUser;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.serenitybdd.tutorials.model.Category.Motors;

/**
 * Created by FlavianDurigu on 4/4/2017.
 */
@RunWith(SerenityRunner.class)
public class WhenBrowsingProductCategories {

    @Steps
    NavigatingUser mark;

    @Managed(driver="chrome")
    WebDriver browser;

   /* @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "D://KIT//chromedriver.exe");
        browser = new ChromeDriver();
    }*/

    @Test
    public void shouldBeAbleToNavigateToTheMotorsCategory() {
        // Given
        mark.isOnTheHomePage();

        // When
        mark.navigatesToCategory(Motors);

        // Then
        mark.shouldSeePageTitleContaining("New & used cars");
    }
}