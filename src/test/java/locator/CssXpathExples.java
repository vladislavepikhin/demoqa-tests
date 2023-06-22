package locator;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class CssXpathExples {
    @BeforeEach
    static void beforeeach() {
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 50000;
    }
    void form2test() {
        open("/automation-practice-form");
        String Username = "Ivan";
        String Lastname = "Ivanov";
        String Useremail = "blabla@mail.ru";
        String MobileNumber = "9775750130";
        String UserAdress = "Gorod";
        $("#firstName").setValue(Username);
        $("#lastName").setValue(Lastname);
        $("#userEmail").setValue(Useremail);
        $("#hobbies-checkbox-1").click();
        $("div .subjects-auto-complete__value-container").setValue("e");
        //tut rascrivaushaesya zalupa budet
        $("#react-select-2-option-0").shouldHave(Condition.text("English")).click();
        $("#currentAddress").setValue(UserAdress);
        $("div .css-1wa3eu0-placeholder").click();
        $("#react-select-3-option-1").shouldHave(Condition.text("Uttar Pradesh")).click();
        $("div . css-1hwfws3").setValue("a");
        $("div . css-1n7v3ny-option").shouldHave(Condition.text("Agra")).click();
        $("#file-upload").uploadFile(new File("src/test/data/alien_pop_-bit_horror_vinyl_figure_alie" +
                "n__cm-0.750x0.jpg"));
        $("#uploadPicture").click();





    }
}
