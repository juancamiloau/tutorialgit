package com.choucair.lab.com.choucair.lab.datadriven;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class SampleDataDrivenSteps extends ScenarioSteps {

    public SampleDataDrivenSteps(Pages pages) {
        super(pages);
    }

    public String name;
    public String age;
    public String address;

    @StepGroup
    public void enter_new_user_details() {
        enter_name_and_age(name, age);
        enter_address(address);
    }

    @Step
    public void enter_address(String address) {
        System.out.println(address);
    }

    @Step
    public void enter_name_and_age(String name, String age) {
    	System.out.println(name + " " + age);
    }

        @Step
        public void navigate_to_user_accounts_page() {
                
        }
}