import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yas, yolculuktipi;
        double mesafe, tutar = 0, indirimorani = 0, tutar2;

        System.out.println("Mesafeyi (km cinsinden) giriniz : ");
        mesafe = input.nextDouble();
        System.out.println("Yas giriniz : ");
        yas = input.nextInt();
        System.out.println("Lutfen seciniz : \n" + "1-Tek yon\n" + "2-Gıdıs-donus");
        yolculuktipi = input.nextInt();

        tutar2 = mesafe * 0.1;

        if (yas < 0 && mesafe < 0) {
            System.out.println("Hatali giris yapildi");
        } else {
            if (yas < 12) {
                indirimorani = 0.5;
            } else if (yas >= 12 && yas < 24) {
                indirimorani = 0.1;
            } else if (yas > 65) {
                indirimorani = 0.3;
            }
            double indirimlitutar = tutar2 - (tutar2 * indirimorani);

            switch (yolculuktipi){
                case 1:
                    tutar = tutar2;
                    break;
                case 2:
                    tutar = (indirimlitutar - (indirimlitutar * 0.2)) * 2;
                    break;
            }
            System.out.println(tutar);
        }

    }
}


