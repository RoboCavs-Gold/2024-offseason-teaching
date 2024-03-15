package org.firstinspires.ftc.teamcode.visu;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp (name="helloworldvisu")
public class helloworld extends LinearOpMode {
    //create
    public DcMotorEx fl, fr, bl, br;
    @Override
    public void runOpMode() throws InterruptedException {
        //initialize
        fl = hardwareMap.get(DcMotorEx.class, "fl");
        fr = hardwareMap.get(DcMotorEx.class, "fr");
        bl = hardwareMap.get(DcMotorEx.class, "bl");
        br = hardwareMap.get(DcMotorEx.class, "br");

        fl.setDirection(DcMotorSimple.Direction.REVERSE);
        bl.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();
        while (opModeIsActive() && !isStopRequested()) {
            //code will run in here while the opmode is active
            double flPower = +gamepad1.left_stick_x - gamepad1.left_stick_y + gamepad1.right_stick_x;
            double frPower = -gamepad1.left_stick_x - gamepad1.left_stick_y - gamepad1.right_stick_x;
            double blPower = -gamepad1.left_stick_x - gamepad1.left_stick_y + gamepad1.right_stick_x;
            double brPower = +gamepad1.left_stick_x - gamepad1.left_stick_y - gamepad1.right_stick_x;



        }
    }
}
