/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 * A representation of a rectangle.
 *
 * @author rkhatchadourian
 */
public class Rectangle {

    /**
     * The length of this rectangle.
     */
    private double length;

    /**
     * The width of this rectangle.
     */
    private double width;

    /**
     * Returns the length of this rectangle.
     *
     * @return The length of this rectangle.
     */
    public double getLength() {
        return length;
    }
    
    /**
     * Creates a default rectangle with default values
     * of length and width.
     */
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    /**
     * Creates a default rectangle with the given values
     * for length and width.
     * @param length The length of the rectangle.
     * @param width The width of the rectangle to create.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Sets the length of this rectangle.
     *
     * @param length the length to set
     */
    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
        }
    }

    /**
     * Returns the width of this rectangle.
     *
     * @return the width of this rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of this rectangle.
     *
     * @param width the width to set
     */
    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        }
    }
    
    /**
     * Returns the calculated area of this rectangle.
     * @return The area of this rectangle.
     */
    public double getArea() {
        return this.length * this.width;
    }
}