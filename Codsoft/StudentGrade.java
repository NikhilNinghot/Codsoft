import java.util.Scanner;

public class StudentGrade 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Enter total number of subjects to calculate their score
        System.out.println("Total Number of Subjects: ");
        int numSubjects = sc.nextInt();

        int totalScore = 0;

        for (int i = 1; i <= numSubjects; i++)
        {
            System.out.println("Enter score of subject " + i + ".");
            int score = sc.nextInt();

            // INPUT VALIDATION
            while (score < 0 || score > 100) 
            {
                System.out.println("Please Enter Valid score Between 0 and 100.");
                System.out.println("Enter score of subject " + i + ".");
                score = sc.nextInt();
            }
            totalScore += score;
        }
        System.out.println("Student Result: ");
        System.out.println("Total score obtained in all subjects: " + totalScore);

        // Calculate Average Percentage: Divide the 'total score' by the 'total number
        // of subjects' to get the average percentage.

        int AveragePercentage = totalScore / numSubjects;

        System.out.println("Average Percentage of Student: " + AveragePercentage);

        // Grade Calculation: Assign grades based on the average percentage achieved.

        if (AveragePercentage >= 95) 
        {
            System.out.println("Your grade: A+");
        }

        else if (AveragePercentage >= 90)
        {
            System.out.println("Your grade: A");
        }

        else if (AveragePercentage >= 80)
        {
            System.out.println("Your grade: B+");
        }

        else if (AveragePercentage >= 75)
        {
            System.out.println("Your grade: B");
        }

        else if (AveragePercentage >= 70) 
        {
            System.out.println("Your grade: B");
        }

        else if (AveragePercentage >= 65) 
        {
            System.out.println("Your grade: C+");
        }

        else if (AveragePercentage >= 50)
        {
            System.out.println("Your grade: C");
        }

        else if (AveragePercentage >= 45) 
        {
            System.out.println("Your grade: D+");
        }

        else if (AveragePercentage >= 30) 
        {
            System.out.println("Your grade: D");
        }

        else
        {
            System.out.println("Your grade is: E");
        }

        sc.close();
    }
}