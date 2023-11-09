public class Main {



    public static void main(String[] args)

    {
      int a[];
      a=new int[10];
      char c[]=new char[26];

      for(int i=0;i<26;i++)
      {
          c[i]=(char)('A'+i);
      }

      for(int i=0;i<26;i++)
      {
          System.out.println(c[i]);
      }
//System.out.println(a);




    }
}