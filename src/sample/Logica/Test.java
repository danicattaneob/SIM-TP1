package sample.Logica;

public class Test {
    public static void main(String[] args) {
        Random ranMult = new Random(3,3,7,6);
        for (int i = 0; i < 9; i++) {
            System.out.println(ranMult.obtenerAleatorio());
        }

        System.out.println("/////////////////////////////////////////////////////////");
        Random ranMix = new Random(15,3,7);
        for (int i = 0; i < 9; i++) {
            System.out.println(ranMix.obtenerAleatorio());
        }
        System.out.println("/////////////////////////////////////////////////////////");
        PruebaChi pruChi= new PruebaChi(10,30);
        Random ranMult2 = new Random(3,3,7,6);
         for (int i = 0; i < 30; i++) {
            pruChi.addSerie(ranMult2.obtenerAleatorio(), i);            
        }
        pruChi.addVectorFO();
        System.out.println(pruChi.toString());
        System.out.println(pruChi.toString1());
        System.out.println(pruChi.maxValue());
        System.out.println(pruChi.minValue());
    }
}
