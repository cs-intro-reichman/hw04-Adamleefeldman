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
        System.out.println(allIndexOf("Hello World", 'l'));  
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
        boolean isSpace = false;

        for (int i = 0; i < string.length(); i++){
            char currentChar = string.charAt(i);
            
            if (currentChar == ' '){
                isSpace = true;
            }else if (isSpace){
                if (currentChar >= 'a' && currentChar <= 'z'){
                    newString = newString + (char)(currentChar - 'a' + 'A');
                    isSpace = false;
                }else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                    newString = newString + currentChar;
                    isSpace = false;
                }else {
                    newString = newString + currentChar;
                }
            }else if(currentChar != ' ' && (currentChar >= 'A' && currentChar <= 'Z')){
                newString = newString + (char)(currentChar - 'A' + 'a');
                isSpace = false;
            }else{
                newString = newString + currentChar;
                isSpace = false;
            }
        }

        if (newString.length() > 0 && newString.charAt(0) >= 'A' && newString.charAt(0) <= 'Z'){
            newString = (char)(newString.charAt(0) - 'A' + 'a') + newString.substring(1);
        }

        return newString;
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
            if (string.charAt(i) == chr){
            result[count] = i;
            count++;
            }
        }
        return result;
    }
}
