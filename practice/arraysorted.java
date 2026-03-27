public class arraysorted {
    public static void main(String[] args) {
        int [] numArray = Arrayutility.inputArray();
        boolean isInc = isIncreasing(numArray);
        boolean isDec = isDecreasing(numArray);
        if (isInc || isDec){
            System.out.println("Your Array is sorted");
        }else {
            System.out.println("Your array is not sorted");
        }
    }
    public static boolean isIncreasing(int [] numArray){
        int i = 1;
        while (i< numArray.length){
            if (numArray[i] >= numArray[i-1]){
                return false;
            }
            i++;
        }

        return true;

    }
    public static boolean isDecreasing(int [] numArray){
        int i = 1;
        while (i< numArray.length){
            if (numArray[i] <= numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
