
import org.junit.Assert;
import org.junit.Test;

public class RegistrationFormTest {


    @Test
    public void registrationTestPos() throws InterruptedException {
        // object creation
        MethodsForRegistrationFormTests positiveTest = new MethodsForRegistrationFormTests();

        //page load
        positiveTest.webPageLoad();

        //select lithuanian language
        positiveTest.clickLtButton();

        //register button click for registration page to open
        positiveTest.clickRegisterButton();

        //setting field values
        positiveTest.setNameInput("Vardenis");
        positiveTest.setSurnameInput("Pavardenis");
        positiveTest.setPhonenrInput("+37067878784");
        positiveTest.setEmailInput("test@test.com");
        positiveTest.setBankDivisionSelect(1);
        positiveTest.setDateInput("2012-12-12 12:00");
        positiveTest.setTopicSelect(1);
        positiveTest.setMessageInput("This is test message for test automatization task.");

        //clicking submit button
        positiveTest.clickSubmitButton();

        //assert
        Assert.assertNotNull(positiveTest.checkAciuKadKreipiatesPasMusTextArea());

        positiveTest.quitDriver();
    }

    @Test
    public void registrationTestNeg() throws InterruptedException
    {
        MethodsForRegistrationFormTests positiveTest = new MethodsForRegistrationFormTests();

        //load
        positiveTest.webPageLoad();

        //select lithuanian language
        positiveTest.clickLtButton();

        //register button click for registration page to open
        positiveTest.clickRegisterButton();

        //setting field values
        positiveTest.setNameInput("V");
        positiveTest.setSurnameInput("P");
        positiveTest.setPhonenrInput("+370678545454545645645645645645646456464654564645646464");
        positiveTest.setEmailInput("test");
        positiveTest.setBankDivisionSelect(1);
        positiveTest.setDateInput("2");
        positiveTest.setTopicSelect(1);
        positiveTest.setMessageInput("This is test message for test automatization task.");

        //clicking submit button
        positiveTest.clickSubmitButton();

        //assert
        Assert.assertFalse(positiveTest.setSubmitButtonIsClickable());

        positiveTest.quitDriver();
    }
}
