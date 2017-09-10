package com.example.androidthings.myproject;

import com.google.android.things.pio.Gpio;

/**
 * Template for IDD Fall 2017 HW2 (text entry device)
 * Created by bjoern on 9/5/17.
 */

public class Hw2TemplateApp extends SimplePicoPro {
    //Assign names to each pin
    Gpio button0 = GPIO_128;
    Gpio button1 = GPIO_39;
    Gpio button2 = GPIO_37;
    Gpio button3 = GPIO_35;
    Gpio button4 = GPIO_34;
    Gpio button5 = GPIO_33;
    Gpio button6 = GPIO_32;
    Gpio button7 = GPIO_10;
    Gpio button8 = GPIO_172;
    Gpio button9 = GPIO_173;

    //intialize array to be used later to determine what two buttons were pressed
    //to determine the corresponding letter.
    //Counter variable used to determine how many buttons have been pressed thus far
    int twoCharacters[] = {0,0};
    int counter = 0;




    @Override
    public void setup() {
        //set ten GPIOs to input
        pinMode(button0, Gpio.DIRECTION_IN);
        setEdgeTrigger(button0,Gpio.EDGE_BOTH);
        pinMode(button1,Gpio.DIRECTION_IN);
        setEdgeTrigger(button1,Gpio.EDGE_BOTH);
        pinMode(button2, Gpio.DIRECTION_IN);
        setEdgeTrigger(button2,Gpio.EDGE_BOTH);
        pinMode(button3,Gpio.DIRECTION_IN);
        setEdgeTrigger(button3,Gpio.EDGE_BOTH);
        pinMode(button4, Gpio.DIRECTION_IN);
        setEdgeTrigger(button4,Gpio.EDGE_BOTH);
        pinMode(button5,Gpio.DIRECTION_IN);
        setEdgeTrigger(button5,Gpio.EDGE_BOTH);
        pinMode(button6, Gpio.DIRECTION_IN);
        setEdgeTrigger(button6,Gpio.EDGE_BOTH);
        pinMode(button7,Gpio.DIRECTION_IN);
        setEdgeTrigger(button7,Gpio.EDGE_BOTH);
        pinMode(button8, Gpio.DIRECTION_IN);
        setEdgeTrigger(button8,Gpio.EDGE_BOTH);
        pinMode(button9, Gpio.DIRECTION_IN);
        setEdgeTrigger(button9,Gpio.EDGE_BOTH);
    }

    @Override
    public void loop() {
    }

