package org.firstinspires.ftc.teamcode.luca;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp (name = "helloworldluca")
public class helloworld extends LinearOpMode {

    public DcMotorEx fl, fr, bl, br;
    @Override
    public void runOpMode() throws InterruptedException {

        fl = hardwareMap.get(DcMotorEx.class, "fl");
        fr = hardwareMap.get(DcMotorEx.class, "fr");
        bl = hardwareMap.get(DcMotorEx.class, "bl");
        br = hardwareMap.get(DcMotorEx.class, "br");
        //motor.setDirection(DcMotorSimple.Direction.REVERSE);
        fl.setDirection(DcMotorSimple.Direction.REVERSE);
        bl.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();
        while (opModeIsActive() && !isStopRequested()) {
            // code in here will run when opmode active
            double flPower = +gamepad1.left_stick_x - gamepad1.left_stick_y + gamepad1.right_stick_x;
            double frPower = -gamepad1.left_stick_x - gamepad1.left_stick_y - gamepad1.right_stick_x;
            double blPower = -gamepad1.left_stick_x - gamepad1.left_stick_y + gamepad1.right_stick_x;
            double brPower = +gamepad1.left_stick_x - gamepad1.left_stick_y - gamepad1.right_stick_x;
            //motor.setPower(0);

            //fl.setPower(flPower);
            //fr.setPower(frPower);
            //bl.setPower(blPower);
            //br.setPower(brPower);

            if (gamepad1.b) {
                fl.setPower(flPower/3.0);
                fr.setPower(frPower/3.0);
                bl.setPower(blPower/3.0);
                br.setPower(brPower/3.0);
            } else {
                fl.setPower(flPower);
                fr.setPower(frPower);
                bl.setPower(blPower);
                br.setPower(brPower);
            }
        }
    }
}


