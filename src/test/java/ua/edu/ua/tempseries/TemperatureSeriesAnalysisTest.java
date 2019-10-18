package ua.edu.ucu.tempseries;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Before;
import java.util.InputMismatchException;
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class TemperatureSeriesAnalysisTest {
    double[] temperatures = {0.0, -1.0, 7, -10, -20.0, 60.0};
    double expected;
    double[] expectedarray;
    double[] actualarray;
    double actual;
    private TemperatureSeriesAnalysis temperatureSeries;

    @Before
    public void setUp() {
        temperatureSeries = new TemperatureSeriesAnalysis(temperatures);
    }

    @Test
   public void testAverage(){
        expected = 6.0;
        actual = temperatureSeries.average();
       assertEquals(expected, actual, 0.000001);
   }

   @Test
   public void testDeviation(){
         expected = 6.0;
         actual = temperatureSeries.average();
        assertEquals(expected, actual, 0.000001);
   }

   @Test
   public void testMin(){
        expected = -20.0;
        actual = temperatureSeries.min();
        assertEquals(expected, actual, 0.000001);
   }

   @Test
   public void testMax(){
        expected = 60.0;
        actual = temperatureSeries.max();
       assertEquals(expected, actual, 0.000001);
   }

   @Test
   public void testClosesttoZero(){
        expected = 0.0;
        actual = temperatureSeries.findTempClosestToZero();
       assertEquals(expected, actual, 0.000001);
   }

   @Test
   public void testClosesttoValue(){
        expected = 7.0;
        actual = temperatureSeries.findTempClosestToValue(6.0);
       assertEquals(expected, actual, 0.000001);
   }
    @Test
    public void testfindTempsLessThen(){
        expectedarray = new double[]{0.0, -1.0, 7, -10, -20.0, 60.0};
        actualarray = temperatureSeries.findTempsLessThen(6.0);
        assertEquals(1, 1, 0.000001);
    }








}
