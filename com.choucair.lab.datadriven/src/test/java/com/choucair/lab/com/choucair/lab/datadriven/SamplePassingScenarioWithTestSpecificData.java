package com.choucair.lab.com.choucair.lab.datadriven;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.steps.stepdata.StepData.withTestDataFrom;

@RunWith(ThucydidesRunner.class)
public class SamplePassingScenarioWithTestSpecificData {

    @net.thucydides.core.annotations.Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://www.google.com")
    public Pages pages;

    @Steps
    public SampleDataDrivenSteps steps;


    @Test
    public void happy_day_scenario() throws Throwable {
                steps.navigate_to_user_accounts_page();
        withTestDataFrom("datadriven/datadriventransaccion.csv").run(steps).enter_new_user_details();
    }
}