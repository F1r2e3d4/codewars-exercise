public class XO {
  
  public static boolean getXO (String str) {
    str = str.toLowerCase();
    char[] chararr = str.toCharArray();
    int tot = 0;
    int tot1 = 0;
    for (int i = 0; i < chararr.length; i++){
        
        if(chararr[i] == 'x'){
          tot += 1;
        }
        if (chararr[i] == 'o'){
          tot1 += 1;
        }
        }
    return tot == tot1;
      }
    }

