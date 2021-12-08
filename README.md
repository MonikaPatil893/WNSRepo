# Prerequisite

1. Your machine should have internet connection.
2. Your machine should have Java 1.8 installed.
3. Your machine should have any IDE (ex : Eclipse IDE,Intellij etc).
4. Your machine should have maven version 3.6.3 installed.
5. Your machine should have chrome browser installed with supported driver 96.
6. All the sytem environment eg. JAVA_HOME,MAVEN_HOME and path should be configured.
7. GIT version tool setup in your system.(Assumption is that you already have config setup with your git).

# Framework component
1) Test cases- Test cases can be retrived from path "WNSRepo/src/test/java/TestCases/"
2) UIPages - Ui Pages can be retrived from path "WNSRepo/src/test/java/UIPages"
3) Chromwe drier - chrome driver is pasted in "WNSRepo/Drivers/"
4) TestNg Xml is putted in path "WNSRepo/testng.xml"
 
# For Script execution 

If you have eclipse IDE setup in your machine then clone the project from remote GIT to your local.
Follow these steps : 
1. Create any folder in your drive and Open git bash on that folder
2. type git clone https://github.com/monikabpatil893/WNSRepo.git
3. Once all the files and folders are extracted in your local folder then copy path.
4. Open Eclipse IDE and select project from the file system and type the path.
5. Make sure all the file and folder are appeared to eclipse project heirarchy.
6. Once done right click on the TestNg.xml file and run as TestNg suite. 

Once the execution is done go to the reports folder present in the test-output folder. Click on the index.html.

This way you will able to execute the scripts and see the results.




