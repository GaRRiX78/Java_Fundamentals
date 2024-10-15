
import java.util.*;
    public class strobogrammetic
    {
        public static void main(String[] args)
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number");
            String num=sc.next();
            String s1="";
            for(int i=0;i<num.length();i++)
            {
                char c=num.charAt(i);
                if(c=='0') s1='0'+s1;
                else if(c=='1') s1='1'+s1;
                else if(c=='6') s1='9'+s1;
                else if(c=='8') s1='8'+s1;
                else if(c=='9') s1='6'+s1;
            }
            if(s1.equals(num)) System.out.println("Yes");
            else System.out.println("No");
        }
    }

