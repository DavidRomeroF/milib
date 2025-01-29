package david;

public class Arrays {
    public Arrays() {
    }

    public static int[] sumaArray(int[] numerosNaturales) {
        for(int i = 0; i < numerosNaturales.length; ++i) {
            numerosNaturales[i] = i + 1;
        }

        return numerosNaturales;
    }
}