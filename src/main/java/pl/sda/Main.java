package pl.sda;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by RENT on 2017-01-25.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
    double temp;

    @Override
    public String toString() {
        return "Main{" +
                "temp=" + temp +
                '}';
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp - 273.15;
    }
}
