import java.util.HashSet;
import java.util.Set;

public class Intercept {
    public static Double[] intercept (double[] arr1, double[] arr2){
         final double EPSILON = 1e-15;
        Set<Double> interception = new HashSet<>();
        if(arr1 == null || arr2 == null){
            return interception.toArray(new Double[interception.size()]);
        }
        double[] tempArr1 = arr1;
        double[] tempArr2 = arr2;
        double temp = arr1[0] + 1;
        for (int i = 0; i < tempArr1.length; i++){
            for(int j = 0; j < tempArr2.length; j++){
                if (tempArr1[i] == tempArr2[j] && tempArr1[i] != temp){
                    interception.add(tempArr1[i]);
                    temp = tempArr1[i];
                }
            }
        }
        return interception.toArray(new Double[interception.size()]);
    }
}
