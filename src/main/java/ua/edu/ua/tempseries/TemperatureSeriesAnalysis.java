package ua.edu.ucu.tempseries;
import java.util.InputMismatchException;

public class TemperatureSeriesAnalysis {

    public TemperatureSeriesAnalysis() {

    }

    double[] temperatureSeries;
    public TemperatureSeriesAnalysis(double[] temps) {
      temperatureSeries = new double[temps.length];
      for (int i=0; i < temperatureSeries.length; i++) {
        if (temps[i]<-273) {
          temperatureSeries = new double[0];
          throw new InputMismatchException();

        } else{
          temperatureSeries[i] = temps[i];

        }
      }
    }

    public double average() {
      double ave;
      try{
          double sum = 0;
          for (int i = 0; i < temperatureSeries.length; i++) {
            sum = sum + temperatureSeries[i];

          }
          ave = sum/temperatureSeries.length;
          return ave;
      }
      catch(Exception e){
        throw new IllegalArgumentException();
      }

    }

    public double deviation() {
      try{
        double ave = average();
        double sum = 0;
        for (int i = 0; i < temperatureSeries.length; i++) {
          sum = sum + Math.pow((ave-temperatureSeries[i]),2);
        }
          double sigma = Math.sqrt(sum/temperatureSeries.length);
          return sigma;
      }
      catch(Exception e){
        throw new IllegalArgumentException();
      }
      // return 0;

      }

    public double min() {
      try{
        double min = temperatureSeries[0];
          for (int i = 0; i < temperatureSeries.length; i++) {
              if (min > temperatureSeries[i])
                  min = temperatureSeries[i];

        }
          return min;
      }
      catch(Exception e){
        throw new IllegalArgumentException();
      }
      }

    public double max() {
      try{
        double max = temperatureSeries[0];
          for (int i = 0; i < temperatureSeries.length; i++) {
              if (max < temperatureSeries[i])
                  max = temperatureSeries[i];

      }
          return max;
      }
      catch(Exception e){
        throw new IllegalArgumentException();
      }

        }


    public double findTempClosestToZero() {
      try{
        int k = 0;
          for (int i = 0; i < temperatureSeries.length; i++) {
              if (Math.abs(temperatureSeries[k]) > Math.abs(temperatureSeries[i]))
                  k = i;
          return temperatureSeries[k];
        }
      }
      catch(Exception e){
        throw new IllegalArgumentException();
      }
      return 0;
    }

    public double findTempClosestToValue(double tempValue) {
      try{
        double closest = temperatureSeries[0];
          for (int i = 0; i < temperatureSeries.length; i++) {
              if (Math.abs(closest-tempValue) > Math.abs(temperatureSeries[i]-tempValue))
                  closest = temperatureSeries[i];

        }
          return closest;
      }
      catch(Exception e){
        throw new IllegalArgumentException();
      }
    }

    public double[] findTempsLessThen(double tempValue) {
      double lessthen[] = new double[temperatureSeries.length];
      try{
        double closest = temperatureSeries[0];
          for (int i = 0; i < temperatureSeries.length; i++) {
              if (tempValue > temperatureSeries[i])
                lessthen[i] = temperatureSeries[i];
          return lessthen;
        }
      }
      catch(Exception e){
        throw new IllegalArgumentException();
      }

        return null;
    }
//
//    public double[] findTempsGreaterThen(double tempValue) {
//      double greaterthen[] = new double[temperatureSeries.length];
//
//      try{
//        double closest = temperatureSeries[0];
//          for (int i = 0; i < temperatureSeries.length; i++) {
//              if (tempValue < temperatureSeries[i])
//                greaterthen[i] = temperatureSeries[i];
//          return greaterthen;
//        }
//      }
//      catch(Exception e){
//        throw new IllegalArgumentException();
//      }
//        return null;
//    }
//
//    public TempSummaryStatistics summaryStatistics() {
//      if (temperatureSeries.length==0) {
//        throw new IllegalArgumentException();
//      }else{
//        return new TempSummaryStatistics(this);
//
//      }
//    }
//
//    public int addTemps(double... temps) {
//        int new_size = temperatureSeries.length + temps.length;
//        int old_size = temperatureSeries.length;
//        double[] new_temperatureSeries;
//        new_temperatureSeries = new double[new_size];
//          for (int i =0; i < old_size; i++) {
//            new_temperatureSeries[i] = temperatureSeries[i];
//          }
//          for (int i = old_size; i < new_size; i++) {
//            new_temperatureSeries[i] = temps[i-old_size];
//          }
//        return new_size;
//    }
}
