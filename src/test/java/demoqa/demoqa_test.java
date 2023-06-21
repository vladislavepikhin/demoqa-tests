package demoqa;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class    demoqa_test {
    @Test
    void form1test() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Vladislav Epikhin");
        $("#userEmail").setValue("blablabla@mail.ru");
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("Tushino");
        $("#submit").click();
        $("#output").shouldBe(visible);
    }
}
