import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a , b;
        System.out.println("1. Kenarı Giriniz :");
        a = scanner.nextInt();
        System.out.println("2. Kenarı Giriniz :");
        b = scanner.nextInt();
         HipotenusBul(a,b);
    }
    static  void HipotenusBul(int a , int b){
        double c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus :" + c);
    }

}