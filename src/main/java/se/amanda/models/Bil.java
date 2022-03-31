package se.amanda.models;

public class Bil {
    private String color;
    private String brand;

    public Bil(String color, String brand) {
        if (color == null) {
            throw new IllegalArgumentException("color must contain a value");
        }
        if (brand == null) {
            throw new IllegalArgumentException("brand must contain a value");
        }
        this.color = color;
        this.brand = brand;
    }

    public Bil(Bil source) {
        this.color = source.color;
        this.brand = source.brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            throw new IllegalArgumentException("color cannot be null/blank");
        }
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null) {
            throw new IllegalArgumentException("brand must contain a value");
        }
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Bil: \n" +
                "color = " + color + '\n' +
                "brand = " + brand;
    }

    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }

        if(!(obj instanceof Bil)) {
            return false;
        }

        Bil bil = (Bil)obj;

        if(this.getBrand().equals(bil.getBrand()) &&
        this.getColor().equals(bil.getColor())){
            return true;
        }
        return false;
    }
}
