
package studentinformationsystem;

public class StudentInformationSystem {

    public static void main(String[] args) {
        
        int java = 90;
        int github = 89;
        int totalGrade ;
        // TODO code application logic here
        System.out.println("Name: Priss Na a/p Uthai");
        System.out.println("Matric No: S87198");
        System.out.println("Java mark: " + java);
        System.out.println("Github mark: " + github);
        System.out.println("Thank you for using Student Information System!");
        
        
        totalGrade = java + github ;
        
        System.out.println("Grade: " + totalGrade);
        
        if (totalGrade >= 150){
            System.out.print("Excellent");
        }
        
        else if (totalGrade >= 100){
            System.out.print("Good");
        }
        
        else {
            System.out.print("Needs Improvement");
        }
    }
}
