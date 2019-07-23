# BlockTower17
Block Tower is a game inspired from 'Plants vs Zombies'. 

Project for CPSC 231

Group 17:
Nicholas McLaughlin
Kelly Osena
Uijin Park
Mubarak Adetunji
Luisa Vargas

== Installation ==
Use the link https://github.com/nicholas-mclaughlin/BlockTower17 to download the project BlockTower17. 

To run demo1 you will have to go our repository and download, compile and run MainClass.java.

== Running and compiling ==
To run demo1 you will have to go our repository and download, compile and run MainClass.java.




Block Tower is an animation game inspired from 'Plants vs Zombies'. 

How our game works:

As seen in the class diagram there is a class called GameCharacter which has all the basic attributes that all the other animations would have in the game. Then from that there is a sub-class Plants which is the super-class of the classes: PeaShooter, Wallnut, FrozenPeashooter, CherryBomb and Sunflower. Each of these classes are slightly different in things like abilities, health and attack.

There is also another sub-class of GameCharacter which is called Zombie and this is the super-class of ConeHeadZombie, FootballZombie and FlagZombie. Each of these classes are also slightly different in things like speed and health.

For our first demo we have a text-based version. For this we have the class PlantsVsZombies in which we have the 2-d array which stores objects of the class Plants which is called Garden which is basically the garden in which the different plants can be placed and the method prints a visual of the Garden in the console. In this demo where we have the MainClass in which we create a object called level1 from the PlantsVsZombies class. In this the user is prompted whether they want to play the game and the user has the option of typing in 'y' or 'n'. If 'n' is entered then the program will end and if something other than these two options are entered the user will be prompted again. When 'y' is entered the user is prompted which plant they want to add and in which row and column. After, the console will print out a visual of the garden with the first character of the plant added in the row and column chosen.

==References for code development==
1) Nathaly Verwaal. Lectures and course material from CPSC 233 Summer 2019.
2) Java Official Oracle Documentation
