package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class meepmeepother {
    public static void main(String[] args) {
        MeepMeep meep = new MeepMeep(700);

        RoadRunnerBotEntity meepmeep = new DefaultBotBuilder(meep)
                .setConstraints(60, 55, 4.115477328170351, Math.toRadians(194.6310524271845), 13.65)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-31, 62.7, Math.toRadians(270)))
                                //.lineToLinearHeading(new Pose2d(-31.6, 31.8, Math.toRadians(0)))
                                //.lineToLinearHeading(new Pose2d(-36.3, 10, Math.toRadians(90)))
                                .lineTo(new Vector2d(-46.1, 41.5))

                                //line up
                                .splineToLinearHeading(new Pose2d(-36.3, 10.1, Math.toRadians(180)), 180)
                                .lineTo(new Vector2d(31, 13.7))

                                //for the center case specifically
                                //.splineToLinearHeading(new Pose2d(31, 13.7, Math.toRadians(180)), Math.toRadians(180))
                                //go through

                                //go to the board
                                .splineToLinearHeading(new Pose2d(50.5, 43.5, Math.toRadians(180)), Math.toRadians(0))
                                .build()
                );
        meep.setBackground(MeepMeep.Background.FIELD_CENTERSTAGE_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(meepmeep)
                .start();
    }
}
