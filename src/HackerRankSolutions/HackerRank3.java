package HackerRankSolutions;

public class HackerRank3 {

    int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public long taumBday(int b, int w, int bc, int wc, int z) throws Exception {

        int normalWay = b*bc + w*wc;
        int bcCheaper = (b+w) * bc + z*w;
        int wcCheaper = (b+w) * wc + z*b;

        int max = (int) Math.pow(10,9);


        if (b < 0 || w < 0 || bc < 0 || wc < 0 || z < 0 ||
                b > max || w > max || bc > max || wc > max || z > max){
            throw new Exception("valor invalido");
        }

        if (normalWay<bcCheaper){
            return Math.min(normalWay, wcCheaper);
        }else return Math.min(bcCheaper, wcCheaper);
    }
}
