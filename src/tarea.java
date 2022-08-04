public class tarea {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.puertas_suman();
        System.out.println(miCoche.puertas_suman());
    }
}
    class coche {
        int puertas=0;

        public int puertas_suman(){
            puertas++;
            return puertas;
        }

    }
