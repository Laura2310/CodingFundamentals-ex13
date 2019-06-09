import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(DigitsInAString1(s));
        System.out.println(DigitsInAString2(s));

    }

    private static int DigitsInAString1(String s){
        String s1=s;
        s=s.replaceAll("\\d","");

        return s1.length()-s.length();
    }

    private static int  DigitsInAString2(String s){
        int counter =0;
        for(int i=0;i<s.length();i++ )
            if(s.charAt(i)>'0' && s.charAt(i)<'9') counter++;
        return counter;

        //daca nu punem ghilimele la '0' si '9' el va crede ca este un asci code care nu este acelasi lucru cu digitii
        //el in spate compara in ascii code
    }

}
