package com.activity.comparable;

public class Fruit implements Comparable<Fruit> {

    private String fruitName;
    private String fruitDecsription;
    private int fruitQuantity;

    public Fruit(String fruitName, int fruitQuantity) {
        this.fruitName = fruitName;
        this.fruitQuantity = fruitQuantity;
    }

    public String getFruitName() {
        return fruitName;
    }

    public String getFruitDecsription() {
        return fruitDecsription;
    }

    public int getFruitQuantity() {
        return fruitQuantity;
    }

    public void setFruitDecsription(String fruitDecsription) {
        this.fruitDecsription = fruitDecsription;
    }


    @Override
    public int compareTo(Fruit that) {

        if(this.fruitName.compareTo(that.fruitName) < 0) {
            return -1;
        } else if (this.fruitName.compareTo(that.fruitName) > 0) {
            return 1;
        }else {

            if (this.fruitQuantity > that.fruitQuantity) {
                return  -1;

            } else if (this.fruitQuantity < that.fruitQuantity){
                return 1;
            }else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("fruitName='")
            .append(fruitName)
            .append('\'');
        sb.append(", fruitDecsription='")
            .append(fruitDecsription)
            .append('\'');
        sb.append(", fruitQuantity=")
            .append(fruitQuantity);
        sb.append('}');
        return sb.toString();
    }
}

