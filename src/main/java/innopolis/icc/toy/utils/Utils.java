package innopolis.icc.toy.utils;

public class Utils {

    public static String replaceFileSuffix(String s, String suffix) {
        if ( s==null || suffix==null ) return s;
        int dot = s.lastIndexOf('.');
        return s.substring(0,dot)+suffix;
    }

    public static String stripBrackets(String s) {
        return s.substring(1,s.length()-1);
    }
}
