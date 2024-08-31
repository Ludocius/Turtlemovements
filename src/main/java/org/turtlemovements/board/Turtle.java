package org.turtlemovements.board;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Turtle {
    private int positionInX;
    private int positionInY;

    public Turtle(int initialPositionInX, int initialPositionInY) {
        this.positionInX = initialPositionInX;
        this.positionInY = initialPositionInY;
    }
}
