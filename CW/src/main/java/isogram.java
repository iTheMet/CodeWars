import java.util.Arrays;
import java.util.Scanner;

public class isogram {
    public static String str = new String();
    public static String  printing() {

      Scanner scanner = new Scanner(System.in);
      str = scanner.nextLine();
      str = str.toUpperCase();
      System.out.println(str);
      return str;
    }

    public static boolean proverka(String pr){
        pr = pr.toUpperCase();
        boolean gate = true;
        char commonLetter;
        char suspectLetter;
        for(int i=0; i < pr.length();i++ ){

            if(i+1 != pr.length() && gate != false){
                commonLetter = pr.charAt(i);
                System.out.println("________________________________\nнаша буква '"+commonLetter+"'");
                for(int j = i+1; j< pr.length();j++){
                    suspectLetter = pr.charAt(j);
                    System.out.println("проверка буквы '"+suspectLetter+"'");
                    if(commonLetter == suspectLetter){
                        gate = false;
                        break;
                    }
                }
            }else{
                System.out.println(gate);
                break;
            }
        }
        return gate;
    }

    public static boolean  isIsogram(String pr) {
        return pr.length() == pr.toLowerCase().chars().distinct().count();

    }
    public static long erg(){
        int sas[] = {2,4,5};
        return Arrays.stream(sas).count();
    }
}
