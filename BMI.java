import java.util.Scanner;
class Main BMI {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
     System.out.println("enter your weight in pounds ");
        double pound=input.nextDouble();
    System.out.println("enter your height in inches ");
        double inches=input.nextDouble();
        double height=inches*0.025;
        double weight=pound*0.45;
        double BMI=weight/(height*height);
        System.out.println("your BMI is: "+BMI);
    
    }
}
