public class CountExactSymbol {

    public static int countExactSymbol(char symbol, String text){
        int matchCounter = 0;
        if (text == null || text.equals("")){
            return 0;
        }
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == symbol) {
                matchCounter++;
            }
        }
        return matchCounter;
    }
}
