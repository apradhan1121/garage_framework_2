package com.epam.gym.pages.desktop;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;

public class NotepadPage {
    private WindowsDriver driver;

    // Constructor for WindowsDriver
    public NotepadPage(WindowsDriver driver) {
        this.driver = driver;
    }

    // Method to enter text in Notepad
    public void enterText(String text) {
        driver.findElement(By.name("Text Editor")).sendKeys(text);
    }

    // Method to get displayed text from Notepad
    public String getDisplayedText() {
        return driver.findElement(By.name("Text Editor")).getText();
    }
}
