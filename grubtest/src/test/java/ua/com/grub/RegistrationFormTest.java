package ua.com.grub;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class RegistrationFormTest {
    @Test

    public void TestCreateTask() {
        // WebDriver driver = new FirefoxDriver();
        System.setProperty("marionette.gecko.driver", "C:\\Users\\Eugeniya\\AppData\\Local\\Temp\\wzaf63");         //C:\Users\Eugeniya\AppData\Local\Temp\wzaf63 ("webdriver.firefox.driver","C:\\Program Files\\Mozilla Firefox\\firefox.exe");

        open("http://grub.com.ua");  //registration
        $("#home > div > div > div > app-discription > div > div > div > div > button").click();
        $("#home > div > div > div > app-discription > div > div > div > app-autorizacion > div > span > span").click();
        $("#exampleInputEmail1").click();
        $("#exampleInputEmail1").setValue("test05358@gmail.com");
        $("#exampleInputPassword3").setValue("1233211a");
        $("#mat-checkbox-1 > label > div").click();
        $("#registrationForm > button").click();

        $("#navigation").click();
        $("#cdk-overlay-0 > div > div > a:nth-child(3) > button > div").click();
        $("#exampleInputEmail1").doubleClick();
        $("exampleInputEmail1").scrollTo();
        $("#comment").setValue("СообщениеСообщениеСообщениеСообщениеСообщение");
        $("#contacts > div > div > div > mat-card > form > button").click();
    }

}