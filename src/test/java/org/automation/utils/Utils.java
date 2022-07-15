package org.automation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import tech.grasshopper.filter.ExtentRestAssuredFilter;
/**
 * @author sumit
 */
public class Utils {

	public static RequestSpecification specificationRequest;

	public RequestSpecification requestSpecification() throws IOException {

		if (specificationRequest == null) {
			PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
			specificationRequest = new RequestSpecBuilder().setBaseUri(getPropertiesFiles("baseUrl"))
					.setContentType(ContentType.JSON).addFilter(RequestLoggingFilter.logRequestTo(log))
					.addFilter(new ExtentRestAssuredFilter()).build();
			return specificationRequest;
		}
		return specificationRequest;

	}

	public String getPropertiesFiles(String key) throws IOException {

		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("./configrationFolder/config.properties");
		prop.load(fis);

		return prop.getProperty(key);

	}
}
