package org.firstinspires.ftc.teamcode.OdoDrivenCode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.OdoDrivenCode.ReneBase;

@TeleOp
public class ValueGrabbing extends ReneBase {

    @Override
    public void runOpMode()
    {
        telemetry.addData("Initializing: ", "Started");
        initMotors();
        initLocation(0, 0, 0);
        initOdometry();
        telemetry.addData("Initializing: ", "Done");
        telemetry.update();

        waitForStart();

        while(opModeIsActive())
        {
            driveWithVectors(gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x);
            printEncoderValues();
        }
    }
}