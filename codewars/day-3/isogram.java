// an isogram a programm to check for recurring characters in a string

public class isogram {
    public static boolean  isIsogram(String str) {
      str = str.toLowerCase();
      char[] letters = str.toCharArray();
      
      for (int i = 0; i < letters.length; i ++){
        if (letters[i] == ' '){
          continue;
        }
        for (int j = i + 1; j < letters.length; j++) {
          if (letters[i] == letters[j]) {
            return false; 
          }
        }
        }
      return true;
      }
    } 
