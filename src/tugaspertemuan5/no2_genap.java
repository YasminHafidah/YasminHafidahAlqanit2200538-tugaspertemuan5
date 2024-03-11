
package tugaspertemuan5;
import java.util.Scanner;
public class no2_genap {
    static int hasilDeretGenap(int batasAwal, int batasAkhir){
        int i, jumlah=0;
         for(i=batasAwal;i<=batasAkhir;i++){
            if(i%2!=0){
                continue;
            }
            jumlah = jumlah + i;
        }
        return jumlah;
    }
    public static void main(String[] args) {
        int batasAwal;
        int batasAkhir;
        Scanner input = new Scanner(System.in);
        System.out.println("Batas Awal = ");
        batasAwal=input.nextInt();
        System.out.println("Batas Akhir = ");
        batasAkhir=input.nextInt();
        
        if(batasAwal%2==0 || batasAkhir%2==0){
            batasAwal=batasAwal+1;
            batasAkhir=batasAkhir-1;
        }
              
        System.out.println("Deret Genap adalah "+hasilDeretGenap(batasAwal,batasAkhir));
    }
    
}
