/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.lviv.iot.foodcontainer.models;


public class Termoss extends Foodcontainer {

    private String type;
    private int bitSize;
    private Size corpsSize;

    public Termoss(String type, int bitSize, Size corpsSize, double weight, Color color,
                   double weight, String producer, Material material) {
        super(material, color, weight, producer, material);
        this.type = type;
        this.bitSize = bitSize;
        this.corpsSize = corpsSize;
    }

    public Termoss() {
        // this("0",0,0);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getBitSize() {
        return bitSize;
    }

    public void setBitSize(int bitSize) {
        this.bitSize = bitSize;
    }

    public Size getCorpsSize() {
        return corpsSize;
    }

    public void setCorpsSize(Size corpsSize) {
        this.corpsSize = corpsSize;
    }

    @Override
    public String toString() {
        return "Termoss : " + "\nType : " + type + "\nBit size : " + bitSize
                + "\ncorpus size : " + "\n\tlenght : " + getCorpsSize().getLenght()
                + "\n\twidth : " + getCorpsSize().getWidth() + "\n\theight : "
                + getCorpsSize().getHeight() + printFields();
    }
}
