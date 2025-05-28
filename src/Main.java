import HackerRankSolutions.HackerRank1;
import HackerRankSolutions.HackerRank2;
import HackerRankSolutions.HackerRank3;
import HackerRankSolutions.HackerRank4;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("********************* HackerRank1  ********************* ");
        HackerRank1 hackerRank1 = new HackerRank1();
        List<Integer> input = Arrays.asList(1,2,4,5,2);
        System.out.println("input : " + input);
        System.out.println("result : "+ hackerRank1.reverseArray(input));

        System.out.println("********************* HackerRank2  ********************* ");
        HackerRank2 hackerRank2 = new HackerRank2();
        List<Long> input2 = Arrays.asList(1000000001L,1000000002L,1000000003L,1000000004L,1000000005L);
        System.out.println("input : " + input2);
        System.out.println("result : "+ hackerRank2.aVeryBigSum(input2));

        System.out.println("********************* HackerRank3  ********************* ");

        HackerRank3 hackerRank3 = new HackerRank3();

        Map<String,Integer> input3 = new HashMap<>();

        input3.put("b",10);
        input3.put("w",5);
        input3.put("bc",1);
        input3.put("wc",2);
        input3.put("z",1);

        System.out.println("input : " + input3);
        System.out.println("result : "+ hackerRank3.taumBday(input3.get("b"),input3.get("w"),input3.get("bc"),input3.get("wc"),input3.get("z")));

        System.out.println("********************* HackerRank4  ********************* ");

        int [] inputHR4 = {2,4,4,2,1,1,3,6,5,7,7,6,5};

        System.out.println("Input : " + Arrays.toString(inputHR4));

        HackerRank4 hackerRank4 = new HackerRank4(inputHR4);

        System.out.println("Output : " + hackerRank4.getOutput());

    }

}