package org.firstinspires.ftc.teamcode.FTCtutorial;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class SimpleInheritance extends OpMode {
    SuperClass super_obj = new SuperClass();
    ChildClass child_obj = new ChildClass();

    @Override
    public void init() {
        telemetry.addData("Parent a", super_obj.a());
        telemetry.addData("Parent b", super_obj.b());
        telemetry.addData("Child a", child_obj.a());
        telemetry.addData("Child b", child_obj.b());
        telemetry.addData("Child c", child_obj.c());
    }

    @Override
    public void loop() {

    }
}