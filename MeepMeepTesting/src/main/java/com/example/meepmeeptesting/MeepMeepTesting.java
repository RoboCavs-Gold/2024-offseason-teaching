package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

import java.util.Vector;

public class MeepMeepTesting {

    public static void main(String[] args) {
        MeepMeep meep = new MeepMeep(700);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(55, 55, 4.115477328170351, Math.toRadians(194.6310524271845), 14.65)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(15, 62.7, Math.toRadians(270)))
                                //.lineTo(new Vector2d(22.7,46.4)) //vision spike left
                                //.lineTo(new Vector2d(16,33.7)) //vision spike middle
                                //.lineToLinearHeading(new Pose2d(6.5,41.4,  Math.PI / 3)) //vision spike right
                                .lineToLinearHeading(new Pose2d(10,35,  Math.toRadians(180)))


                                //.splineToLinearHeading(new Pose2d(47.1, 41.1, Math.toRadians(180)), Math.toRadians(0)) //board spot left
                                //.splineToLinearHeading(new Pose2d(47.1, 34.7, Math.toRadians(180)), Math.toRadians(0)) //board spot middle
                                .lineToLinearHeading(new Pose2d(47.1, 28.4, Math.toRadians(180))) //board spot right

                                //FIRST PASS

                                .lineTo(new Vector2d(46, 41.1)) //left to align
                                //.lineTo(new Vector2d(46, 34.7)) //middle to align
                                //.lineTo(new Vector2d(46, 28.4)) //right to align

                                .splineTo(new Vector2d(29,10), Math.toRadians(180)) //align with the backstage door
                                .splineTo(new Vector2d(-36.3, 10), Math.toRadians(180)) //go through door

                                //.splineTo(new Vector2d(11,59.6), Math.toRadians(180)) //align with the truss
                                //.splineTo(new Vector2d(-36,59.6), Math.toRadians(180)) //go through the truss

                                .splineTo(new Vector2d(-58, 11.8), Math.toRadians(180)) //go to left pixel stack
                                //.splineTo(new Vector2d(-58, 23.8), Math.toRadians(180)) //go to middle pixel stack
                                //.splineTo(new Vector2d(-58, 35.6), Math.toRadians(180)) //go to right pixel stack
                                .waitSeconds(0.5)

                                //NOW WE GO BACK

                                .lineTo(new Vector2d(-56, 11.8)) //go back a little from the left pixel stack
                                //.lineTo(new Vector2d(-56, 23.8)) //go back a little from the middle pixel stack
                                //.lineTo(new Vector2d(-56, 35.6)) //go back a little from the right pixel stack

                                .splineTo(new Vector2d(-36.3,10), Math.toRadians(0)) //line up with the backstage door
                                .splineTo(new Vector2d(10,10), Math.toRadians(0)) //go through

                                //.splineTo(new Vector2d(-36,59.6), Math.toRadians(0)) //go through the truss
                                //.splineTo(new Vector2d(11,59.6), Math.toRadians(0)) //align with the truss

                                //.splineToLinearHeading(new Pose2d(47.1, 41.1, Math.toRadians(180)), Math.toRadians(0)) //board spot left
                                //.splineToLinearHeading(new Pose2d(47.1, 34.7, Math.toRadians(180)), Math.toRadians(0)) //board spot middle
                                .splineToLinearHeading(new Pose2d(47.1, 28.4, Math.toRadians(180)), Math.toRadians(0)) //board spot right
                                .waitSeconds(0.5)

                                //SECOND PASS

                                //.lineTo(new Vector2d(46, 41.1)) //left to align
                                //.lineTo(new Vector2d(46, 34.7)) //middle to align
                                .lineTo(new Vector2d(46, 28.4)) //right to align

                                .splineTo(new Vector2d(10,10), Math.toRadians(180)) //align with the backstage door
                                .splineTo(new Vector2d(-36.3, 10), Math.toRadians(180)) //go through door

                                //.splineTo(new Vector2d(11,59.6), Math.toRadians(180)) //align with the truss
                                //.splineTo(new Vector2d(-36,59.6), Math.toRadians(180)) //go through the truss

