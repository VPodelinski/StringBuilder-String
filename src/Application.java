import mod.WithStringBuilder;
import mod.WithString;

/**
 * Created by viivpo2010 on 19.6.17.
 */
public class Application {
    public static void main(String[] args) {
        String str = "Первоначальная строка";
        int count = 20000;

        String strokaString = WithString.addWithString(str, count);
        System.out.println(strokaString);

        StringBuilder strokaStringBuilder = WithStringBuilder.addWithStringBuilder(str,count);
        System.out.println(strokaStringBuilder);


    }
}
