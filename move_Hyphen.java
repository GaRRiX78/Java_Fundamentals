import java.util.*;
public class move_Hyphen {
    public static void main(String[] args) {
        String str = "abcd_efgh_ijkl_mnop";
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '_')
                s1 = s1 + "_";
            else
                s2 = s2 + str.charAt(i);
        }
        System.out.println(s1 + s2);
    }
}
