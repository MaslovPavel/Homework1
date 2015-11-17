public class CheckEquals {
    public static boolean checkEquals (String[] strArr){
        boolean hasEqual = false;
        if (strArr == null || strArr.length <= 1){
            return false;
        }
        for(int i = 0; i < strArr.length - 1; i++){
            for(int j = i + 1; j < strArr.length; j++){
                if (strArr[i].equals(strArr[j])){
                    hasEqual = true;
                    break;
                }
            }
            if (hasEqual){
                break;
            }
        }
        return hasEqual;
    }
}