    @Override
    public void digitalEdgeEvent (Gpio pin,boolean value) {
        println("digitalEdgeEvent" + pin + ", " + value);
        //Only assign values to array if value is HIGH
        if (value == HIGH) {
            //remainder variable used to determine whether the amount of buttons that has been
            //pressed thus far is an even or an odd number.
            counter++;
            int remainder = counter % 2;
            //Depending on which button is pressed, a value is input into the first or second
            //position in the array. The number that is passed to the array is equal
            //to the button number.
            if (pin == button0 ) {
                if (remainder == 1) {
                    twoCharacters[0] = 0;
                } else if (remainder == 0) {
                    twoCharacters[1] = 0;
                }
            } else if (pin == button1) {
                if (remainder == 1) {
                    twoCharacters[0] = 1;
                } else if (remainder == 0) {
                    twoCharacters[1] = 1;
                }
            }
            else if (pin == button2) {
                if (remainder == 1) {
                    twoCharacters[0] = 2;
                } else if (remainder == 0) {
                    twoCharacters[1] = 2;
                }
            }
            else if (pin == button3) {
                if (remainder == 1) {
                    twoCharacters[0] = 3;
                } else if (remainder == 0) {
                    twoCharacters[1] = 3;
                }
            }
            else if (pin == button4) {
                if (remainder == 1) {
                    twoCharacters[0] = 4;
                } else if (remainder == 0) {
                    twoCharacters[1] = 4;
                }
            }
            else if (pin == button5) {
                if (remainder == 1) {
                    twoCharacters[0] = 5;
                } else if (remainder == 0) {
                    twoCharacters[1] = 5;
                }
            }
            else if (pin == button6) {
                if (remainder == 1) {
                    twoCharacters[0] = 6;
                } else if (remainder == 0) {
                    twoCharacters[1] = 6;
                }
            }
            else if (pin == button7) {
                if (remainder == 1) {
                    twoCharacters[0] = 7;
                } else if (remainder == 0) {
                    twoCharacters[1] = 7;
                }
            }
            else if (pin == button8) {
                if (remainder == 1) {
                    twoCharacters[0] = 8;
                } else if (remainder == 0) {
                    twoCharacters[1] = 8;
                }
            }
            else if (pin == button9) {
                if (remainder == 1) {
                    twoCharacters[0] = 9;
                } else if (remainder == 0) {
                    twoCharacters[1] = 9;
                }
            }


//Character decision made based on what numbers are in the array of size 2.
// Only enters these if/else statements if an even number of keys has been pressed.
// Since each letter requires 2 keys to be pressed, a letter will be displayed on the screen
// every time an even number of keys has been pressed.
            if (remainder == 0 &&twoCharacters[0]==0 &&twoCharacters[1]==0) {
                printCharacterToScreen(' ');
            }
            else if (remainder == 0 &&twoCharacters[0]==0 &&twoCharacters[1]==1){
                printCharacterToScreen('a');
            }
            else if (remainder == 0 &&twoCharacters[0]==0 &&twoCharacters[1]==2){
                printCharacterToScreen('b');
            }
            else if (remainder == 0 &&twoCharacters[0]==0 &&twoCharacters[1]==3){
                printCharacterToScreen('c');
            }
            else if (remainder == 0 &&twoCharacters[0]==0 &&twoCharacters[1]==4){
                printCharacterToScreen('d');
            }
            else if (remainder == 0 &&twoCharacters[0]==0 &&twoCharacters[1]==5){
                printCharacterToScreen('e');
            }
            else if (remainder == 0 &&twoCharacters[0]==0 &&twoCharacters[1]==6){
                printCharacterToScreen('f');
            }
            else if (remainder == 0 &&twoCharacters[0]==0 &&twoCharacters[1]==7){
                printCharacterToScreen('g');
            }
            else if (remainder == 0 &&twoCharacters[0]==0 &&twoCharacters[1]==8){
                printCharacterToScreen('h');
            }
            else if (remainder == 0 &&twoCharacters[0]==0 &&twoCharacters[1]==9){
                printCharacterToScreen('i');
            }
            else if (remainder == 0 &&twoCharacters[0]==1 &&twoCharacters[1]==0){
                printCharacterToScreen('j');
            }
            else if (remainder == 0 &&twoCharacters[0]==1 &&twoCharacters[1]==1){
                printCharacterToScreen('k');
            }
            else if (remainder == 0 &&twoCharacters[0]==1 &&twoCharacters[1]==2){
                printCharacterToScreen('l');
            }
            else if (remainder == 0 &&twoCharacters[0]==1 &&twoCharacters[1]==3){
                printCharacterToScreen('m');
            }
            else if (remainder == 0 &&twoCharacters[0]==1 &&twoCharacters[1]==4){
                printCharacterToScreen('n');
            }
            else if (remainder == 0 &&twoCharacters[0]==1 &&twoCharacters[1]==5){
                printCharacterToScreen('o');
            }
            else if (remainder == 0 &&twoCharacters[0]==1 &&twoCharacters[1]==6){
                printCharacterToScreen('p');
            }
            else if (remainder == 0 &&twoCharacters[0]==1 &&twoCharacters[1]==7){
                printCharacterToScreen('q');
            }
            else if (remainder == 0 &&twoCharacters[0]==1 &&twoCharacters[1]==8){
                printCharacterToScreen('r');
            }
            else if (remainder == 0 &&twoCharacters[0]==1 &&twoCharacters[1]==9){
                printCharacterToScreen('s');
            }
            else if (remainder == 0 &&twoCharacters[0]==2 &&twoCharacters[1]==0){
                printCharacterToScreen('t');
            }
            else if (remainder == 0 &&twoCharacters[0]==2 &&twoCharacters[1]==1){
                printCharacterToScreen('u');
            }
            else if (remainder == 0 &&twoCharacters[0]==2 &&twoCharacters[1]==2){
                printCharacterToScreen('v');
            }
            else if (remainder == 0 &&twoCharacters[0]==2 &&twoCharacters[1]==3){
                printCharacterToScreen('w');
            }
            else if (remainder == 0 &&twoCharacters[0]==2 &&twoCharacters[1]==4){
                printCharacterToScreen('x');
            }
            else if (remainder == 0 &&twoCharacters[0]==2 &&twoCharacters[1]==5){
                printCharacterToScreen('y');
            }
            else if (remainder == 0 &&twoCharacters[0]==2 &&twoCharacters[1]==6){
                printCharacterToScreen('z');
            }
        }
    }

}
