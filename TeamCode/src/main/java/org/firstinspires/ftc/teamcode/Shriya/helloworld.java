package org.firstinspires.ftc.teamcode.Shriya;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp (name="helloworldshriya")
public class helloworld extends LinearOpMode {
    ////means everything can see this motor ("means that this motor IS a motor" - Visu)
    public DcMotorEx fl,fr,bl,br;
    @Override
    public void runOpMode() throws InterruptedException {
        //getting the hardware map, getting motor, identifying motor
    fl = hardwareMap.get(DcMotorEx.class, "fl");
    fr = hardwareMap.get(DcMotorEx.class, "fr");
    bl = hardwareMap.get(DcMotorEx.class, "bl");
    br = hardwareMap.get(DcMotorEx.class, "br");

        fl.setDirection(DcMotorSimple.Direction.REVERSE);
        bl.setDirection(DcMotorSimple.Direction.REVERSE);
    //waiting for you to press play on the driving station. "motor.setDirection(DcMotorSimple.Direction.Reverse)" will change the direction
        waitForStart();
        //where the loop is on
        while(opModeIsActive() && !isStopRequested()) {
            //code will run in here while the opmode is active  waitForStart();
                      while (opModeIsActive() && !isStopRequested()) {
                          //code will run in here while the opmode is active
                          double flPower = +gamepad1.left_stick_x - gamepad1.left_stick_y + gamepad1.right_stick_x;
                          double frPower = -gamepad1.left_stick_x - gamepad1.left_stick_y - gamepad1.right_stick_x;
                          double blPower = -gamepad1.left_stick_x - gamepad1.left_stick_y + gamepad1.right_stick_x;
                          double brPower = +gamepad1.left_stick_x - gamepad1.left_stick_y - gamepad1.right_stick_x;

                          if (gamepad1.left_bumper) {
                              fl.setPower(flPower / 3);
                              fr.setPower(frPower / 3);
                              bl.setPower(blPower / 3);
                              br.setPower(brPower / 3);

                          } else {
                              fl.setPower(flPower);
                              fr.setPower(frPower);
                              bl.setPower(blPower);
                              br.setPower(brPower);
                          }

                      } // end of while
        }
    }
}


