import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ejercicios {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sumatotal = 0, N=0 , Prom = 0, cdn = 0, suma = 0 ,c ;
        do{
            System.out.println("Leer numero:"+N);
            N=Integer.parseInt(br.readLine());
        } while(N!=0);

         for ( c=0 ; c<N;c=c+1){

                if ( N>0){
             sumatotal = sumatotal + 1;}
            if (N % 2 != 0) {
                suma = N + suma;
                Prom = suma / N;
            } else {
                N = N / 10;
                cdn=cdn+1;
            }



    }
}
}

