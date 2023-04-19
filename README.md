# CallObject-Application

##### :purple_square: Its a Web Application
## :one: Frameworks and Languages Used -
    1. SpringBoot
    2. JAVA
    3. Postman
---------------------------------------------------------------------------------------------------------------------------------

## :two: Dataflow (Functions Used In)
### :purple_square: 1. ComponentScan - We have used one model which is Visit.java
#### :o: Teacher.java
```java
@Component

public class Teacher {
    public String teach(){
        return "She is teaching spring boot";
    }
}
```
------------------------------------------------------------------------------------------------------------
### :purple_square: 2. Controller - We have used one model which is Visit.java
#### :o: TeacherController.java

```java
@RestController
public class TeacherController {
    @Autowired
    Teacher t1; // with the help of Autowired object is automatically created for t1...........whenever it comes in use.

    @RequestMapping(value = "/teach" , method = RequestMethod.GET)
    public String teach(){
        return t1.teach();
    }
}
```
#### :o: StudentController.java

```java
@RestController // It is used to tell our application that this is a controller class so when ever a
// API hits it first interact with the controller class.
public class StudentController {
    @Autowired
    @Qualifier("Shruti")
    Student s1;

    @GetMapping("/student")
    public Student getStudent(){
        return s1;
    }
}
```
#### To See Controller
:white_check_mark: [Controller](https://github.com/Anushri-glitch/CallObject-Application/tree/master/src/main/java/com/Shrishti/CallObjectApplication/Controller)
-----------------------------------------------------------------------------------------------------------------
### :purple_square: 3. CustomConfiguration.java
```java
@Configuration // What ever objects will be created in this class that spring will call them we will not call them.
@ComponentScan(basePackages = {"ComponentScan"})
public class CustomConfiguration {

    @Bean("Anushka")
    @Lazy
    public Student getStudent1(){
        System.out.println("Spring call... in config bean of student");
        return new Student("Anushka");
    }
}
```
#### To See CustomConfiguration
:white_check_mark: [CustomConfiguration](https://github.com/Anushri-glitch/CallObject-Application/blob/master/src/main/java/com/Shrishti/CallObjectApplication/CustomConfiguration.java)
-------------------------------------------------------------------------------------------------------------------
### :purple_square: 4. Student.java
```java
public class Student {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Student(String name) {
        this.name = name;
        System.out.println("Student called from spring framework-2 :" + this.name);
    }
}
```
#### To See Student
:white_check_mark: [Student.java](https://github.com/Anushri-glitch/CallObject-Application/blob/master/src/main/java/com/Shrishti/CallObjectApplication/Student.java)
--------------------------------------------------------------------------------------------------------------------

## :three: Configurations Used in Project
    1. @Bean
    2. @Component
    3. @Lazy
    4. @Autowired
    5. @RestController
    6. @Qualifier
--------------------------------------------------------------------------------------------------------------------

## :four: Project Summary
### :o: Project result 
#### :purple_square: Calling Student API - http://localhost:8080/student

![Screenshot (738)](https://user-images.githubusercontent.com/47708011/233045680-d4995d09-8f7f-41c9-8cf5-477e94e15037.png)

#### :purple_square: Calling Teacher API - http://localhost:8080/teach

![Screenshot (739)](https://user-images.githubusercontent.com/47708011/233045984-2a7eab8b-4ad5-4af2-bfcf-d93b1532b9be.png)

    
    
    
    
    
    
    
    
    
    
    
    
