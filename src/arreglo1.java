import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arreglo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ce[] = new int[31];
        int Not[] = new int[5];
        int pro[] = new int[2];
        int notalta[] = new int[2];
        int calcularnotabaja[] = new int[2];
        int calculamedia[] = new int[2];
        int N, i, sum = 0;
        do {
            System.out.print("Ingrese cantidad de datos:");
            N = Integer.parseInt(br.readLine());
        }
        while ( (N < 0 || (N > 100));

        System.out.println("Ingreso de datos ");
        for (i = 0; i < N; i++) {
            do {
                System.out.print("Ingrese cantidad de estudiante[" + i + "]:");
                ce[i] = Integer.parseInt(br.readLine());
            }
            while ((ce[i] < 0) || (ce[i] > 31));
        }
        for (i =0 ; i< N ; i++){
            do {
                System.out.print("Ingrese notas del estudiante ["+i+"]:");
                Not[i]=Integer.parseInt(br.readLine());
            }
            while ((Not < 0 || Not>=20));
        }
            for (i = 0; i < N; i++) {
                do {
                    pro[i] = Integer.parseInt(br.readLine());
                }
                while ((pro[i] < 0));


                sum = sum + Not[i];

                pro = sum * (1.0) / N;
                System.out.print("promedio del estudiante:");
            }
    }






