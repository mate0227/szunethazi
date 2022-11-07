import java.util.List;

public class Main {
    public static void main(String[] args)
    {

        //1.feladat - stringbuilder

        List<String> hossz = FileUtils.readLines("config.txt");

        String szam = hossz.get(0);

        szam = szam.replaceAll("_","");

        int n = Integer.parseInt(szam);
        StringBuilder sb = new StringBuilder();

        String sb1="";

        for(int i = 0;i<=n;i++)
        {
            //sb1=sb1+i;
            sb.append(i);
        }

        //System.out.println(sb);
        System.out.println("Hello world!");

        //2.feladat - palindrom

        List<String> words = FileUtils.readLines("words_alpha.txt");

        int counter = 0;

        for(int i = 0;i<words.size();i++)
        {
            if(StringUtils.isPalindrome(words.get(i)))
            {
                counter++;
            }
        }
        System.out.println(counter);


        //3. feladat - fajlbol szamjegyek

        List<Integer> szamok = FileUtils.readFirstLineAsDigits("input.txt");
        int sum= 0;
        for(int i = 0;i<szamok.size();i++)
        {
            sum=sum+szamok.get(i);
        }

        System.out.println(sum);

    }
}