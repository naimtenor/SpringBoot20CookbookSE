package com.example.bookpub;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:build/reports/cucumber"}, 
                                                glue = {"cucumber.api.spring",                  
                                                            "classpath:com.example.bookpub"},
                                                monochrome = true)
public class RunCukeTests {
}