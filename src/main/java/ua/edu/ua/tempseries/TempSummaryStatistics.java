package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    private double avgTemp;
    private double devTemp;
    private double minTemp;
    private double maxTemp;

    public TempSummaryStatistics(double[] temperatureSeries) {
        this.avgTemp = temperatureSeries.average();
        this.devTemp = temperatureSeries.deviation();
        this.minTemp = temperatureSeries.min();
        this.maxTemp = temperatureSeries.max();
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public double getDevTemp() {
        return devTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }
}
