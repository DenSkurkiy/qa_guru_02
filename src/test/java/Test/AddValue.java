package Test;

import Data.Name;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AddValue extends Name {

    @BeforeAll

    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test

        void Value(){

            open("https://demoqa.com/automation-practice-form");
            $(".main-header").shouldHave(text("Practice Form"));

            $(By.id("firstName")).setValue(FirstName);
            $(By.id("lastName")).setValue(LastName);
            $("[id='userEmail']").setValue(Email);
            $("[for='gender-radio-1']").click();
            $("[id= 'userNumber']").setValue(Number);

            $("[id='dateOfBirthInput']").click();
            $(By.className("react-datepicker__year-select")).selectOptionByValue("1987");
            $(By.className("react-datepicker__month-select")).selectOptionByValue("7");
            $("[class='react-datepicker__day react-datepicker__day--015 react-datepicker__day--weekend']").click();

            $(By.id("subjectsInput")).setValue(Subjects);

            $("label[for= 'hobbies-checkbox-1']").click();
            $("[id= 'uploadPicture']").uploadFile(new File("src/test/upload/120712.jpg"));
            $("[id= 'currentAddress']").setValue(Adress);
            $("[id= 'react-select-3-input']").setValue("NCR").pressEnter();
            $("[id= 'react-select-4-input']").setValue("Delhi").pressEnter();

        }
    }


