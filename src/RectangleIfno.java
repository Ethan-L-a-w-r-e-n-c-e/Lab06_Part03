import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sideA = 0;
        double sideB = 0;
        double area;
        double perimeter;
        double diagonal;
        boolean sideAValid = false;
        boolean sideBValid = false;

        do {
            System.out.println("Enter Length of Side 1: ");
            if(scan.hasNextDouble()){
                sideA = scan.nextDouble();
                if(sideA > 0){
                    sideAValid =  true;
                    scan.nextLine();
                } else {
                    System.out.println("You have entered a number out of the range");
                }
            } else {
                scan.nextLine();
                System.out.println("You have entered in a wrong data type");
            }
        } while(!sideAValid);


        do {
            System.out.println("Enter Length of Side 2: ");
            if(scan.hasNextDouble()){
                sideB = scan.nextDouble();
                if(sideB > 0){
                    sideBValid =  true;
                } else {
                    System.out.println("You have entered a number out of the range");
                }
            } else {
                scan.nextLine();
                System.out.println("You have entered in a wrong data type");
            }
        } while(!sideBValid);

        perimeter = (sideA + sideB)*2;
        area = sideA * sideB;
        diagonal = Math.hypot(sideA,sideB);

        System.out.printf("Side 1: %10.2f", sideA);
        System.out.printf("\nSide 2: %10.2f", sideB);
        System.out.printf("\nArea: %10.2f", area);
        System.out.printf("\nPerimeter: %10.2f", perimeter);
        System.out.printf("\nDiagonal: %10.2f", diagonal);
    }
}