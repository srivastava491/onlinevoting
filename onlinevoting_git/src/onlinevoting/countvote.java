package onlinevoting;

class countvote {
    static int countVote1=0;
    static int countVote2=0;
    static int countVote3=0;
    void counting(int v,String curr) {

        if (v == 1) {
            countVote1 += 1;
        } else if (v == 2) {
            countVote2++;
        } else if (v == 3) {
            countVote3++;
        } else {
            System.out.println("Enter valid number for voting your favourite candidate:");
            VotingSystem.voting(curr);
        }
        VotingSystem.dataBase.get(curr).hasVoted=true;
        System.out.println("THANK YOU FOR VOTING!");
        System.out.println("STAY TUNED!");
        VotingSystem.main();
    }


}
