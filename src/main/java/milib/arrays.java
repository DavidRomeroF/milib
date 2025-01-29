package milib;

public class arrays {
    //Metodo que rellena el array con numeros enteros del 1 al tamaño de array
    public static void rellenarArray(int[] numerosNaturales){
        for (int i=0; i<numerosNaturales.length; i++){
            numerosNaturales[i]=i+1;
        }
    }

    //Metodos de ordenación de la burbuja ascendente para el array.
    public static void ordenarStringAscend(int[] string){
        int temp, cont;
        do {
            cont=0;
            for (int i=0;i<string.length-1; i++){
                if (string[i]>string[i+1]){
                    temp = string[i];
                    string[i]=string[i+1];
                    string[i+1]=temp;
                }
                else
                    cont++;
            }
        }while (cont< string.length-1);
    }
    public static void ordenarStringAscend(float[] string){
        int cont;
        float temp;
        do {
            cont=0;
            for (int i=0;i<string.length-1; i++){
                if (string[i]>string[i+1]){
                    temp = string[i];
                    string[i]=string[i+1];
                    string[i+1]=temp;
                }
                else
                    cont++;
            }
        }while (cont< string.length-1);
    }
    public static void ordenarStringAscend(double[] string){
        int cont;
        double temp;
        do {
            cont=0;
            for (int i=0;i<string.length-1; i++){
                if (string[i]>string[i+1]){
                    temp = string[i];
                    string[i]=string[i+1];
                    string[i+1]=temp;
                }
                else
                    cont++;
            }
        }while (cont< string.length-1);
    }
    public static void ordenarStringAscend(char[] string){
        int cont;
        char temp;
        do {
            cont=0;
            for (int i=0;i<string.length-1; i++){
                if (string[i]>string[i+1]){
                    temp = string[i];
                    string[i]=string[i+1];
                    string[i+1]=temp;
                }
                else
                    cont++;
            }
        }while (cont< string.length-1);
    }
}
