import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();

        student.bol1 = true;
        student.int1 = 38;
        student.str1 = "oqkkaksl";
        student.str2 = "suuuuper";
        student1.bol1 = false;
        student1.int1 = 93;
        student1.str1 = "lslslk";
        student1.str2 = "huuu";
        student2.bol1 = false;
        student2.int1 = 993;
        student2.str1 = "llsao";
        student2.str2 = "iiaos";

        Student[] tab = new Student[]{student, student1, student2};
        for(Student zmienna : tab){
            System.out.print(zmienna + " ");
        }


    }
}
