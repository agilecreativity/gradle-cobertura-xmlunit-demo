package com.agilecreativity.demo.gradle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UtilsTest {

    private Utils utils = null;

    @Before
    public void runBeforeEveryTest() {
    	utils = new Utils();
    }

    @After
    public void runAfterEveryTest() {
    	utils = null;
    }

    @Test
    public void helloOk() {
    	assertThat(utils.say("World"), notNullValue());
       	assertThat(utils.say("World"), equalTo("Hello World"));   	
    }
    
    @Test(expected = RuntimeException.class)
    public void helloWithException() {
       	utils.say(null);  	
    }

}
