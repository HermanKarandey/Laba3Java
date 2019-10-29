/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.lviv.iot.foodcontainer.models;


public class  Breadbox extends Foodcontainer {

    private String surface;
    private Size sizeOfSurface;
    private String typeOfFrame;

    public Breadbox(String surface, Size sizeOfSurface, String typeOfFrame,
                 double price, Color color, double weight, String producer,
                 Material material) {
        super(price, color, weight, producer, material);
        this.surface = surface;
        this.sizeOfSurface = sizeOfSurface;
        this.typeOfFrame = typeOfFrame;
    }

    public Breadbox() {
        // this(0, 0, 0);
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public Size getSizeOfSurface() {
        return sizeOfSurface;
    }

    public void setSizeOfSurface(Size sizeOfSurface) {
        this.sizeOfSurface = sizeOfSurface;
    }

    public String getTypeOfFrame() {
        return typeOfFrame;
    }

    public void setTypeOfFrame(String typeOfFrame) {
        this.typeOfFrame = typeOfFrame;
    }

    @Override
    public String toString() {
        return "Breadbox: " + "\nsurface : " + surface + "\nSize of surface : "
                + "\n\tlenght : " + getSizeOfSurface().getLenght() + "\n\twidth : "
                + getSizeOfSurface().getWidth() + "\n\theight : "
                + getSizeOfSurface().getHeight() + "\ntypeOfFrame : " + typeOfFrame
                + printFields();
    }
}
