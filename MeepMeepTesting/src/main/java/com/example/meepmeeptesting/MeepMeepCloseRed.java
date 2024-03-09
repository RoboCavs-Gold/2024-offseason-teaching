package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepCloseRed {

    public static void main(String[] args) {
        MeepMeep meep = new MeepMeep(800);

        RoadRunnerBotEntity meepmeep = new DefaultBotBuilder(meep)
                .setConstraints(55, 55, 4.115477328170351, Math.toRadians(194.6310524271845), 13.65)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d((14.65 / 2) + 1, -62.7, Math.toRadians(90)))
                                .lineTo(new Vector2d(22.7,-44.4)) //right
                                //.lineTo(new Vector2d(16,-33.7)) //vision spike middle
                                //.lineToLinearHeading(new Pose2d(6.5,-41.4,  5 * Math.PI / 3)) //vision spike left

                                //.splineToLinearHeading(new Pose2d(47.1, -41.1, Math.toRadians(180)), Math.toRadians(0)) //board spot right
                                //.splineToLinearHeading(new Pose2d(47.1, -34.7, Math.toRadians(180)), Math.toRadians(0)) //board spot middle
                                .splineToLinearHeading(new Pose2d(47.1, -28.4, Math.toRadians(180)), Math.toRadians(0)) //board spot left

                                //.lineTo(new Vector2d(46, -41.1)) //right to align
                                //.lineTo(new Vector2d(46, -34.7)) //middle to align
                                .lineTo(new Vector2d(46, -28.4)) //left to align

                                .splineTo(new Vector2d(10,-10), Math.toRadians(180)) //align with the backstage door
                                .splineTo(new Vector2d(-36.3, -10), Math.toRadians(180)) //go through door

                                .splineTo(new Vector2d(-58, -11.8), Math.toRadians(180)) //go to right pixel stack

                                .waitSeconds(0.5)

                                .lineTo(new Vector2d(-56, -11.8))

                                .splineTo(new Vector2d(-36.3,-10), Math.toRadians(0)) //line up with the backstage door
                                .splineTo(new Vector2d(10,-10), Math.toRadians(0)) //go through

                                .splineToLinearHeading(new Pose2d(47.1, -34.7, Math.toRadians(180)), Math.toRadians(0)) //board spot middle

                                .lineTo(new Vector2d(46, -34.7)) //middle to align

                                .splineTo(new Vector2d(10,-10), Math.toRadians(180)) //align with the backstage door
                                .splineTo(new Vector2d(-36.3, -10), Math.toRadians(180)) //go through door

                                .splineTo(new Vector2d(-58, -11.8), Math.toRadians(180)) //go to right pixel stack

                                .waitSeconds(0.5)

                                .lineTo(new Vector2d(-56, -11.8))

                                .splineTo(new Vector2d(-36.3,-10), Math.toRadians(0)) //line up with the backstage door
                                .splineTo(new Vector2d(10,-10), Math.toRadians(0)) //go through

                                .splineToLinearHeading(new Pose2d(47.1, -34.7, Math.toRadians(180)), Math.toRadians(0))//score

                                .lineTo(new Vector2d(46, -34.7)) //middle to align

                                .splineTo(new Vector2d(10,-10), Math.toRadians(180)) //align with the backstage door
                                .splineTo(new Vector2d(-36.3, -10), Math.toRadians(180)) //go through door

                                .splineTo(new Vector2d(-58, -23.8), Math.toRadians(180)) //go to middle pixel stack

                                .waitSeconds(0.5)

                                .lineTo(new Vector2d(-56, -23.8))

                                .splineTo(new Vector2d(-36.3,-10), Math.toRadians(0)) //line up with the backstage door
                                .splineTo(new Vector2d(10,-10), Math.toRadians(0)) //go through

                                .splineToLinearHeading(new Pose2d(47.1, -34.7, Math.toRadians(180)), Math.toRadians(0))//score

                                //.lineToLinearHeading(new Pose2d(47.1, -59.4, Math.toRadians(135)))
                                .build()

                        );
        meep.setBackground(MeepMeep.Background.FIELD_CENTERSTAGE_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(meepmeep)
                .start();
    }
}
