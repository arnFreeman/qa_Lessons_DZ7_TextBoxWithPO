package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPages;
public class TextBoxTest extends TestBase {
    TextBoxPages textBoxPages = new TextBoxPages();
    @Test
    void positiveTextBoxTest() {

        textBoxPages.openPage()
                    .setUserName("Abdullin Renat")
                    .setUserEmail("AbdullinRenat@gmail.com")
                    .setUserCurrentAdress("Moscow, Petrovka Street, building 38")
                    .setUserPermamentAdress("Baikonur Cosmodrome, Korolev Street, building 26")
                    .clickSubmit()
                      .checkOneResult("Name:", "Abdullin Renat")
                      .checkOneResult("Email:", "AbdullinRenat@gmail.com")
                      .checkOneResult("Current Address :", "Moscow, Petrovka Street, building 38")
                      .checkOneResult("Permananet Address :", "Baikonur Cosmodrome, Korolev Street, building 26");
    }
}
