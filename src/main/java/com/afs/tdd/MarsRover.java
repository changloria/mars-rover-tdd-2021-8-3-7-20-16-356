package com.afs.tdd;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeCommand(String command) {
        turnLeft();
    }

    private void turnLeft(){
        if(direction.equals("N")){
            direction = "W";
        }else if(direction.equals("W")){
            direction = "S";
        }else if(direction.equals("S")){
            direction = "E";
        }
    }

    public String getStatus() {
        return String.format("%d %d %s", locationX, locationY, direction);
    }
}
