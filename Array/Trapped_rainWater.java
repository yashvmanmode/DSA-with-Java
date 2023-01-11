//* LEETCODE HARD QUESTION *//
import java.util.*;

public class Trapped_rainWater {

    public static int Trapping_RainWater(int height[], int Width) {

        int len = height.length;

        // CALCULATE LEFT MAX BOUNDARY - ARRAY
        int LeftMax[] = new int[len];
        //the first leftmax boundary will be max for heigth
        LeftMax[0] = height[0];
        for (int i=1; i<len; i++) {
            //there for i=0 is defined so we have begin from i-1
            LeftMax[i] = Math.max(height[i], LeftMax[i-1]);
        }

        //CALCULATE RIGHT MAX BOUNDARY - ARRAY
        int RightMax[] = new int[len];
        //here len-1 is the right max index
        RightMax[len-1] = height[len-1];
        for (int i=len-2; i>=0; i--) {
            //i=len-2 is the last second index of array
            RightMax[i] = Math.max(height[i], RightMax[i+1]);
        }

        //RUN A LOOP FOR WHICH    
        int Trapped_Water = 0;
        for (int i=0; i<len; i++) {

            //water level = min(lestMostBoundary, rightMostBoundary)
            int WaterLevel = Math.min(LeftMax[i], RightMax[i]);

            //Trapped Water = (waterLevel - height[i]) * width
            Trapped_Water += (WaterLevel-height[i])*Width;
        }

        return Trapped_Water;
        
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int width = 1;

        System.out.println("The Trapped water is: " + Trapping_RainWater(height, width) + " units");

    }
}
