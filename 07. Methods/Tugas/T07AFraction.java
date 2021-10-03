// File: T07AFraction.java
public class T07AFraction {
    //buat dulu method untuk penjumlahan kedua pecahan
    static void sumFraction (int e1, int d1, int e2, int d2){
        //deklarasikan integer nya
        int es, ds;
        es = (e1 * d2 + e2 * d1);
        ds = (d1 * d2);
        //cetak hasil pecahan
        printFraction(es, ds);
    }
    //buat method baru lagi untuk menghitung perkalian kedua pecahan
    static void productFraction(int e1, int d1, int e2, int d2){
        //deklarasikan 
        int ep, dp;
        ep = (e1 * e2);
        dp = (d1 * d2);
        //cetak hasil pecahan
        printFraction(ep, dp);
        
    }
    //buat method faktor persekutuan terbesar (fpb) agar pecahan dapat disederhanakn
    static int fpb(int x, int y){
        //jika y = 0, akan mengembalikan niali x,  dan x lah yang akan menjadi fpb nya
        if (y==0){
            return x;
        //jika y tidak sama dengan 0, maka akan kembali ke method fpb
        //posisi x akan diganti dengan nilai y, sedangkan posisi y akan di isi dengan modulus x%y
        } else {
            return fpb (y, x%y);
        }
    }
    //buat method ini untuk mencetak hasilnya
    static void printFraction (int ex, int dy){
        int faktor = fpb(ex, dy);
        ex = ex / faktor;
        dy = dy / faktor;

        if (ex==dy || dy==1){
            int ez = ex / dy;
            System.out.println(ez);
        } else System.out.println(ex+"/"+dy);
    }
 
    public static void main(String[]args){
        //panggil method
        sumFraction(1,2,2,3);
        sumFraction(1,3,3,4);
        productFraction(1,2,2,3);
        productFraction(1,4,2,3);
    }
}


}
