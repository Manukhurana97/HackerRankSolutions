package pack;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

class Student1 {


    int id;
    String name;
    float cgpa;

    Student1(int id, String name, float cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getCgpa() {
        return cgpa;
    }
}

class Priorities {

    List<Student1> getStudents(List<String> events) {
        PriorityQueue<Student1> queue = new PriorityQueue<>(
                Comparator.comparing(Student1::getCgpa).reversed()
                        .thenComparing(Student1::getName)
                        .thenComparing(Student1::getId));

        List<Student1> list = new ArrayList<>();
        Student1 data = null;
        for (String st : events) {
            Scanner sc = new Scanner(st);
            String event = sc.next();
            if (event.equals("ENTER")) {
                String name = sc.next();
                float cgpa = sc.nextFloat();
                int id = sc.nextInt();
                Student1 student1 = new Student1(id, name, cgpa);
                queue.add(student1);
            } else if (event.equals("SERVED")) {
                Student1 student1 = queue.poll();
            }
            sc.close();
//            display data by poping each ;
            Student1 student1 = queue.poll();
            if (student1 == null) {
                return list;
            } else {
                while (student1 != null) {
                    list.add(student1);
                    student1 = queue.poll();

                }
            }


        }
        return list;

    }
}


public class javapriorityqueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student1> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student1 st : students) {
                System.out.println(st.getName());
            }
        }
    }
}