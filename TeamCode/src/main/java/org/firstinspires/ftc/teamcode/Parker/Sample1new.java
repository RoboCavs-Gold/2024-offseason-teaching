package org.firstinspires.ftc.teamcode.Parker;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorImplEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp (name= "HelloworldParker")
public class Sample1new extends LinearOpMode {

    public DcMotorEx fl, fr, bl, br;
    @Override
    public void runOpMode() throws InterruptedException {

        fl = hardwareMap.get(DcMotorImplEx.class, "FLMotor");
        fr = hardwareMap.get(DcMotorImplEx.class, "FRMotor");
        bl = hardwareMap.get(DcMotorImplEx.class, "BLMotor");
        br = hardwareMap.get(DcMotorImplEx.class, "BRMotor");

        fl.setDirection(DcMotorSimple.Direction.REVERSE);
        bl.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();
        while (opModeIsActive() && !isStopRequested())   {
            //code will run here while opmode is active }
            double flPower = +gamepad1.left_stick_x - gamepad1.left_stick_y + gamepad1.right_stick_x;
            double frPower = -gamepad1.left_stick_x - gamepad1.left_stick_y - gamepad1.right_stick_x;
            double blPower = -gamepad1.left_stick_x - gamepad1.left_stick_y + gamepad1.right_stick_x;
            double brPower = +gamepad1.left_stick_x - gamepad1.left_stick_y - gamepad1.right_stick_x;

            fl.setPower(flPower);
            fr.setPower(frPower);
            bl.setPower(blPower);
            br.setPower(brPower);

            if (gamepad1.left_bumper)   {
    fl.setPower(3.0);
    fr.setPower(3.0);
    bl.setPower(3.0);
    br.setPower(3.0);

            }
            }
    }

}
