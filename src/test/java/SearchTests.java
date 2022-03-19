import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {

    @Test
    void selenideSearchTest() {
        // Открыть https://google.com.
        open("https://google.com");

        // Ввести "Selenide" в поле поиска.
        $("[name=q]").setValue("selenide").pressEnter();

        // Проверить, что "selenide.org" появилось в результатах поиска.
        $("[id=search]").shouldHave(text("selenide.org"));
    }
}
