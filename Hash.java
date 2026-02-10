import java.util.*;

class Hash{
    public static void main(String[] args) {
        int nums[] = new int[] {1,2,3,4,5,6,7,8,9,1};

        
        boolean val = duplicateNums(nums);

        System.out.println(val);
    }

    static boolean duplicateNums(int [] num)
    {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < num.length; i++) {
            if(!set.add(num[i]))
            {
                return true;
            }
        }

        return false;
    }

    static int firstDuplicate(int [] num)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i : num)
        {
            if(!set.add(i))
            {
                return i;
            }
        }
        return -1;
    }

    static int firstDuplicate2(int [] num)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < num.length; i++)
        {
            if(map.put(num[i],i) != null)
            {
                return i;
            }
        }

        
        return -1;
    }
}