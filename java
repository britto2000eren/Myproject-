basic java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
    }
}


variable 
public class Main {
    public static void main(String[] args) {
        int age = 23;
        String name = "Britto";
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


if/else
public class Main {
    public static void main(String[] args) {
        int marks = 75;

        if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}


loop
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
    }
}


array
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        for(int n : numbers){
            System.out.println(n);
        }
    }
}


method/function 
public class Main {

    static void greet(String name){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        greet("Britto");
    }
}


class and objectives 
class Student {
    String name = "Britto";
    int age = 23;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}


inheritance 
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}



exception handling 
public class Main {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


java + MySQL 
import java.sql.*;

public class DBConnect {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );

            System.out.println("Database Connected!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}