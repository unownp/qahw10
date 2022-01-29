package np.qa.lesson10.pages;

import com.codeborne.selenide.SelenideElement;
import np.qa.lesson10.pages.components.CalendarComponent;
import np.qa.lesson10.pages.components.FixedBanComponent;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormPage {

    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderRadio = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),

    subjectInput = $("#subjectsInput"),


    hobbiesCheckbox = $("#hobbiesWrapper"),

    uploadPictureButton = $("#uploadPicture"),


    currentAddressInput = $("#currentAddress"),
            stateInput = $("#react-select-3-input"),
            cityInput = $("#react-select-4-input"),
            submitButton = $("#submit");

    public String relativeUrl = "/automation-practice-form";


    public CalendarComponent calendarComponent = new CalendarComponent();
    public FixedBanComponent fixedBanComponent = new FixedBanComponent();

    public RegistrationFormPage openPage() {
        open(relativeUrl);
        fixedBanComponent.closeFixedBan();
        return this;
    }

    public RegistrationFormPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);

        return this;
    }

    public RegistrationFormPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);

        return this;
    }

    public RegistrationFormPage setEmail(String email) {
        emailInput.setValue(email);

        return this;
    }

    public RegistrationFormPage setGender(String gender) {
        genderRadio.$(byText(gender)).click();

        return this;
    }

    public RegistrationFormPage setUserNumber(Long phone) {
        userNumberInput.setValue(phone.toString());

        return this;
    }

    public RegistrationFormPage setSubject(String subjectPart) {
        subjectInput.setValue(subjectPart).pressEnter();

        return this;
    }

    public RegistrationFormPage setHobbies(String hobby) {
        hobbiesCheckbox.$(byText(hobby)).click();

        return this;
    }

    public RegistrationFormPage uploadFile(String path) {
        uploadPictureButton.uploadFile(new File(path));

        return this;
    }

    public RegistrationFormPage setAddress(String address) {
        currentAddressInput.setValue(address);

        return this;
    }


    public RegistrationFormPage setState(String statePart) {
        stateInput.setValue(statePart).pressEnter();
        return this;
    }

    public RegistrationFormPage setCity(String cityPart) {
        cityInput.setValue(cityPart).pressEnter();

        return this;
    }

}
