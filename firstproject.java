import java.util.Scanner;
class why {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        if (age < 17) {
            System.out.println("Admission Rejected.");
        } else {
            System.out.println("Exam status (pass/fail):");
            String status = input.next();
            if (status.equalsIgnoreCase("fail")) {
                System.out.println("Admission type(regular/management):");
                String type = input.next();
                if (type.equalsIgnoreCase("regular")) {
                    System.out.println("Admission Rejected.");
                } else if (type.equalsIgnoreCase("management")) {
                    System.out.println("Admission Approved without fee concession.");

                } else {
                    System.out.println("Invalid input for admission type."); }
                
            } else if (status.equalsIgnoreCase("pass")) {
                System.out.println("Family Income (low/medium/high) :");
                String income = input.next();
                if (income.equalsIgnoreCase("low")) {
                    System.out.println("Admission Approved with Fee concession.");
                } else if (income.equalsIgnoreCase("medium")) {
                    System.out.println("Gender (male/female) :");
                    String gender = input.next();
                    if (gender.equalsIgnoreCase("female") ) {
                        System.out.println("Admission type (regular/management):");
                        String type = input.next();
                        if (type.equalsIgnoreCase("regular")) {
                            System.out.println("Admission Approved with fee concession.");
                        } else if (type.equalsIgnoreCase("management")) {
                            System.out.println("Admission Approved without fee concession.");

                        } else {
                            System.out.println("Invalid input for admission type.");
                        }
                    } else if (gender.equalsIgnoreCase("male")) {
                        System.out.println("Admission Approved without fee concession.");
                    } else {
                        System.out.println("Invalid input for gender.");


                    }
                } else if (income.equalsIgnoreCase("high")) {
                    System.out.println("Admission Approved without fee concession.");
                    
                } else {
                    System.out.println("Invalid input for family income.");}

            } else {
                System.out.println("Invalid input for exam status.");
            }


        
                
        input.close();
    }
}

}