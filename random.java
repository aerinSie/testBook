import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;


public class random {
    public static void main(String[]args) throws Exception{
        int count = 0;
        int all = 1000000;
        for(int i = 0;i<all;i++){
           if(52 == getList().size()){
               count++;
           }
        }
        System.out.println((double) count/all);
        UUID.randomUUID();
        //uuid的組合 2^122  5.316911983139664e+36
        //撲克的組合 52^52  1.706765552741322e+89

        //42^42 1.5013093754529656e+68
        //49^49 6.600972468621956e+82

//        即C49取6=49*48*47*46*45*44/(6*5*4*3*2*1)=13983816

    }

    private static List<Integer> getList(){
        IntStream stream = IntStream.range(0, 52);
        HashSet<Integer> set = new HashSet<>();
        stream.parallel().forEach(x->{
            set.add(x);
        });
        return new ArrayList<Integer>(set);
    }


}
