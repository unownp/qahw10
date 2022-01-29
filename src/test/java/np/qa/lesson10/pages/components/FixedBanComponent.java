package np.qa.lesson10.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class FixedBanComponent {
    SelenideElement closingFixedBanButton=$("#close-fixedban");
    public FixedBanComponent closeFixedBan() {
        closingFixedBanButton.click();
        return this;
    }
}
