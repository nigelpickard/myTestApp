READ ME

STARTING:
---------
I made sure I had the following:

i. Maven 3+ (note, I had to remove Maven2 from the machine I was working on).  See sudo apt-get purge... etc
ii. I made sure I had Java 8 installed on the machine.  For Ubuntu I had to use alternatives to install the jvm.
iii. I made sure I had git installed.
iv. I made sure that Eclipse was installed and configured to use the appropriate jvm and git
v. I made sure I could connect to my github page and then configured the remote repo to be that 
e.g. https://github.com/nigelpickard/myTestApp.git

HOW TO RUN:
-----------
Within the package explorer, I right clicked the pom.xml and ran as maven install.

Initially the project was showing a problem with spring framework dependencies. This was cured by 
right clicking on the project, selecting configure and then configure to Maven project.

To run it, I right clicked on Run as... Run Configurations.  Editing a run configuration and putting 
this in the goal: spring-boot:run

ISSUES:
-------
I'd included spring security,so you have to log in as a user and provide a password... problem is,
I don't know the user and password.

The default user is "user", and the password is a random password generated at startup, check the 
log, e.g. Using default security password: 4d74dc5e-a723-46b9-8550-216c93789c69