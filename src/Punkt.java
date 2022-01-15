/* klasa Punkt */
public class Punkt {
    /* stworzyć zmienne prywatne pX, pY, pZ */
       private int pX, pY, pZ;

       Punkt() {}

        Punkt(int pX){
           this.pX = pX;
        }
        Punkt(int pX, int pY, int pZ){
           this.pX = pX;
           this.pY = pY;
           this.pZ = pZ;
        }
    public void setpX(int x) {
        this.pX = x;
    }

    public int getpZ() {
        return pZ * 10;
    }

    /* stworzyć
        a) pusty konstruktor,
        b) konstruktor inicjalizujacy zmienną pX,
        c) konstruktor inicjalizujący wszystkie zmienne,
        d) stworzyć settery i gettery,
        e) getter do zmiennej pZ niech zwraca return pZ * 10;

        podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
    */

    /* Stworzyć metody
        a) suma - sumująca wszystkie wartości w klasie
        b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
        c) metody różnica mają wykonwywać dzialania :
            roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
        d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
     */
    public int suma(){
        return pX + pZ + pY;
    }
    public int dif(){
        return pX - pZ - pY;
    }
    public int roznica(){
        return pX - pZ - pY;
    }
    public int roznica(int x, int y, int z){
        return pX*x - pZ*z - pY*y;
    }
    @Override
    public String toString() {
        return "Punkt{" +
                "pX=" + pX +
                ", pY=" + pY +
                ", pZ=" + pZ +
                '}';
    }
}
