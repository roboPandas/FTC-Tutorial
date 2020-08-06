package org.firstinspires.ftc.teamcode.OdoDrivenCode.Trajectories;

public interface Trajectory {

    public double getVal(double time);
    public double getVelocity(double time);
    public double getAcceleration(double time);

}