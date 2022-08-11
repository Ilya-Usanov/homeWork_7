package com.demoqa.pages.components;

import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public CalendarComponent setDate(String dateOfBirth) {
        $("#dateOfBirthInput").sendKeys(Keys.CONTROL + "A");
        $("#dateOfBirthInput").sendKeys(dateOfBirth + Keys.ENTER);
        return this;
    }
}
