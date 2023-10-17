package onlinevoting;
import java.util.*;
import java.lang.*;
class InfoCandidate{


    void ShowDetails(String curr) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("showing details...");

        if (s.equals("Congress") || s.equals("congress")) {
            candidateBlock c = new candidateBlock();
            c.InfoCongress();
            VotingSystem.voting(curr);
        } else if (s.equals("BJP") || s.equals("bjp")) {
            candidateBlock c1 = new candidateBlock();
            c1.InfoBJP();
            VotingSystem.voting(curr);
        } else if (s.equals("AAM") || s.equals("aam")) {
            candidateBlock c3 = new candidateBlock();
            c3.InfoAAM();
            VotingSystem.voting(curr);

        } else {
            System.out.println("invalid candidate name");
            System.out.println("enter correct candidate name again");
            InfoCandidate v = new InfoCandidate();
            v.ShowDetails(curr);
        }

    }
}


