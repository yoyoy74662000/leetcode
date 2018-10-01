/**
 * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

 Example:

 MovingAverage m = new MovingAverage(3);
 m.next(1) = 1
 m.next(10) = (1 + 10) / 2
 m.next(3) = (1 + 10 + 3) / 3
 m.next(5) = (10 + 3 + 5) / 3
 *
 *
 */
public class MovingAveragefromDataStream {
    private double previousSum = 0.0;
    private int maxSize;
    private Queue<Integer> currentWindow;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        currentWindow = new LinkedList<Integer>();
        maxSize = size;
    }

    public double next(int val) {
        if(currentWindow.size() == maxSize){
            previousSum -= currentWindow.remove();
            previousSum += val;
            currentWindow.add(val);
        } else{
            previousSum += val;
            currentWindow.add(val);
        }
        return previousSum / currentWindow.size();
    }
}
