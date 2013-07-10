package com.agilecreativity.demo.gradle;

import static org.custommonkey.xmlunit.XMLAssert.assertXMLEqual;

import org.custommonkey.xmlunit.XMLUnit;
import org.junit.Test;

public class XmlCompareTest {

	@Test
	public void compareXmlFile() throws Exception {

        String actualXml   = Utils.readFromFile("src/test/resources/first.xml");
        String expectedXml = Utils.readFromFile("src/test/resources/second.xml");

        // Need to ignore white spaces
        XMLUnit.setIgnoreWhitespace(true);
        assertXMLEqual(actualXml, expectedXml);
	}

}
