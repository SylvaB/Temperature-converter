package com.kenzie.app;

import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;
    @BeforeAll
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public void restoreStreams() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @BeforeEach
    public void setTestInput() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void test_lifeTimeSupply(){
        runLifetimeSupplyWithInput("Pretzels\n2\n30\n");
        assertThat(outContent.toString(), containsString("51100"));
        assertThat(outContent.toString(), containsString("2 Pretzels"));
    }

    @Test
    public void test_futureAge(){
        runFutureAgeWithInput("1988\n2026\n");
        assertThat(outContent.toString(), containsString("You will be either 37 or 38 in 2026"));
    }

    @Test
    public void test_temperatureConversion_CelsiusToFahrenheit_lowerCase(){
        runTemperatureConversionWithInput("f\n0\n");
        assertThat(outContent.toString(), containsString("0.0°C converted to Fahrenheit is 32.0°F"));
    }
    @Test
    public void test_temperatureConversion_CelsiusToFahrenheit_upperCase(){
        runTemperatureConversionWithInput("F\n0\n");
        assertThat(outContent.toString(), containsString("0.0°C converted to Fahrenheit is 32.0°F"));
    }
    @Test
    public void test_temperatureConversion_FahrenheitToCelsius_lowerCase(){
        runTemperatureConversionWithInput("c\n32\n");
        assertThat(outContent.toString(), containsString("32.0°F converted to Celsius is 0.0°C"));
    }
    @Test
    public void test_temperatureConversion_FahrenheitToCelsius_upperCase(){
        runTemperatureConversionWithInput("C\n32\n");
        assertThat(outContent.toString(), containsString("32.0°F converted to Celsius is 0.0°C"));
    }

    @Test
    public void test_temperatureConversion_CelsiusToFahrenheit_decimal(){
        runTemperatureConversionWithInput("F\n22\n");
        assertThat(outContent.toString(), containsString("22.0°C converted to Fahrenheit is 71.6°F"));
    }
    @Test
    public void test_temperatureConversion_FahrenheitToCelsius_decimal(){
        runTemperatureConversionWithInput("c\n71.6\n");
        assertThat(outContent.toString(), containsString("71.6°F converted to Celsius is 21.999999999999996°C"));
    }

    private static void runLifetimeSupplyWithInput(String input){
        try {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            Main.LifeTimeSupply();
        } catch (NoSuchElementException e) {
        // Ignore this error
        }
    }

    private static void runFutureAgeWithInput(String input){
           try {
               ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
               System.setIn(in);
               Main.FutureAge();
           } catch (NoSuchElementException e) {
               // Ignore this error
           }
    }

    private static void runTemperatureConversionWithInput(String input){
        try {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            Main.TemperatureConversion();
        } catch (NoSuchElementException e) {
            // Ignore this error
        }
    }




}
