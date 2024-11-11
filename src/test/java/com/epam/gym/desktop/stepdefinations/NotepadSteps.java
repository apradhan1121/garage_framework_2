package com.epam.gym.desktop.stepdefinations;

import com.epam.gym.browsers.WinAppDriverSetup;
import com.epam.gym.pages.desktop.NotepadPage;
import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NotepadSteps {
    private static WindowsDriver driver;
    private static NotepadPage notepadPage;

    @Given("Setting up the Notepad application and open the Notepad")
    public void settingUpTheNotepadApplicationAndOpenTheNotepad() {
        System.out.println("I open the Notepad application");
        driver = WinAppDriverSetup.getDriver("C:\\Windows\\System32\\notepad.exe");
        notepadPage = new NotepadPage(driver);
    }


    @When("I type {string} in the Notepad")
    public void iTypeInTheNotepad(String text) {
        notepadPage.enterText(text);
    }

    @Then("I should see the text {string} in the Notepad")
    public void iShouldSeeTheTextInTheNotepad(String text) {
        String displayedText = notepadPage.getDisplayedText();
        System.out.println("Displayed text: " + displayedText);
        assert displayedText.equals(text);
    }
}
