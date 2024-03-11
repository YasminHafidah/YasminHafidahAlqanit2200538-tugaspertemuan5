
package tugaspertemuan5;
import java.util.Scanner;
public class no1_genap {

    static void perulangan(int N, String kalimat){
        int i;
        for(i=1;i<=N;i++){
            System.out.println(kalimat);
        }
    }
    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Berapa kali Anda ingin mencetak : ");
        N = input.nextInt();
        
        perulangan(N,"Saya senang belajar bahasa");
    }
    
}
