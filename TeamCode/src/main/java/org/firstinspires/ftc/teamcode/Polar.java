package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

public class Polar {
    double angle;
    double magnitude;

    public Polar(double x, double y) {
        angle = Math.atan2(y, x);
        magnitude = Math.hypot(x, y);
    }

    public double getAngle(AngleUnit angleUnit) {
        return angleUnit.fromRadians(angle);
    }

    public double getMagnitude() {
        return magnitude;
    }
}