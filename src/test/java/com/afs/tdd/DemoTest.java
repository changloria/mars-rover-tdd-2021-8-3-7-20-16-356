package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_return_locationPoint_W_when_turnLeft_given_locationPoint_N() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        String command = "L";
        //when
        marsRover.executeCommand(command);
        String actual = marsRover.getStatus();
        //then
        assertEquals("0 0 W", actual);
    }

    @Test
    void should_return_locationPoint_S_when_turnLeft_given_locationPoint_W() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        String command = "L";
        //when
        marsRover.executeCommand(command);
        String actual = marsRover.getStatus();
        //then
        assertEquals("0 0 S", actual);
    }

    @Test
    void should_return_locationPoint_E_when_turnLeft_given_locationPoint_S() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        String command = "L";
        //when
        marsRover.executeCommand(command);
        String actual = marsRover.getStatus();
        //then
        assertEquals("0 0 E", actual);
    }

}
