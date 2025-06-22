import java.util.*;
public class cgpa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the total credit hours earned from the user
        System.out.print("Enter total quality points earned: ");
        double qulitypnts = scanner.nextDouble();

        // Get the total number of quality points from the user
        System.out.print("Enter total number of credits hours : ");
        double crhrs = scanner.nextDouble();

        // Calculate CGPA
        double cgpa = (qulitypnts / crhrs );

        // Check if CGPA is below 2.5 and display the appropriate message
        if (cgpa < 2.5) {
            System.out.println("Student's GPA  is "+cgpa+" not completing the degree requirement");
        } else {
            System.out.println("StudentGPA  is "+cgpa+" has qualified for the award of degree");
        }

        scanner.close();
    }
}