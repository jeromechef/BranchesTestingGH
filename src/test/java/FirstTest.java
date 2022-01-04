import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.nio.channels.Selector;

import static com.codeborne.selenide.Selenide.$;

public class FirstTest {
    @Test
    void yandexSearchOpen() {
        Selenide.open("https://yandex.ru");
        $(Selectors.byText("Accept")).click();
    }

    @Test
    void googleSearchOpen() {
        Selenide.open("https://google.com");
        $(Selectors.byText("I agree")).click();
    }

    @Test
    void bingSearchOpen() {
        Selenide.open("https://bing.com");
        $(Selectors.byText("Accept")).click();
    }
}
