package org.firstinspires.ftc.teamcode;

/**
 * Created by student on 10/26/2017.
 */

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "RedDepotToBridge", group = "Autonomous")
public class RedDepotToBridge extends Autonomous {
    @Override
    public void runPath() {
       move(5,1,1);
       move(10,1,0);
        robot.slideMotor.setPower(1);
        sleep(500);
       move(15,1,1);
     robot.slideMotor.setPower(0);
//
//        move(10,1,-1);
//        //robot.slideMotor.setPower(1);
//        //sleep(500);
//        move(10,1,1);
//        //robot.slideMotor.setPower(0);
//        move(33,-1,1); //left //was 46
    }
}