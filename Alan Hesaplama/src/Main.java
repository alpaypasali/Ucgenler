import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a , b ,c ;
        System.out.println("1. Kenarı Giriniz :");
        a = scanner.nextInt();
        System.out.println("2. Kenarı Giriniz :");
        b = scanner.nextInt();
        System.out.println("3. Kenarı Giriniz :");
        c = scanner.nextInt();
        double u = Yukseklik(a,b,c);
        double cevre = u*u;

        System.out.println("Üçgenin Çevresi :" + cevre);
        Alan(u , a, b, c);

    }
    static  double Yukseklik(int a , int b , int c){
        return  (a+b+c) / 2;

    }
    static  void Alan(double u , int a , int b , int c){

        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı = " + alan);

    }

}