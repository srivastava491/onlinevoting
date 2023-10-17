package onlinevoting;

import java.util.Scanner;

public class Admin {
        protected static final String id="abcdefgh";
        protected static final String password="helloworld";
    protected static void functions(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Press 0 to close program,Press 1 to view votes");
        int n=sc.nextInt();
        if (n==0){
            System.out.println("Terminating Code");
                System.exit(200);
        } else if (n==1) {
            System.out.printf("BJP: %d Congress: %d AAP: %d",countvote.countVote2,countvote.countVote1,countvote.countVote3);
        }
    }

}
