package onlinevoting;
import java.util.*;
import java.lang.*;
class InfoCandidate{


    void ShowDetails() {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("showing details...");

        if (s.equals("Congress") || s.equals("congress")) {
            candidateBlock c = new candidateBlock();
            c.InfoCongress();
            VotingSystem ag1 = new VotingSystem();
            ag1.main();
        } else if (s.equals("BJP") || s.equals("bjp")) {
            candidateBlock c1 = new candidateBlock();
            c1.InfoBJP();
            VotingSystem ag2 = new VotingSystem();
            ag2.main();
        } else if (s.equals("AAM") || s.equals("aam")) {
            candidateBlock c3 = new candidateBlock();
            c3.InfoAAM();
            VotingSystem ag3 = new VotingSystem();
            ag3.main();

        } else {
            System.out.println("invalid candidate name");
            System.out.println("enter correct candidate name again");
            InfoCandidate v = new InfoCandidate();
            v.ShowDetails();


        }

    }
}


