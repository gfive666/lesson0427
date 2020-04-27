import org.apache.commons.lang.StringUtils;

public class Afternoon {

    public static void main(String[] args) {
        System.out.println(StringUtils.isBlank(""));
        System.out.println(StringUtils.isBlank("       "));
        System.out.println(StringUtils.isBlank(null));
        System.out.println(StringUtils.isBlank("123"));
    }
}
