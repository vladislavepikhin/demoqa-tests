package demoqa;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class demoqa_test {
    @BeforeAll
    static void beforeall() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 50000;
    }
    @Test
    void form1test() {
        String useremail = "blablabla@mail.ru";
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Vladislav Epikhin");
        $("#userEmail").setValue(useremail);
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("Tushino");
        $("#submit").click();
        $("#output").shouldBe(visible);
        $("div #output").$("#name").shouldHave(text("Vladislav Epikhin"));
    }
}
