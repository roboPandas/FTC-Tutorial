package org.firstinspires.ftc.teamcode.ftctutorial.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class IfElseOpMode extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        if (gamepad1.left_stick_y < 0) {
            telemetry.addData("Left stick", " is negative");
        } else {
            telemetry.addData("Left stick", " is positive");
        }

        telemetry.addData("Left stick y", gamepad1.left_stick_y);
    }
}
