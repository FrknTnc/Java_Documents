import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input1 = new Scanner(System.in);
        int number;
        int dng =0;

        System.out.println("Please enter number: ");
        number = input1.nextInt();

        while(number>1){
            if(number %2 == 0) {
                System.out.println(number + " is even");
                number = number/2;
                dng++;
                if(number==1)
                    System.out.println("Finish");
            }

            else{
                System.out.println(number + " is odd");
                number = number*3 + 1;
                dng++;
                if(number==1)
                    System.out.println("Finish");
            }
        }
        System.out.println("The prosses took"+ dng);
    }
}
