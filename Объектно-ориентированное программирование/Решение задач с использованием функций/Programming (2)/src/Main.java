import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f = sc.nextInt() == 1 ? true : false;
        boolean s = sc.nextInt() == 1 ? true : false;
        boolean t = sc.nextInt() == 1 ? true : false;
        System.out.println(election(f, s, t));
    }

}