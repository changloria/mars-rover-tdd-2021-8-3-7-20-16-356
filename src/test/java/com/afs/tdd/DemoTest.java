package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_locationPoint_W_when_turnLeft_given_locationPoint_N() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        String command = "L";
        //when

        String actual = marsRover.executeCommand(command);
        //then
        assertEquals("0 0 W", actual);
    }
}
