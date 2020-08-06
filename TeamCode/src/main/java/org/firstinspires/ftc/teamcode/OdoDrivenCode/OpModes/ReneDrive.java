package org.firstinspires.ftc.teamcode.OdoDrivenCode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.OdoDrivenCode.ReneBase;

@TeleOp
public class ReneDrive extends ReneBase {

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
        time.reset();

        while(opModeIsActive())
        {
            if(gamepad1.left_bumper)
            {
                driveWithVectorsGlobal(gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x);
            }
            else if(gamepad1.b)
            {
                resetOdo();
            }
            else if(gamepad1.right_trigger > .1)
            {
                driveToPointItterative(0.0,0.0, (double)gamepad1.right_trigger, .1);
            }
            else
            {
                driveWithVectors(gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x);
            }
            updateOdometry();
            printLocation();
        }

    }



}