package ProblemSolving;

public class StringComparison {
    public static void main(String[] args) {
        String s1="apple";
        String s2="Apple";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int minLength=Math.min(s1.length(),s2.length());
        for(int i=0;i<minLength;i++)
        {
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            if(c1!=c2)
            {
                if(c1<c2)
                {
                    System.out.println(s1+" comes before "+s2);
                }
                else
                {
                    System.out.println(s1+" comes after "+s2);
                }
                return;
            }
        }
        if(s1.length()==s2.length())
        {
            System.out.println(s1+ " and "+s2+" both are lexicographically same strings");
        }
        else if(s1.length()<s2.length())
        {
            System.out.println(s1+ " comes before s2");
        }
        else System.out.println(s1+" comes after "+s2);
    }
}
