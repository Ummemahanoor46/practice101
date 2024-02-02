package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class loginSteps extends Config {
    @Given("user in TalentTEK Homepage")
    public void userInTalentTEKHomepage() {
    }

    @And("user enter valid email address")
    public void userEnterValidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys(STUDENT_EMAIL);
    }

    @And("user enter valid password")
    public void userEnterValidPassword() {
        driver.findElement(By.name("password")).sendKeys(STUDENT_PASSWORD);
    }

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        driver.findElement(By.xpath("//*[@id='login_form']/input")).click();
    }

    @Then("the user should be able to login successfully")
    public void theUserShouldBeAbleToLoginSuccessfully() {
        String businessAct = "Student Information";
        String developerCodeExp = driver.findElement(By.xpath("//*[@id='wrap']//h2")).getText();
        Assert.assertEquals (businessAct, developerCodeExp);
    }
}
