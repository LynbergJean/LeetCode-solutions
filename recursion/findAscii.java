import java.util.ArrayList;
import java.util.List;

class findAscii {
    public static void main(String[] args) {
        String input = "ABC";
        
        // Method 1: Print combinations (void method)
        System.out.println("Method 1 - Printing combinations:");
        printCombinations("", input);
        
        System.out.println("\n" + "=".repeat(30) + "\n");
        
        // Method 2: Return list of combinations
        System.out.println("Method 2 - Returning list:");
        List<String> result = getCombinations("", input);
        System.out.println(result);
        System.out.println("Total combinations: " + result.size());
        
        System.out.println("\n" + "=".repeat(30) + "\n");
        
        // Method 3: Different input
        System.out.println("Method 3 - With '1234':");
        List<String> result2 = getCombinations("", "1234");
        for(String combo : result2) {
            System.out.println(combo);
        }
        System.out.println("Total: " + result2.size());

        System.out.println("Method 4 - Returning list:");
        List<String> result1 = getCombinations("abc");
        System.out.println(result1);
        System.out.println("Total combinations: " + result1.size());
        
        System.out.println("\n" + "=".repeat(30) + "\n");
    }
    
    // TODO: Implement this - prints all combinations
    static void printCombinations(String processed, String unprocessed) {
        //base case we have an empty string 
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }

        //get first char
        char ch = unprocessed.charAt(0);

        //void so it returns nothing no need to catch anything
        printCombinations(ch + processed, unprocessed.substring(1));
        printCombinations(processed, unprocessed.substring(1));

    }
    
    // TODO: Implement this - returns list of all combinations
    static List<String> getCombinations(String processed, String unprocessed) {
        List<String> ret = new ArrayList<>();
        if(unprocessed.isEmpty())
        {
            ret.add(processed);
            return ret;
        }

        char ch = unprocessed.charAt(0);

        List<String> left = getCombinations(ch + processed, unprocessed.substring(1));
        List<String> right = getCombinations(processed, unprocessed.substring(1));

        ret.addAll(left);
        ret.addAll(right);
        return ret;  // Replace this
    }

    static List<String> getCombinations(String unprocessed) {
        List<String> s = new ArrayList<>();

        if(unprocessed.isEmpty())
        {
            s.add("");
            return s;
        }

        char ch = unprocessed.charAt(1);

        List<String> left = getCombinations(ch + unprocessed.substring(1));
        List<String> right = getCombinations(unprocessed.substring(1));

        s.addAll(left);
        s.addAll(right);

        return s;
    }

}
