package onlinevoting;

import java.util.HashMap;
import java.util.Scanner;

public  class VotingSystem{
    public static HashMap<String,User.userdetails> dataBase= new HashMap<>();
    public static void voting(String curr){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1 if you want to know any candidate's" +
                " details or 2 if u want to vote and 0 to exit "
        );
        int i = sc.nextInt();
        while (i != 0) {

            if (i == 1) {
                System.out.println("enter name of the candidate whose information u want to get:");
                InfoCandidate v1 = new InfoCandidate();
                v1.ShowDetails(curr);
            } else if (i == 2) {
                System.out.println("enter 1 for voting congress ,2 for BJP,3 for AAM:");
                Scanner c1 = new Scanner(System.in);
                int v = c1.nextInt();
                countvote c = new countvote();
                c.counting(v,curr);
                break;

            } else {
                System.out.println("Please enter correct number. Thank you! ");
                main();
            }
            i= sc.nextInt();
        }
        if(i==0){
            System.out.println("THANK YOU FOR VISITING!");
            main();
        }
    }
    public  static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            //for (String id : dataBase.keySet()) {
            //    System.out.println("Id is " + id + "password is " + dataBase.get(id).password + " Name is " + dataBase.get(id).name + " Address is " + dataBase.get(id).address);
            //}
            System.out.println("If you want to register press 0 and if you want to login press 1 ");
            int i = sc.nextInt();
            if (i==987654321){
                System.out.println("Enter id");
                String id= sc.next();
                System.out.println("Enter password");
                String password=sc.next();
                if(id.equals(Admin.id)&&password.equals(Admin.password)){
                    System.out.println("Welcome Admin");
                    Admin.functions();
                }
            }
            User.login_register(i);
        }
//        System.out.println("enter 1 if you want to know any candidate's" +
//                " details or 2 if u want to vote and 0 to exit "
//        );
//        int i = sc.nextInt();
//        while (i != 0) {
//
//            if (i == 1) {
//                System.out.println("enter name of the candidate whose information u want to get:");
//                InfoCandidate v1 = new InfoCandidate();
//                v1.ShowDetails();
//
//
//
//            } else if (i == 2) {
//                System.out.println("enter 1 for voting congress ,2 for BJP,3 for AAM:");
//                Scanner c1 = new Scanner(System.in);
//                int v = c1.nextInt();
//                countvote c = new countvote();
//                c.counting(v);
//                break;
//
//            } else {
//                System.out.println("Please enter correct number. Thank you! ");
//                VotingSystem ag = new VotingSystem();
//                ag.main();
//            }
//            i= sc.nextInt();
//        }
//        if(i==0){
//            System.out.println("THANK YOU FOR VISITING!");
//        }
    }



}
