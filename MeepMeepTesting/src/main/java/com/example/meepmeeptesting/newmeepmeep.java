package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class newmeepmeep {

    public static void main(String[] args) {
        MeepMeep meep = new MeepMeep(800);

        RoadRunnerBotEntity meepmeep = new DefaultBotBuilder(meep)
                .setConstraints(60, 55, 4.115477328170351, Math.toRadians(194.6310524271845), 13.65)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d((14.65 / 2) + 1, 62.7, Math.toRadians(270)))
                                .lineTo(new Vector2d(22.7,48))
                                .lineTo(new Vector2d(22.7, 52))
                                .splineToLinearHeading(new Pose2d(48.6, 43.1, Math.toRadians(180)), Math.toRadians(0))
                                .lineTo(new Vector2d(45, 41.1))
                                .splineToLinearHeading(new Pose2d(29,11, Math.toRadians(180)), Math.toRadians(180)) //align with the backstage door
                                .splineTo(new Vector2d(-36.3, 11), Math.toRadians(180)) //go through door

                                .splineTo(new Vector2d(-58, 6), Math.toRadians(180))
                                .turn(20)
                                .lineTo(new Vector2d(-56, 6))


                                .splineTo(new Vector2d(-36.3,6), Math.toRadians(0)) //line up with the backstage door
                                .build()
                );
        meep.setBackground(MeepMeep.Background.FIELD_CENTERSTAGE_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(meepmeep)
                .start();

    }
}
