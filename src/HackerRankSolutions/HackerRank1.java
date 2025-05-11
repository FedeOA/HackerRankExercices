package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class HackerRank1 {

    private List<Integer> a = new ArrayList<>();

    public List<Integer> getA() {return a;}

    public void setA(List<Integer> a) {this.a = a;}

    public List<Integer> reverseArray(List<Integer> a) throws Exception {

        if (a.isEmpty() || a.size() > 10*10*10){
            throw new Exception("Tamanio del array demasiado grande");
        }

        for (int currentPosition: a){
            if(currentPosition < 1 || currentPosition > 10*10*10*10){
                throw new Exception("Valor invalido");
            }
        }

        for (int i = a.size()-1;i>=0;i--){

            this.a.add(a.get(i));
        }
        return this.a;
    }
}
