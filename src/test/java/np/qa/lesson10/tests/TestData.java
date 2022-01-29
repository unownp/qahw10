package np.qa.lesson10.tests;

import com.github.javafaker.Faker;

public class TestData {

    private static Faker fakeData = new Faker();

    public static String firstName = fakeData.name().firstName(),
            lastName = fakeData.name().lastName(),
            email = fakeData.internet().emailAddress(),
            address = fakeData.address().fullAddress(),
            number = fakeData.phoneNumber().subscriberNumber(10);

    public static  String month="July";
    public static  int day=12;
    public static  int year=1990;
    public static String gender="Male";
    public static String subject="Hindi";
    public static String hobby="Sports";
    public static String state="Uttar Pradesh";
    public static String city="Agra";
}