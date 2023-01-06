package com.obsqura.selenium.pageObjectModel_POM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.SimpleFormDemoPageFactory;

public class SimpleFormDemoPageFactoryTest extends BasePOM {
	SimpleFormDemoPageFactory obj;
	@Test
	public void verifySelectInput() throws IOException {
		obj=new SimpleFormDemoPageFactory(driver);
		obj.verifySingleInputField();
	}

}
