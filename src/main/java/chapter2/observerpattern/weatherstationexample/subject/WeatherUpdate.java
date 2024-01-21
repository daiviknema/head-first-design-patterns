package chapter2.observerpattern.weatherstationexample.subject;

public class WeatherUpdate {
    private double temperature;

    private double humidity;

    static class Builder {
        private double temperature;

        private double humidity;

        public Builder setTemperature(double temperature) {
            this.temperature = temperature;
            return this;
        }

        public Builder setHumidity(double humidity) {
            this.humidity = humidity;
            return this;
        }

        public WeatherUpdate build() {
            return new WeatherUpdate(this);
        }
    }

    public static WeatherUpdate.Builder newBuilder() {
        return new Builder();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    private WeatherUpdate(WeatherUpdate.Builder builder) {
        this.humidity = builder.humidity;
        this.temperature = builder.temperature;
    }
}
