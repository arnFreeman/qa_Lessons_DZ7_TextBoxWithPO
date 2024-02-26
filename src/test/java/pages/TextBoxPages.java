package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
public class TextBoxPages {
        public TextBoxPages openPage() {
        open("/text-box");
        executeJavaScript("$('footer').remove()");
        $(".text-center").shouldHave(text("Text Box"));
        return this;
    }
    private final SelenideElement userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            userCurrentAdressInput = $("#currentAddress"),
            userPermamentAdressInput = $("#permanentAddress"),
            clickButtonSubmit = $("#submit"),
            checkResult = $("#output");
    public TextBoxPages setUserName(String value) {
        userNameInput.setValue(value);
        return this;
    }
    public TextBoxPages setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }
    public TextBoxPages setUserCurrentAdress(String value) {
        userCurrentAdressInput.setValue(value);
        return this;
    }
    public TextBoxPages setUserPermamentAdress(String value) {
        userPermamentAdressInput.setValue(value);
        return this;
    }
    public TextBoxPages clickSubmit() {
        clickButtonSubmit.click();
        return this;
    }
    public TextBoxPages checkOneResult(String key, String value) {
        checkResult.$(byText(key)).shouldHave(text(value));
        return this;
    }
}
