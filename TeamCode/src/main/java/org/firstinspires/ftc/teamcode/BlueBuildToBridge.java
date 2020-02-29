package org.firstinspires.ftc.teamcode;

/**
 * Created by student on 10/26/2017.
 */

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "BlueBuildToBridge", group = "Autonomous")
public class BlueBuildToBridge extends Autonomous {
    @Override
    public void runPath() {
        robot.slideMotor.setPower(1);
        sleep(1000);
        robot.slideMotor.setPower(0);

        robot.hookOne.setPosition(0.9);
        //robot.hookTwo.setPosition(0.2);

        move(22, -1, 1);
        sleep(100);
        move(33, 1, 0);
        sleep(500);
        robot.hookOne.setPosition(0.09);
       // robot.hookTwo.setPosition(1.5);0
        sleep(1500);
        move(47, -1, 0); // was 45
        sleep(500);
        robot.hookOne.setPosition(0.9);
       // robot.hookTwo.setPosition(0.2);

        sleep(500);
        move(62/2, 1, 1);

        sleep(1000);
        robot.slideMotor.setPower(-1);
        sleep(600);
        robot.slideMotor.setPower(0);

        move(24, 1, 0);
        move(62/2, 1, 1);

    }
}
