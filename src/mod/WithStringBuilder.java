package mod;

/**
 * Created by viivpo2010 on 19.6.17.
 */
public class WithStringBuilder {
    public static StringBuilder addWithStringBuilder(String s, int count) {
        long t = System.currentTimeMillis();
        StringBuilder strb = new StringBuilder(s);
        for (int i = 1; i <= count; i++) {
            strb.append(" word" + i + " ");
        }
        System.out.println("Total time StringBuilder (sec): " + ((System.currentTimeMillis() - t) / 1000));
        return strb;
    }
}