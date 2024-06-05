package itmo.java.basics.lesson2;

public class Car {
    private String brand;
    private String model;
    private Integer seatPlace;
    private Double engineCapacity;
    private Color color;
    private Boolean isNew;
    private int doorsCount;
    private Long price;

    public Car() {
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, Boolean isNew) {
        this.brand = brand;
        this.isNew = isNew;
    }

    public Car(Boolean isNew, String brand) {
        this.brand = brand;
        this.isNew = isNew;
    }

    public Car(String brand, String model, Integer seatPlace, Double engineCapacity, Color color, Boolean isNew, int doorsCount, Long price) {
        this.brand = brand;
        this.model = model;
        this.seatPlace = seatPlace;
        this.engineCapacity = engineCapacity;
        this.color = color;
        this.isNew = isNew;
        this.doorsCount = doorsCount;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeatPlace() {
        return seatPlace;
    }

    public void setSeatPlace(Integer seatPlace) {
        this.seatPlace = seatPlace;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", seatPlace=" + seatPlace +
                ", engineCapacity=" + engineCapacity +
                ", color=" + color +
                ", isNew=" + isNew +
                ", doorsCount=" + doorsCount +
                ", price=" + price +
                '}';
    }
}
