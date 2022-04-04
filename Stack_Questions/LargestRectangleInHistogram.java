package Stack_Questions;
import java.util.*;
public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> indices=new Stack<>();
        List<Integer> histogramAsList=new ArrayList<>();
        for(int i=0;i<heights.length;i++){
            histogramAsList.add(heights[i]);
        }
        histogramAsList.add(0);
        int maxArea=0;
        for(int i=0;i<histogramAsList.size();i++){
            //Pop out heights from the stack until the height at top index in stack is greater than equal
            //to height at current index
            while(!indices.isEmpty() && histogramAsList.get(indices.peek())>=histogramAsList.get(i)){
                 int top=indices.pop();
                 //Formula for width:R-L-1
                int width=indices.isEmpty()?i:i-indices.peek()-1;
                maxArea=Math.max(maxArea,histogramAsList.get(top)*width);
            }
            indices.push(i);
        }
        return maxArea;
    }
}
