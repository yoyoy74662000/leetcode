public class InsertDeleteGetRandom {
    class RandomizedSet {

        ArrayList<Integer> nums;
        HashMap<Integer, Integer> locs;
        java.util.Random rand = new java.util.Random();
        /** Initialize your data structure here. */
        public RandomizedSet() {
            nums = new ArrayList<Integer>();
            locs = new HashMap<Integer, Integer>();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            boolean contain = locs.containsKey(val);
            if ( contain ) return false;
            locs.put( val, nums.size());
            nums.add(val);
            return true;
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            boolean contain = locs.containsKey(val);
            if ( ! contain ) return false;
            int loc = locs.get(val);
            // Importan↓↓↓↓
            if (loc < nums.size() - 1 ) { // not the last one than swap the last one with this val
                int lastone = nums.get(nums.size() - 1 );
                nums.set( loc , lastone );
                locs.put(lastone, loc);
            }
            locs.remove(val);
            nums.remove(nums.size() - 1);
            return true;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            return nums.get( rand.nextInt(nums.size()) );
        }
    }
}

public class InsertDeleteGetRandom2 {
    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<Integer, Integer>();
        list = new ArrayList<Integer>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }else {
            map.put(val, list.size());
            list.add(val);
            return true;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }else {
            int key = map.get(val);
            int lastElement = list.get(list.size() - 1);
            map.put(lastElement, key);
            list.set(key, lastElement);
            map.remove(val);
            list.remove(list.size() - 1);
            return true;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        Random random = new Random();
        return list.get( random.nextInt(list.size()) );
    }
}