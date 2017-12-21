For this project I have used Spring Boot and MySQL Database.
1) Open the web service project in STS(Spring Tool Suite).
   STS provides a SpringBoot wizzard that imports the project to the IDE.

2) pom.xml is Maven build system project file.

3) application.properties is Properties file to configure the application.
   i)While running first time:
   Remove comment from spring.jpa.hibernate.ddl-auto=create line.
   Comment the line spring.jpa.hibernate.ddl-auto =update       
   ii) #Comment the ddl-auto line after the first time you run the                   application
       #spring.jpa.hibernate.ddl-auto=create
   iii) To creae Database for first time, remove comment from following line:
      spring.datasource.url=jdbc:mysql://localhost:3306/contact?                                           createDatabaseIfNotExist=true
      then comment it again after running the first time.
   iv) Remove comment from the line: 
       spring.jpa.hibernate.ddl-auto =update

Note: The user name and password are according to MySQL database in my laptop. It can be changed accordingly from application.properties file.

4) I have written one test case for Get.
  (Mockito library for mocks and assertions).




Sameeksha Sen Thakuri