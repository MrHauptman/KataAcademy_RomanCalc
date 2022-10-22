
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator {


    public static void input() throws Exception {


        try {
            Scanner seq = new Scanner(System.in);
            System.out.print("Input a sequence: ");
            String seq1 = seq.nextLine();
            char[] newchar = new char[10];
            for(int i=0; i<seq1.length(); i++){
                newchar[i] = seq1.charAt(i);
            }
          String val_newchar = String.valueOf(newchar);
            String[] arr = val_newchar.split("[+-/*]");
            String spar1 = arr[0];
            String spar101 = arr[1];
            String spar2 = spar101.trim();
            System.out.println(spar1+" "+spar2);


            int Result = 0;
            String[] seq2 = seq1.split("");
             int par1 = romanToNumber(spar1);
             int  par2 = romanToNumber(spar2);


             if(par1<0 && par2<0){
                 
                 par1 = Integer.parseInt(spar1);
                 par2 = Integer.parseInt(spar2);
                  if(par1>10 || par2>10) {
                     System.out.println("Ops can be larger than 10");
                     System.exit(0);
                 }
               

                 for (int i = 0; i<seq1.length(); i++){
                     if (seq2[i].codePointAt(0) == 43) {
                         Result = par1+par2;
                         System.out.println("Result:"+Result);

                     }
                     if(seq2[i].codePointAt(0) ==45){
                         Result = par1-par2;
                         System.out.println("Result:"+Result);
                     }
                     if(seq2[i].codePointAt(0) ==42){
                         Result = par1 * par2;
                         System.out.println("Result:"+Result);

                     }
                     if(seq2[i].codePointAt(0) == 47){
                         Result = par1/par2;
                         System.out.println("Result:"+Result);
                     }

                 }
             } else {

                 for (int i = 0; i<seq1.length(); i++){
                     if (seq2[i].codePointAt(0) == 43){
                         Result = par1+par2;
                         String result = convertNumToRoman(Result);
                         System.out.println("Result:"+result);
                     }
                     if(seq2[i].codePointAt(0) ==45){
                         Result = par1-par2;
                         String result = convertNumToRoman(Result);
                         System.out.println("Result:"+result);
                     }
                     if(seq2[i].codePointAt(0) ==42){
                         Result = par1 * par2;
                         String result = convertNumToRoman(Result);
                         System.out.println("Result:"+result);

                     }
                     if(seq2[i].codePointAt(0) == 47){
                         Result = par1/par2;
                         String result = convertNumToRoman(Result);
                         System.out.println("Result:"+result);
                     }
                 }


             };







        } catch (Exception a) {
            System.out.print(">>>>>>>Try again, seems u've made mistake<<<<<<<<<<<");
        }
    }
    private static String convertNumToRoman (int numArabian) {
        String[] roman = {"Nulla (В римских источника использовалось, обозначло что то вроде пустоты, как бы ничто)", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        return roman[numArabian];
    }
private static int romanToNumber(String roman) {
    try {
        switch (roman) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
        }
    } catch (InputMismatchException e) {
        throw new InputMismatchException("Неверный формат данных");
    }
    return -1;
}
}







