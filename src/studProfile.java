import java.util.Scanner;
import java.util.regex.Matcher;
import java.lang.Object;
import java.util.Arrays;

public class studProfile {
        private static int c = 0;// counter

        private String fname;
        private String lname;
        private int id;
        private String standing;
        private String email; //-----FIX----
        private String address;
        private String city;
        private String state;
        private int zip;


        public void info() {//----------------COLLECTING STUDENT INFO--------------------------------------------------
            System.out.println("\nEnter First name:");
            Scanner input = new Scanner(System.in);
            fname = input.nextLine();
            while (!fname.matches("[a-zA-Z]+")) {
                System.out.println("Invalid entry! Enter only alphabetic characters.");
                System.out.println("\nEnter First name:");
                Scanner inputdos = new Scanner(System.in);
                fname = inputdos.nextLine();
            }//end while loop


            System.out.println("Enter Last name:");
            lname = input.nextLine();
            while (!lname.matches("[a-zA-Z]+")) {
                System.out.println("Invalid entry! Try again!");
                System.out.println("\nEnter Last name:");
                Scanner inputdos = new Scanner(System.in);
                lname = inputdos.nextLine();
            }// end while loop

            System.out.println("Enter PeopleSoft Id:");
            id = input.nextInt();
            input.nextLine();
            int idlength = String.valueOf(id).length();
            String idstring = String.valueOf(id);
            while (!(idlength <= 7 || idstring.matches("[0-9]"))) {
                System.out.println("Invalid entry! Please enter an ID less than or equal to 7 numbers");
                Scanner inputs = new Scanner(System.in);
                id = inputs.nextInt();
                idlength = String.valueOf(id).length();
            }// end while loop

            System.out.println("Enter Class Standing as freshman, sophomore, junior or senior");
            Scanner inputstd = new Scanner(System.in);
            standing = inputstd.nextLine();
            while (!(standing.equals("freshman") || standing.equals("sophomore") || standing.equals("junior") || standing.equals("senior"))) {
                System.out.println("Invalid entry! Please try again!");
                Scanner inputthis = new Scanner(System.in);
                standing = inputthis.nextLine();
            }//end while loop

            //---------FIX---------------
            /*System.out.println("Enter Email Id:");
            Scanner input1 = new Scanner(System.in);
            email = input1.nextLine();
            while (!email.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+(?:\\\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\\\.[a-zA-Z0-9-]+)*$")) {
                System.out.println("Invalid entry! Please try again!");
                Scanner email1 = new Scanner(System.in);
                email = email1.nextLine();
            }// end while loop */
            //this regex doesn't work ------FIX-----


            System.out.println("Enter Address:");
            Scanner inputsix = new Scanner(System.in);
            address = inputsix.nextLine();
            while (!address.matches("^(?:[Pp][Oo]\\s[Bb][Oo][Xx]|[0-9]+)\\s(?:[0-9A-Za-z\\.'#]|[^\\S\\r\\n])+")) {
                System.out.println("Invalid entry! Please try again!");
                Scanner address1 = new Scanner(System.in);
                address = address1.nextLine();
            }// end while loop

            System.out.println("Enter City:");
            Scanner input8 = new Scanner(System.in);
            city = input8.nextLine();
            while (!city.matches("[a-zA-Z]+")) {
                System.out.println("Invalid entry! Please try again!");
                Scanner input9 = new Scanner(System.in);
                city = input9.nextLine();
            }// end while loop

            System.out.println("Enter State:");
            Scanner input10 = new Scanner(System.in);
            state = input10.nextLine().toUpperCase();
            boolean firstloop=true;
            while(firstloop){
                String[]stateArray={"AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE",
                        "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA","MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND",
                        "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY"};
                boolean check=Arrays.stream(stateArray).anyMatch(state::equals);
                while(!(check)){
                    System.out.println("Invalid entry! Please try again!");
                    Scanner inputState = new Scanner(System.in);
                    state = inputState.nextLine().toUpperCase();
                    check=Arrays.stream(stateArray).anyMatch(state::equals);
                }// end check while loop
               break; // ends state input
            }// end while loop for state input

            int ziplength = String.valueOf(zip).length();
            String zipstring = String.valueOf(zip);
            while (!(ziplength == 9 || zipstring.matches("[0-9]"))) {
                System.out.println("Invalid entry! Please try again!");
                Scanner input11 = new Scanner(System.in);
                zip = input11.nextInt();
                ziplength = String.valueOf(zip).length();
            }// end while loop
        }//ENDS INFO CLASS


        public void prettydisplay () {//---------------------DISPLAY COLLECTED INFO------------------------------------

            System.out.println("\n\nStudents Details\nDepartment of ILT\n");
            System.out.println("First name: " +fname+"\nLast name: " +lname+ "\nPeopleSoft Id: " +id+ "\nClass Standing: " +standing+ "\nEmail Id: " +email+ "\nAddress line: " +address+ ", "+city +" "+state+" "+zip);
            System.out.println("Number of students:" + studProfile.Count());
        }//ENDS PRETTYDISPLAY CLASS


        public static int Count () {//----------COUNTER TO CHECK USER INPUT # AGAINST CODE'S # INPUTTED-----------------
            c = c + 1;
            return c;
        }//ends count class

}//ENDS STUDPROFILE CLASS
