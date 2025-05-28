package HackerRankSolutions;

public class HackerRank4 {

    int output;

    public HackerRank4(int [] input){

        int result = 0;

        for (int j : input) {
            result ^= j;
        }

        this.output = result;
    }

    public int getOutput() {return output;}
}
