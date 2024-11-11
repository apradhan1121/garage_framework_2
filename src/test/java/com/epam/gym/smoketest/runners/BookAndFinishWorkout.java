package com.epam.gym.smoketest.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/smoketest/gym_bookandfinishworkout.feature",
        glue = {"com.epam.gym.smoketest.stepdefinitions"},
        plugin = {"pretty", "json:build/reports/cucumber/report.json","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
public class BookAndFinishWorkout extends AbstractTestNGCucumberTests {
    }
