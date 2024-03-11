package tugaspertemuan5;
import java.util.Scanner;
public class no3_Genap {
    static int cariTerkecil(int a, int b){
        int min;
        if(a>b){
            min=b;
        }else if(b>a){
            min=a;
        }else{
            min=a;
        }
        return min;
    }
    static int cariPBT(int min, int a, int b){
        int i, PBT=1;
        for(i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                if(PBT<i){
                    PBT=i;
                }
            }      
        } 
        return PBT;
    }
    public static void main(String[] args) {
        int a,b,min;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Bilangan Pertama : ");
        a = input.nextInt();
        System.out.println("Masukkan Bilangan Kedua : ");
        b = input.nextInt();
        
        min = cariTerkecil(a,b);
        System.out.println("Pembagi Bersama Terbesar dari "+a+" dan "+b+" adalah "+cariPBT(min,a,b));
    }
    
}
