package by.overone.lesson20;


import java.util.*;
import java.util.stream.IntStream;

public class TrainingGroup {
    public static void main(String[] args) {
        List<Lists> listOfMarks = new ArrayList<>();
        Lists student1 = new Lists();
        Lists student2 = new Lists();
        Lists student3 = new Lists();
        Lists student4 = new Lists();
        Random randNumber = new Random();
        student1.setMark(randNumber.nextInt(10) + 1);
        student2.setMark(randNumber.nextInt(10) + 1);
        student3.setMark(randNumber.nextInt(10) + 1);
        student4.setMark(randNumber.nextInt(10) + 1);
        listOfMarks.add(student1);
        listOfMarks.add(student2);
        listOfMarks.add(student3);
        listOfMarks.add(student4);
        ListIterator<Lists> listIterator1 = listOfMarks.listIterator();
        while (listIterator1.hasNext()) {
            Lists element = listIterator1.next();
            System.out.println(element);
        }
        Iterator<Lists> it = listOfMarks.iterator();
        while (it.hasNext()) {
            Lists student = it.next();
            if (student.getMark() == 3 || student.getMark() == 2 || student.getMark() == 1) {
                it.remove();
            }
        }
        System.out.println("List of marks without bed marks: ");
        ListIterator<Lists> listIterator2 = listOfMarks.listIterator();
        while (listIterator2.hasNext()) {
            Lists element = listIterator2.next();
            System.out.println(element);
        }
        int k = 10;
        Iterator<Lists> iterator3 = listOfMarks.iterator();
        while (iterator3.hasNext()) {
            Lists student = iterator3.next();
            if (student.getMark() == k) {
                System.out.println("Highest mark: " + student.getMark());
            } else {
                k--;
            }
        }
    }

}


