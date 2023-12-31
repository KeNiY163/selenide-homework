package selenidetest;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestGitSolution {

    @Test
    void testGitSolution(){

        open("https://github.com/");

        $(".header-menu-wrapper").$(byText("Solutions")).hover();

        $(".header-menu-wrapper").$(byText("Enterprise")).click();

        $(".application-main h1").shouldHave(Condition.text("Build like the best"));


    }


}
