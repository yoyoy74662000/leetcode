// [
//    [2],
//   [3,4],
//  [6,5,7],
// [4,1,8,3]
//]
public class trianglemax {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        list1.add(2);
        list2.add(3);
        list2.add(4);
        list3.add(6);
        list3.add(5);
        list3.add(7);
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        res.add(list1);
        res.add(list2);
        res.add(list3);
        res.add(list4);
        System.out.println(res);
        System.out.println(minimumTotal(res));

    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int[] total = new int[triangle.size()];
        int l = triangle.size() - 1;

        for (int i = 0; i < triangle.get(l).size(); i++) {
            total[i] = triangle.get(l).get(i);
        }

        // iterate from last second row
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i + 1).size() - 1; j++) {
                total[j] = triangle.get(i).get(j) + Math.max(total[j], total[j + 1]);
            }
        }

        return total[0];
    }
}
