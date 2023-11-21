import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok = 1, search;
        System.out.print("n1 değeri girin : ");
        n1 = sc.nextInt();
        System.out.print("n2 değeri girin : ");
        n2 = sc.nextInt();

        if (n1 < n2) {
            int i = 1;
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
                ekok = (n1 * n2) / ebob;
            }
        } else {
            int i = 1;
            while (i <= n2) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
                ekok = (n1 * n2) / ebob;
            }
        }
        do {
            System.out.print("1- Ebob\n2- Ekok\n3- Ebob ve Ekok\n4- İşlemi sonlandır\nLütfen seçmekistediğiniz işlemi tıklayınız : ");
            search = sc.nextInt();

            switch (search) {
                case 1:
                    System.out.println(n1 + " ve " + n2 + " Değerlerinin Ebob'u : " + ebob);
                    break;
                case 2:
                    System.out.println(n1 + " ve " + n2 + " değerinin Ekok'u : " + ekok);
                    break;
                case 3:
                    System.out.println(n1 + " ve " + n2 + "\nEbob : " + ebob + "\nEkok : " + ekok);
                    break;
                case 4:
            }
        }while (search!=4);
            System.out.println("İşleminiz Sonlanmıştır!");
    }
}