import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class FirstTest {
    @Test
    void yandexSearchOpen() {
        open("https://yandex.ru");
        $(byText("Accept")).click();
    }

    @Test
    void googleSearchOpen() {
        open("https://google.com");
        $(byText("I agree")).click();
    }

    @Test
    void bingSearchOpen() {
        open("https://bing.com");
        $(byText("Accept")).click();
    }
}
