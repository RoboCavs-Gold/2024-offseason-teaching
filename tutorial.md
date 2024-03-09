# Tutorial

Our team has used a mix of the FtcRobotController along with the Android Studio Platform in order
to build our opModes for competition. Please don't use blocks or onBotJava, they're not very good
and they make the team look bad.

## How it works:

Let's start from the top. Make sure your Control Hub and Driver Hub are both updated to the latest 
firmware and that you have downloaded the FtcRobotController app and loaded it into Android Studio.

Your code will go into the TeamCode folder, just go through the file hierarchy until you get to the 
readme.md file and make a Java file in that. 

## Start

You can check out our code, but you'll need some experience with the Java programming language in
order to understand what's going on. We've adopted a subsystem hierarchy to support our code. That 
means that if you want to see something related to the claw, for instance, you would go to the claw
class. 

# Components

## The Robot Class (opModeHardware)

The robot class is where all of the subsystems are initialized and defined. Usually, when developing
an op mode, you don't want to have to copy and paste all of the initialization stuff every time,
so initializing it all in one file makes writing new programs so much easier.

## Hardware Constants

This is where all of the system-wide variables will be defined. For example, if you want your
lift to know when the claw has just finished depositing, here are the steps:

1. Write some code in the subsystem file to get it to deposit the pixels
2. Create an enumeration (reference the java docs if you don't know what this is) in the HardwareConstants.java file and include all of the states you want your claw to be in
3. Make the claw deposit using your new enumeration
4. You're done! Now, your lift can reference the HardwareConstants.java file in its code

When implementing this, make sure that your file hierarchy works and that every file can reference
to HardwareConstants when it needs to.

## Subsystems

This is the meat of your code, where all of the main stuff for controlling different physical
things on the robot are written. In professional terms, this is called an interface, because it 
connects the hardware and software with each other. While it may seem counterintuitive to separate
components which are supposed to work together, inheritance allows you to create and share data
between components through the HardwareConstants.java file (ideal) or OpModeHardware (in a rush). 

### Breakdown

Here's some step-by-step instructions for programming a lift subsystem (our V-rail lift) that
requires information from the claw subsystem to maximize efficiency and teleop automation

1. Initialize the motors needed for the lift. Put all of your variables in the HardwareConstants file
2. Write the constructor, which should take in the hardwareMap object from the opModeHardware class (where it will be initialized) and perform initialization. 
3. Write the lift methods, as if you were writing it in a regular class. Just remember that some objects like the gamepad might have to be referenced from the opMode object (like opMode.gamepad1. ...)
4. Any information the lift needs from the claw should be referenced from the hardwareMap class.


# Implementations

In this section, I'll explain how some of the things in our code work and how they're implemented
so that it's easier to understand and implement in your own code. Note that a lot of this stuff
is very complex, so if you don't know what you're doing please get some more experience before trying.

## Drivetrain

We use a field-centric drive using the 2 parallel dead wheel encoders and a bit of math using the
gamepad. Check the Drivetrain.java file for more details about how it works.

## PIDF Controller

A PIDF Controller (Proportional, Integral, Derivative, Feedforward) is a form of closed-loop control
that allows you to get a lot of control over a motor or CR servo's movement. Check out the 
PIDFController.java file for a low-level implementation of this. 