package week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("a", "B", 1, marksGenerator()));
        students.add(new Student("b", "A", 2, marksGenerator()));
        students.add(new Student("c", "C", 1, marksGenerator()));
        students.add(new Student("d", "A", 3, marksGenerator()));
        students.add(new Student("e", "D", 4, marksGenerator()));
        students.add(new Student("f", "B", 3, marksGenerator()));
        students.add(new Student("g", "C", 1, marksGenerator()));

        studentsByCourse(students, 1);
        System.out.println();

        System.out.println(students + "---" + students.size());
        System.out.println();
        removeOrUp(students);
        System.out.println(students + "---" + students.size());
    }

    private static HashMap<String, Integer> marksGenerator() {
        Random r = new Random();
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Math", r.nextInt(4)+1);
        marks.put("Phy", r.nextInt(4)+1);
        marks.put("Eng", r.nextInt(4)+1);
        marks.put("Geo", r.nextInt(4)+1);
        return marks;
    }

    private static void removeOrUp(List<Student> list) {
        for (int i = list.size()-1; i >= 0; i--) {
            double sum = 0;
            double count = 0;
            for (Map.Entry<String, Integer> entries : list.get(i).getMarks().entrySet()) {
                sum += entries.getValue();
                count++;
            }
            if ((sum / count) >= 3.0) {
                list.get(i).setCourse(list.get(i).getCourse() + 1);
            } else list.remove(i);
        }
    }

    private static void studentsByCourse(List<Student> list, Integer course) {
        list.stream().filter(e -> e.getCourse() == course).forEach(System.out::println);
    }


    private static class Student {
        private String name;
        private String group;
        private int course;
        private HashMap<String, Integer> marks;

        public Student(String name, String group, int course, HashMap<String, Integer> marks) {
            this.name = name;
            this.group = group;
            this.course = course;
            this.marks = marks;
        }

        public int getCourse() {
            return course;
        }

        public HashMap<String, Integer> getMarks() {
            return marks;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name " + name +
                    ", group='" + group + '\'' +
                    ", course=" + course +
                    ", marks=" + marks +
                    '}';
        }
    }
}
