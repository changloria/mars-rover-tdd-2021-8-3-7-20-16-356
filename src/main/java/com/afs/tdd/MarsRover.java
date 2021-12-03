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

    public void executeCommands(String command) {
        //For looping each character of the String, for example: "MLM" -> M,L,M...
        for (char comm: command.toCharArray()) {
            executeCommand(comm);
        }
    }
    private void executeCommand(char command) {
        switch (command) {
            case 'M': {
                moveForward();
                break;
            }
            case 'L': {
                turnLeft();
                break;
            }
            case 'R': {
                turnRight();
                break;
            }
        }
    }

    private void moveForward() {
        if(direction.equals("N")){
            locationY++;
        }else if(direction.equals("S")){
            locationY--;
        }else if(direction.equals("W")){
            locationX--;
        }else if(direction.equals("E")){
            locationX++;
        }
    }

    private void turnRight() {
        if(direction.equals("N")){
            direction = "E";
        }else if(direction.equals("E")){
            direction = "S";
        }else if(direction.equals("S")){
            direction = "W";
        }else if(direction.equals("W")){
            direction = "N";
        }
    }

    private void turnLeft(){
        if(direction.equals("N")){
            direction = "W";
        }else if(direction.equals("W")){
            direction = "S";
        }else if(direction.equals("S")){
            direction = "E";
        }else if(direction.equals("E")){
            direction = "N";
        }
    }

    public String getStatus() {
        return String.format("%d %d %s", locationX, locationY, direction);
    }
}
