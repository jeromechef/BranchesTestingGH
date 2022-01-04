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
}
