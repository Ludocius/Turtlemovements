package org.turtlemovements.commands;

public enum Commands {

    PEN_UP(1),
    PEN_DOWN(2),
    TURN_RIGHT(3),
    TURN_LEFT(4),
    MOVE_FORWARD(5),
    DISPLAY(6),
    END_DATA(9);

    private final int data;

    private Commands(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

}
