import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        Student student1 = new Student();
            student1.setImie("Pawel");
            student1.setNazwisko("Kjsiown");
            student1.setIndeks(02323);
        Student student2 = new Student();
            student2.setImie("Piotr");
            student2.setNazwisko("Kapwesjskow");
            student2.setIndeks(93482);
        Student student3 = new Student();
            student3.setImie("Jan");
            student3.setNazwisko("Lsefdjsj");
            student3.setIndeks(27382);
        Student student4 = new Student();
            student4.setImie("Lena");
            student4.setNazwisko("OSDwms");
            student4.setIndeks(83483);
        Student student5 = new Student();
            student5.setImie("Kanrad");
            student5.setNazwisko("TSfdj");
            student5.setIndeks(938472);

        List<Student> studentlist = new ArrayList<>();
        studentlist.add(student1);
        studentlist.add(student2);
        studentlist.add(student3);
        studentlist.add(student4);
        studentlist.add(student5);
        for(Student s : studentlist){
            System.out.println(s.getIndeks() + " - " + s.getImie() + " - " + s.getNazwisko());
        }


    }
}
