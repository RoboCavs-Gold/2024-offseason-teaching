rFTC Robocavs Gold (#8479) Repository for the 2023-2024 Centerstage Season
Written by: Visu Vasa


Features:
- Road Runner Integration with 3-wheel Deadwheel Odometry system for accurate autonomous robotic navigation
	- C++ addition might be made soon, if it's not completed by the end of the season I'll create a separate repo and share it with the robocavs gold account
- Subsystem hierarchy for grouping hardware interfaces and code organization
- 1 camera vision system for AprilTag detection, pose managment used in conjunction with roadrunner systems to maintain accuracy when moving
- Cool thing in auto that allows us to choose our routes during auto in order to cater to the autos of other teams and maximize points scored and effective robot placement for TeleOp
- Finite State Machine used to determine state and account for all possibilites of our robot in a certain scenario. Used for accuracy and to allow for multitasking within autonomous and TeleOp routines
- Robot position lock to forcefully contain scoring during auto (and teleop if we want but idk if its good or not for that)
- Auto scoring thing so we dont have to constantly line up to score (it does it for us)
- 2+6 autonomous, one of the highest autos in the world (score the two preloads, and then score 6 extra pixels from the stack)
- 75 point auto (120 with a good team!)
