package selenidetest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class TestDragAndDrop {


    @Test
    void testDragAndDropAction(){

        open("https://the-internet.herokuapp.com/drag_and_drop");

        SelenideElement A = $("#column-a");
        SelenideElement B = $("#column-b");

        actions().clickAndHold(A).moveToElement(B).release().perform();

        $("#column-a header").shouldHave(Condition.text("B"));
        $("#column-a header").shouldHave(Condition.text("A"));

    }

    @Test
    void testDragAndDropSelenide(){

        open("https://the-internet.herokuapp.com/drag_and_drop");

        SelenideElement A = $("#column-a").shouldHave(Condition.text("A"));
        SelenideElement B = $("#column-b").shouldHave(Condition.text("B"));

        A.dragAndDropTo(B);

        $("#column-a header").shouldHave(Condition.text("B"));
        $("#column-b header").shouldHave(Condition.text("A"));

    }

}
