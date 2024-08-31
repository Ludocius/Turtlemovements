package org.turtlemovements.board;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Turtle {
    private int positionInX;
    private int positionInY;

    public Turtle(int initialPositionInX, int initialPositionInY) {
        this.positionInX = initialPositionInX;
        this.positionInY = initialPositionInY;
    }
}
