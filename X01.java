// 12S24011 - Pedro Simangunsong
// 12S24041 - Nikah Suchia Panjaitan
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargabuku, totalharganya, hargapalingkecil, totalnilaitransaksi;

        hargabuku = Double.parseDouble(input.nextLine());
        totalharganya = hargabuku;
        hargapalingkecil = hargabuku;
        while (hargabuku != 0) {
            if (hargapalingkecil < hargabuku) {
                hargapalingkecil = hargapalingkecil;
            } else {
                hargapalingkecil = hargabuku;
            }
            hargabuku = Double.parseDouble(input.nextLine());
            totalharganya = totalharganya + hargabuku;
        }
        if (totalharganya >= 100) {
            totalnilaitransaksi = totalharganya - hargapalingkecil;
        } else {
            totalnilaitransaksi = totalharganya;
        }
        System.out.println(toFixed(totalnilaitransaksi,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

