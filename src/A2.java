import java.util.Scanner;

public class A2 {
        public static void main(String[] args){
            int Y;
            Scanner input= new Scanner(System.in);
            System.out.println("How many students data would you like to enter:");
            Y=input.nextInt();
            input.nextLine();
            studProfile[] z= new studProfile[Y];
            for (int x=0; x<Y; x++){
                z[x]=new studProfile();
                z[x].info();
                z[x].prettydisplay();
            }// end for loop
        }// ENDS MAIN
}// END A2 CLASS
