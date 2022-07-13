package Testai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Metodai {

    public Integer smallestNumber(ArrayList<Integer> numbers){
        Integer smallestNumber = numbers.get(0);
        for (int i=1;i<numbers.size(); i++){
            if (numbers.get(i)<smallestNumber){
                smallestNumber = numbers.get(i);
            }
        }
        return smallestNumber;
    }

    public Integer averageNumber (ArrayList<Integer> numbers){
        Integer sum=numbers.get(0);
        for (int i=1;i<numbers.size(); i++ ){
            sum += numbers.get(i);
        }
        return sum/numbers.size();
    }

    public String middleCharacter (String string){
        String midChars;
        int mid =string.length()/2;

        if (string.length() % 2 == 0){
           char char1 = string.charAt(mid - 1);
           char char2 = string.charAt(mid);
           midChars = "" + char1+char2;
        }else {
            midChars = "" + string.charAt(mid);
        }
        return midChars;
    }

    public Integer numbOfVowels (String string){
        Integer sum = 0;
        String stringLowerCase = string.toLowerCase(Locale.ROOT);
        ArrayList <Character> vowels = new ArrayList<>(Arrays.asList('a','e','o','u','i','y'));
        for (int i = 0; i<stringLowerCase.length(); i++){
            if (vowels.contains(stringLowerCase.charAt(i))){
                sum++;
            }
        }
        /*for (int i = 0; i>string.length();i++){
            if (string.charAt(i)=='a' || string.charAt(i)=='e' ||string.charAt(i)=='i' || string.charAt(i)=='o' ||string.charAt(i)=='u' ||string.charAt(i)=='y'){
                sum++;
            }
        }*/
        return sum;
    }
}
