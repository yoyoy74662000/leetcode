/**
 * Design and implement a TwoSum class. It should support the following operations: add and find.

 add - Add the number to an internal data structure.
 find - Find if there exists any pair of numbers which sum is equal to the value.

 Example 1:

 add(1); add(3); add(5);
 find(4) -> true
 find(7) -> false
 Example 2:

 add(3); add(1); add(2);
 find(3) -> true
 find(6) -> false
 *
 *
 */
public class TwoSumIIIDatastructuredesign {
    private HashMap<Integer, Integer> map;
    private List<Integer> list;
    /** Initialize your data structure here. */
    public TwoSum() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    /** Add the number to an internal data structure.. */
    public void add(int number) {
        list.add(number);
        if (map.containsKey(number)){
            map.put(number, map.get(number)+1);
        }
        else {
            map.put(number, 1);
        }
    }

    // Find if there exists any pair of numbers which sum is equal to the value.
    public boolean find(int value) {
        for (int i = 0; i < list.size(); i++) {
            int num1 = list.get(i);
            int num2 = value - num1;
            if ((num1 == num2 && map.get(num1) > 1) || (num1 != num2 && map.containsKey(num2)))
                return true;
        }
        return false;
    }
}
