public class Student {
            /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */
    private String imie, nazwisko;
    private int indeks;

    public void setImie(String x){
        this.imie= x;
    }
    public void setNazwisko(String x){
        this.nazwisko= x;
    }
    public void setIndeks(int x){
        this.indeks= x;
    }

    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public int getIndeks(){
        return indeks;
    }

    private String osoba;


    public void setOsoba(String x){
        this.osoba= x;
    }

    public String getOsoba(){
        return osoba;
    }

    @Override
    public String toString(){
        return "Osoba "+ osoba;
    }

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
}

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */