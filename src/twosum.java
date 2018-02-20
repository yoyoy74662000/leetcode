public class twosum {
    //step 1
    //base case
        if(nums ==null || nums.length<2){
        return new int[]{-1,-1};
    }
    int res[] = new int[]{-1,-1};
    // step 3 hashmap
    HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
        if(map.containsKey(target-nums[i])){
            res[0]=map.get(target-nums[i]);
            res[1]=i;
            break;
        }
        //step 2
        map.put(nums[i],i);
    }
        return res;



}