                                .splineTo(new Vector2d(-58, 11.8), Math.toRadians(180)) //go to left pixel stack
                                //.splineTo(new Vector2d(-58, 23.8), Math.toRadians(180)) //go to middle pixel stack
                                //.splineTo(new Vector2d(-58, 35.6), Math.toRadians(180)) //go to right pixel stack
                                .waitSeconds(0.5)

                                //NOW WE GO BACK

                                .lineTo(new Vector2d(-56, 11.8)) //go back a little from the left pixel stack
                                //.lineTo(new Vector2d(-56, 23.8)) //go back a little from the middle pixel stack
                                //.lineTo(new Vector2d(-56, 35.6)) //go back a little from the right pixel stack

                                .splineTo(new Vector2d(-36.3,10), Math.toRadians(0)) //line up with the backstage door
                                .splineTo(new Vector2d(10,10), Math.toRadians(0)) //go through

                                //.splineTo(new Vector2d(-36,59.6), Math.toRadians(0)) //go through the truss
                                //.splineTo(new Vector2d(11,59.6), Math.toRadians(0)) //align with the truss

                                //.splineToLinearHeading(new Pose2d(47.1, 41.1, Math.toRadians(180)), Math.toRadians(0)) //board spot left
                                //.splineToLinearHeading(new Pose2d(47.1, 34.7, Math.toRadians(180)), Math.toRadians(0)) //board spot middle
                                .splineToLinearHeading(new Pose2d(47.1, 28.4, Math.toRadians(180)), Math.toRadians(0)) //board spot right
                                .waitSeconds(0.5)

                                //THIRD PASS??? (only in some scenarios)

                                //.lineTo(new Vector2d(46, 41.1)) //left to align
                                //.lineTo(new Vector2d(46, 34.7)) //middle to align
                                .lineTo(new Vector2d(46, 28.4)) //right to align

                                .splineTo(new Vector2d(10,10), Math.toRadians(180)) //align with the backstage door
                                .splineTo(new Vector2d(-36.3, 10), Math.toRadians(180)) //go through door

                                //.splineTo(new Vector2d(11,59.6), Math.toRadians(180)) //align with the truss
                                //.splineTo(new Vector2d(-36,59.6), Math.toRadians(180)) //go through the truss

                                .splineTo(new Vector2d(-58, 11.8), Math.toRadians(180)) //go to left pixel stack
                                //.splineTo(new Vector2d(-58, 23.8), Math.toRadians(180)) //go to middle pixel stack
                                //.splineTo(new Vector2d(-58, 35.6), Math.toRadians(180)) //go to right pixel stack
                                .waitSeconds(0.5)

                                //NOW WE GO BACK

                                .lineTo(new Vector2d(-56, 11.8)) //go back a little from the left pixel stack
                                //.lineTo(new Vector2d(-56, 23.8)) //go back a little from the middle pixel stack
                                //.lineTo(new Vector2d(-56, 35.6)) //go back a little from the right pixel stack

                                .splineTo(new Vector2d(-36.3,10), Math.toRadians(0)) //line up with the backstage door
                                .splineTo(new Vector2d(10,10), Math.toRadians(0)) //go through

                                //.splineTo(new Vector2d(-36,59.6), Math.toRadians(0)) //go through the truss
                                //.splineTo(new Vector2d(11,59.6), Math.toRadians(0)) //align with the truss

                                //.splineToLinearHeading(new Pose2d(47.1, 41.1, Math.toRadians(180)), Math.toRadians(0)) //board spot left
                                //.splineToLinearHeading(new Pose2d(47.1, 34.7, Math.toRadians(180)), Math.toRadians(0)) //board spot middle
                                .splineToLinearHeading(new Pose2d(47.1, 28.4, Math.toRadians(180)), Math.toRadians(0)) //board spot right
                                .waitSeconds(0.5)
                                //PARK
                                //.lineToLinearHeading(new Pose2d(50, 15.5, Math.toRadians(210))) //park right
                                .lineToLinearHeading(new Pose2d(50, 59.4, Math.toRadians(225)))
                                .build()
                );

        meep.setBackground(MeepMeep.Background.FIELD_CENTERSTAGE_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}
