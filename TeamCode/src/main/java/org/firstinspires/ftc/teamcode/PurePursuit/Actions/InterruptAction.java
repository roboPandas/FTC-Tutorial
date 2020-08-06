package org.firstinspires.ftc.teamcode.PurePursuit.Actions;

import org.firstinspires.ftc.teamcode.PurePursuit.Waypoints.InterruptWaypoint;

/**
 * This interface represents an action that InterruptWaypoint perform when
 * they reach their interrupt point.
 *
 * @see InterruptWaypoint
 */
public interface InterruptAction {

    /**
     * Performs the action.
     */
    public void doAction();

}