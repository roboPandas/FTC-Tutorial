package org.firstinspires.ftc.teamcode.Purepursuit.Trajectories;

public interface Trajectory {

    public double getVal(double time);
    public double getVelocity(double time);
    public double getAcceleration(double time);

}