public class ArrayOps {
    public static void main(String[] args) {
        int[] testArray = {2, 8, 3, 7, 8};
        int[] testArray2 = {1, 2};
        System.out.println(secondMaxValue(testArray));
    }
    
    public static int findMissingInt(int [] array) {
        
        for (int i=0; i < array.length + 1; i++){
            boolean check = false;
            for (int j = 0; j < array.length; j++){
                if (i == array[j]){
                    check = true;
                    break;
                } 

            } 
            if (!check){
            return i;
        }                   
    }
        return -1;

    }


    public static int secondMaxValue(int [] array) {
        
        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i]>=max){
                secondMax = max;
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++){
            if (array[i]>secondMax){
                secondMax = array[i];
        }
    }

        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        
        for (int i = 0; i < array1.length; i++){
            boolean sameElements = false;
            for (int j = 0; j< array2.length; j++){

                if(array1[i] == array2[j]){
                    sameElements = true;
                }
            }
            if(sameElements == false){
                return false;
            }
        }
        return true;

    }

    public static boolean isSorted(int [] array) {
        boolean ascend = false;
        boolean descend = false;
       
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] <= array[i+1]){
                    ascend = true;
                }else if (array[i] >= array[i+1]){
                    descend = true;
                }else{
                    return false;
                }
            if (ascend && descend){
                return false;
            }
        }
                
        return true;

        }
        
     }
    


