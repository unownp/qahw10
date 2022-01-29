package np.qa.lesson9.tests;

import np.qa.lesson9.pages.RegistrationFormPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AutomationPracticeFormTest extends TestBase {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test
    @Tag("properties")
    void practiceFormTest() {
        registrationFormPage.openPage()
                .setFirstName(("Ololo"))
                .setLastName("Pyshpysh")
                .setEmail("realne@chake.com")
                .setGender("Male")
                .setUserNumber(1234567890L)
                .calendarComponent.setDate(1991, "July", 1);

        registrationFormPage.setSubject("Hindi")
                .setHobbies("Sports")
                .uploadFile("src/test/resources/scale_1200.jpg")
                .setAddress("voruyubivay")
                .setState("Uttar")
                .setCity("Agra");

        $("#submit").click();

        checkTable();

    }

    void checkTable() {
        $("#example-modal-sizes-title-lg").shouldBe(visible);
        $(".table-responsive").shouldHave(text("Ololo"), text("Pyshpysh"), text("realne@chake.com"),
                text("Male"), text("1234567890"),
                text("01 July,1991"),
                text("Hindi"), text("Sports"),
                text("scale_1200.jpg"), text("voruyubivay"),
                text("Uttar Pradesh Agra"));

    }
}
