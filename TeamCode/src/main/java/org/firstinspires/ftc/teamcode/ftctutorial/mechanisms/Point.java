package org.firstinspires.ftc.teamcode.ftctutorial.mechanisms;

public class Point{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "Point " + x + " " + y;
    }
}
