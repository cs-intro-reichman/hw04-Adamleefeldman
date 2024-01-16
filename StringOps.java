public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(allIndexOf("Hello world", 'l'));
        
    }

    public static String capVowelsLowRest (String string) {
        String newString = "";

        for (int i = 0; i < string.length(); i++){

            if (string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U'){
                newString += string.charAt(i);
            }else if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u'){
                newString += (char)(string.charAt(i) - 32);
            }else if(string.charAt(i) >= 65 && string.charAt(i) <= 90){
                newString += (char)(string.charAt(i) + 32);
            }else{
                newString += string.charAt(i);
            }
        }
        return newString;
    }

    public static String camelCase (String string) {
        String newString = "";
        String stringOut = "";
        boolean isSpace = false;

        for (int i = 0; i < string.length(); i++){
            
            if (string.charAt(i) == 32){
                isSpace = true;
            }else if (isSpace){
                if (string.charAt(i) >= 97 && string.charAt(i) <= 122){
                    newString = newString + (char)(string.charAt(i) - 32);
                    isSpace = false;
                }else if (string.charAt(i) >= 65 && string.charAt(i) <= 90){
                    newString = newString + (char)(string.charAt(i));
                    isSpace = false;
                }else if (string.charAt(i) == 32){
                    isSpace = true;
                }
            }else if(string.charAt(i) != 32 && (string.charAt(i) >= 65 && string.charAt(i) <= 90)){
                newString = newString + (char)(string.charAt(i) + 32);
                isSpace = false;
            }else{
                newString = newString + (char)(string.charAt(i));
                isSpace = false;
            }
        }

        if (newString.charAt(0) >= 65 && newString.charAt(0) <= 90){
            newString = newString + (char)(newString.charAt(0) + 32);
            stringOut = newString + newString.substring(1);     
        }else{
            stringOut = newString;
        }

        return stringOut;
    }
    

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;

        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == chr){
            count ++;
        }
    }
        int[] result = new int[count];
        count = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == chr);
            count++;
        }

        return result;
    }
}
