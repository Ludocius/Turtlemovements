package org.turtlemovements.board;


import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
public class Turtle {
    private int positionInX;
    private int positionInY;
}
