package com.demoqa.data;

import com.github.javafaker.Faker;

public class TestData {
    Faker faker = new Faker();
    public String firstNameFaker = faker.address().firstName();
    public String lastNameFaker = faker.address().lastName();
    public String emailFaker = faker.internet().emailAddress();
    public String mobileFaker = faker.phoneNumber().subscriberNumber(10);
    public String dateOfBirthFaker = faker.date().birthday().toString();
    public String subjectsFaker = faker.university().name();
    public String currentAddressFaker = faker.address().fullAddress();
    public String firstName = firstNameFaker;
    public String lastName = lastNameFaker;
    public String email = emailFaker;
    public String gender = "Male";
    public String mobile = mobileFaker;
    public String dateOfBirth = dateOfBirthFaker;
    public String subjects = subjectsFaker;
    public String picture = "test.txt";
    public String currentAddress = currentAddressFaker;
    public String state = "NCR";
    public String city = "Noida";
    public String[] hobbies = {"Sports", "Reading", "Music"};
    public String strHobbies = String.join(", ", hobbies);

    public TestData() {
    }
}
