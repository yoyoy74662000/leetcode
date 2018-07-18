/**
 *
 * 時間 O(NloglogN)
 * 空间 O(N)
 *
 */
public class CountPrimes {
    boolean[] notPrime = new boolean[n];
    int count = 0;
        for (int i = 2; i < n; i++) {
        if (notPrime[i] == false) {
            count++;
            for (int j = 2; i*j < n; j++) {
                notPrime[i*j] = true;
            }
        }
    }

        return count;
}
