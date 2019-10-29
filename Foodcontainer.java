/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.lviv.iot.foodcontainer.models;

public abstract class Foodcontainer {

    private double price;
    private Сolor color;
    private double weight;
    private String producer;
    private Material material;

    public Foodcontainer(double price, Color color, double weight,
                         String producer, Material material) {
        this.price = price;
        this.color = color;
        this.weight = weight;
        this.producer = producer;
        this.material = material;
    }

    public Foodcontainer() {
        //this(0, , 0, 0, 0);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return printFields();
    }

    public String printFields() {
        return "\nPrice : " + getPrice() + "\nColor : \n" + "\tred : "
                + getColor().getRed() + "\n\tgreen : " + getColor().getGreen()
                + "\n\tblue : " + getColor().getBlue() + "\nWeight : "
                + getWeight() + "\nProducer : " + getProducer() + "\nMaterial : "
                + getMaterial() + "\n\n";
    }

}
