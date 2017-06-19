package mod;

/**
 * Created by viivpo2010 on 19.6.17.
 */
public  class WithString {

    public static String addWithString(String s, int count){
        long t = System.currentTimeMillis();

        for(int i = 1; i <=count; i++){
            s+= " word"+i +" ";
        }

        System.out.println("Total time String (sec): " + ((System.currentTimeMillis() - t) / 1000));
        return s;
    }


}

