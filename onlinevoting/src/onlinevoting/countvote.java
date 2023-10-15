package onlinevoting;

class countvote {
    int countVote1=0;
    int countVote2=0;
    int countVote3=0;
    void counting(int v) {

        if (v == 1) {
            countVote1 += 1;

        } else if (v == 2) {
            countVote2++;
        } else if (v == 3) {
            countVote3++;
        } else {
            System.out.println("Enter valid number for voting your favourite candidate:");
            VotingSystem v2=new VotingSystem();
            v2.main();
        }
        System.out.println("THANK YOU FOR VOTING!");
        System.out.println("STAY TUNED!");
    }


}
