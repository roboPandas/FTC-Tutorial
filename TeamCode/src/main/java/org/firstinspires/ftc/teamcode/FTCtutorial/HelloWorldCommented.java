package org.firstinspires.ftc.teamcode.ftctutorial;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class HelloWorldCommented extends OpMode {
    /**
      * This is called when the driver presses INIT
      */
     @Override
     public void init() {
         // this sends to the driver station
         telemetry.addData("Hello", "World");
     }

    /**
      * This is called repeatedly while OpMode is playing
      */
     @Override
     public void loop() {
         // intentionally left blank
     }
 }