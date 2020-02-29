package org.firstinspires.ftc.teamcode;

/**
 * Created by student on 10/26/2017.
 */

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "BlueDepotToBridge", group = "Autonomous")
public class BlueDepotToBridge extends Autonomous {
    @Override
    public void runPath() {
        move(28, 1, 0);
        move(33, 1, 1); //was 43
       /*robot.grab.setPosition(0.26);
       move(5,1,1);
       move(15,1,0);
       sleep(500);
       robot.grab.setPosition(1);
       //sleep(5000);
       move(15, -1, 0);
       move(10,-1,1);
       robot.grab.setPosition(0.26);*/


    }
}