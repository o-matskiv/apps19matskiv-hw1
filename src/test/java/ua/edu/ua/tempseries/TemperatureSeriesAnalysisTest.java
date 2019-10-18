// package ua.edu.ucu.tempseries;

// import static org.junit.Assert.*;
// import org.junit.Test;
// import org.junit.Ignore;
// import org.junit.Before;
// import java.util.InputMismatchException;
// import java.util.Arrays;
// import static org.junit.Assert.assertArrayEquals;
// import static org.junit.Assert.assertEquals;


// public class TemperatureSeriesAnalysisTest {
//     double[] temperatureSeries = {0.0, -1.0, 7, -10, -20.0, 60.0};


//   @Test
//    public void testAverage(){
//        expected = 6;
//        actual = temperatureSeries.average();
//        assertEquals(expected, actual, 0.000001);
//    }
//    @Test
//    public void testDeviation(){
//         expected = 6;
//         actual = temperatureSeries.average();
//         assertEquals(expected, actual, 0.000001);
//    }
//    @Test
//    public void testMin(){
//         expected = -20;
//         actual = temperatureSeries.min();
//         assertEquals(expected, actual, 0.000001);
//    }
//    @Test
//    public void testMax(){
//        expected = 60;
//        actual = temperatureSeries.max();
//        assertEquals(expected, actual, 0.000001);
//    }
//    @Test
//    public void testClosesttoZero(){
//        expected = 0;
//        actual = temperatureSeries.findTempClosestToZero();
//        assertEquals(expected, actual, 0.000001);
//    }
//    @Test
//    public void testClosesttoValue(){
//        expected = 7;
//        actual = temperatureSeries.findTempClosestToValue(6);
//        assertEquals(expected, actual, 0.000001);
//    }
//    @Test
//    public void findTempsLessThen(){
//         expected = {0.0, -1.0, -10, -20.0};
//         actual = temperatureSeries.findTempsLessThen(1);
//         assertArrayEquals(expected, actual);
//    }







// }
