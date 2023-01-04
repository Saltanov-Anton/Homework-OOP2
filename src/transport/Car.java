package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seats;
    private boolean winterTires;
    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGIN_VOLUME = 1.5;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_YEAR = 2000;
    private static final int DEFAULT_SEATS = 5;

    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String registrationNumber, int seats, boolean winterTires) {

        if (brand == null || brand.isEmpty()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = brand;
        }

        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGIN_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color.isEmpty()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }

        if (year > 0) {
            this.year = DEFAULT_YEAR;
        } else {
            this.year = year;
        }

        if (country == null || country.isEmpty()) {
            this.country = DEFAULT_VALUE;
        } else {
            this.country = brand;
        }

        if (transmission == null || transmission.isEmpty()) {
            this.transmission = DEFAULT_VALUE;
        } else {
            this.transmission = transmission;
        }

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = DEFAULT_VALUE;
        } else {
            this.bodyType = bodyType;
        }

        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = DEFAULT_VALUE;
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (seats <= 0) {
            this.seats = DEFAULT_SEATS;
        } else {
            this.seats = seats;
        }

        this.winterTires = winterTires;
    }

    public void changeTires (int month) {
        if (month > 3 && month < 9) {
            setWinterTires(false);
        } else if (month < 3 && month > 9 && month <= 12) {
            setWinterTires(true);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }
}
