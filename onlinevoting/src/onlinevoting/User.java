package onlinevoting;

import java.util.HashMap;
import java.util.Scanner;

public class User {
    String voterId;

    static class userdetails{
        String name;
        String address;
        boolean blackList;
        String password;
        userdetails(String name,String address, boolean blackList,String password){
            this.name=name;
            this.address=address;
            this.blackList=blackList;
            this.password=password;
        }
    }

    public static void login_register(int i){
            Scanner sc= new Scanner(System.in);
        HashMap<String,userdetails> db= VotingSystem.dataBase;
        if (i==0){
            System.out.println("Enter your voter id");
            String id = sc.next();
            if (db.containsKey(id)){
                System.out.println("A voter exist with this voter id");
                VotingSystem.main();
            }
            else {
                System.out.println("Enter your name");
                String name=sc.next();
                System.out.println("Enter your address");
                String add= sc.next();
                System.out.println("Enter you password");
                String password=sc.next();
                db.put(id,new userdetails(name,add,false,password));
                System.out.println("Your data is saved!!");
                VotingSystem.main();
            }
        } else if (i==1) {
            System.out.println("Enter your voter id");
            String id = sc.next();
            if (db.containsKey(id)){
                System.out.println("Enter you password");
                String password=sc.next();
                if (db.get(id).password.equals(password)){
                    System.out.println("You are logged in");
                    VotingSystem.voting();
                }
                else {
                    System.out.println("Enter valid password");
                    login_register(i);
                }
            }
            else {
                System.out.println("Invalid Voter id");
                login_register(i);
            }
        }
        else{
            System.out.println("Enter valid number");
            VotingSystem.main();
        }
    }
}
