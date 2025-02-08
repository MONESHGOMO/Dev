# Prerequisites to Run the Code

Before running the Spring Boot project, ensure you have the following installed and configured:

- **MySQL** (Database management system) [Tamil Video to install(https://youtu.be/gsvYvufx1e0?si=g2YNYjSBLIOrROX6)
- **IntelliJ IDEA** (Preferred IDE for Java development) [Video to install](https://youtu.be/Z0PYQ3hsdXI?si=K2qWHnARNaXCM5Md)
- **Java JDK** (Required for running Java applications) [video to install JDK](https://youtu.be/R6MoDMASwag?si=aEQ1VQm1aahHE0ns)

## Steps to Run the Backend Code

1. **Open the Backend Folder:**
   - Navigate to the backend folder of your project.
   - Open it using IntelliJ IDEA.

2. Go to your MySQL DB and create a new DataBase named as studio or use your own DB name but the DB name what you mention here the same DB name wants to mention in application.properties file 
3. **Configure Database Connection:**

   - In IntelliJ, go to `src/main/resources/application.properties`.
   - Set the following properties according to your database configuration:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/YOUR_DB_NAME 
     spring.datasource.username=root (default nusername for mysql is root) 
     spring.datasource.password=YOUR_DB_PASSWORD 
     ```

4. **Run the Spring Boot Application:**
   - Open the integrated terminal in IntelliJ IDEA.
   - Run the following command to start the application:
     ```sh
     mvn spring-boot:run
     ```

5. **Verify Database Table Creation:**
   - After the application starts, check your MySQL database is running now 
   - Refresh the database and confirm that the table `AppointmentRequest` is created. with the columns 

## Additional Notes
- If the table is not created, check the application logs for errors.
- Ensure MySQL service is running before executing the command.

---

This documentation serves as a guide to setting up and running the Spring Boot backend for the project.

