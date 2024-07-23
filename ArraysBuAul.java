
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rahma Dyah
 */
public class ArraysBuAul {
    public static void main(String[] args) {
       // String nama;

        String namaSiswa[] = new String[4];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < namaSiswa.length; i++) {
        System.out.println("Masukkan Nama Siswa ke :" +(i+1));
        String nama=scan.nextLine();
        namaSiswa[i]=nama;
    }
        for(int j=0;j<namaSiswa.length;j++){
        System.out.print(namaSiswa[j]+",");
    }
        //TUGAS
        int temp=0;
        int nilai []={89,78,90,45,78,90};
        for(int i=0;i<nilai.length;i++){
        temp+=nilai[i];
        
}
        int rata=temp/nilai.length;
        System.out.println("Rata-rata : "+rata);
         
}
}