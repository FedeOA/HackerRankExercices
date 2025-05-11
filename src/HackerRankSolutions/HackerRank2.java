package HackerRankSolutions;

import java.util.List;

public class HackerRank2 {

    private long result = 0L;

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    public long aVeryBigSum(List<Long> ar) throws Exception {

        long maxValueAllow = (long) Math.pow(10,10);

        if (ar.size()>10){
            throw new Exception("el numero de elementos del array excede el maximo soportado : 10");
        }

        for (long currentValue : ar){
            if (currentValue<0 || currentValue>maxValueAllow){
                throw new Exception("el valor : " + currentValue + "es mayor al maximo valor permitido : " + maxValueAllow );
            }

            this.result +=currentValue;
        }
        return this.result;
    }
}
