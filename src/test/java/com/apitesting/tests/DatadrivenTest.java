package com.apitesting.tests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class DatadrivenTest {

  @DataProvider
  public static Object[][] dataProviderAdd() {

    return new Object[][] { { 0, 1 }, { 1, 2 }, { 3, 4 } };

  }

  @UseDataProvider("dataProviderAdd")
  @Test
  public void add2Numbers(int num1, int num2) {
    System.out.println(num1 + num2);
  }

  @DataProvider
  public static Object[][] dataProviderAdd2() {

    return new Object[][] { { 0, 1 }, { 1, 2 }, { 3, 4 } };

  }

  @UseDataProvider("dataProviderAdd2")
  @Test
  public void add2Numbers2(int num1, int num2) {
    System.out.println(num1 + num2);
  }

  @Test
  public void printStuff() {
    System.out.println("Hello");
  }
}
