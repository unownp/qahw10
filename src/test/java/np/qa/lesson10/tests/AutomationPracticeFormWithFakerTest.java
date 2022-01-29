package np.qa.lesson10.tests;

import np.qa.lesson10.pages.RegistrationFormPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static np.qa.lesson10.tests.TestData.*;

public class AutomationPracticeFormWithFakerTest extends TestBase {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test
        void practiceFormTestWithFaker() {
        registrationFormPage.openPage()
                .setFirstName((firstName))
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setUserNumber(Long.parseLong(number))
                .calendarComponent.setDate(year, month, day);

        registrationFormPage.setSubject(subject)
                .setHobbies(hobby)
                .uploadFile("src/test/resources/scale_1200.jpg")
                .setAddress(address)
                .setState(state)
                .setCity(city);

        $("#submit").click();

        checkTable();

    }

    void checkTable() {
        $("#example-modal-sizes-title-lg").shouldBe(visible);
        $(".table-responsive").shouldHave(text(firstName), text(lastName), text(email),
                text(gender), text(number),
                text(day+" "+month+","+year),
                text(subject), text(hobby),
                text("scale_1200.jpg"), text(address),
                text(state+" "+city));

    }
}
