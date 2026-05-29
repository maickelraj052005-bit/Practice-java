import java.util.*;;
public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int product=sc.nextInt();
        int factor= sc.nextInt();

        int result = product*factor;

        System.out.println("The product is : "+result);
        sc.close();
    }
}
