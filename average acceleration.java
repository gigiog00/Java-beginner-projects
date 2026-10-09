import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the initial velocity");
        double v0=input.nextDouble();
        System.out.println("Enter the end velocity");
        double v1=input.nextDouble();
        System.out.println("Enter the time");
        double t=input.nextDouble();
    double accelration=v1-v0/t;
        System.out.println("the average accelration is "+accelration+" m/s");
    
    }
}
