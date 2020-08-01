package org.firstinspires.ftc.teamcode.Purepursuit.OpModes;

        import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

        import org.firstinspires.ftc.teamcode.Purepursuit.Controllables.Location;
        import org.firstinspires.ftc.teamcode.Purepursuit.ReneBase;

@Autonomous
public class PathFollowAutoTest extends ReneBase {

    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("Initializing: ", "Started");
        initMotors();
        initLocation(0, 0, 0);
        initOdometry();
        telemetry.addData("Initializing: ", "Done");
        telemetry.update();

        waitForStart();
        time.reset();

        MotionProfilingDriveToPoint(new Location(0, 40, 0), 3, 1);





        while((opModeIsActive()) && (time.seconds() < 30))
        {

        }
    }


}