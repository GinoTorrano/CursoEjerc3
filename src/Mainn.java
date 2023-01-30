public class Mainn {
    public static void main(String[] args) {
        Coche CochePuertas = new Coche();
        CochePuertas.AgregarPuerta();
        CochePuertas.AgregarPuerta();

        System.out.println(CochePuertas.puertas);
    }

}

class Coche {
    public int puertas = 0;

    public void AgregarPuerta() {
        this.puertas++;
    }

}



