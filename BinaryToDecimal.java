import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the binary number ");
        int binary_num = sc.nextInt();
        int ans = 0 ;
        int power = 1 ;
        while ( binary_num > 0 ){
            int unit_digit = binary_num % 10 ;
            ans += ( unit_digit * power );
            binary_num /= 10 ;
            power *= 2 ;
        }
        System.out.println(ans);
    }
}
