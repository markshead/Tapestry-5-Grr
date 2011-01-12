package org.tap5.tests.integration;

import org.apache.tapestry5.test.SeleniumTestCase;
import org.testng.annotations.Test;

/* 
 * This class contains some very basic Selenium tests to illustrate
 * how to test a tapestry application.
 */
public class ExampleTest extends SeleniumTestCase {
    
    
    /*
     * Open the default page and make sure it contains the welcome message.
     */     
    @Test
    public void simpleExampleTest() {
        openBaseURL();
        assertTextPresent("Welcome to Tapestry 5!");
    }

    /*
     * Navigates to each page and then tests that it contains the page name. This
     * doesn't prove much because the menu shows up at the top of each page, but 
     * it does illustrate how to navigate.
     */
    @Test
    public void navigationExampleTest() {
        openBaseURL();
        clickAndWait("link=Contact");
        assertTextPresent("Contact");
        clickAndWait("link=About");
        assertTextPresent("About");
        clickAndWait("link=Index");
        assertTextPresent("Index");
    }

}
