package java_014;

import java.util.Arrays;

public class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties,(o1, o2)->o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0]);
        int cnt=0;
        int max=-1;
        int n=properties.length;
        for(int i=0;i<n;i++){
            if(max>properties[i][1]){
                cnt++;
            }
            max=Math.max(max,properties[i][1]);

        }
        return cnt;
    }

    public static void main(String[] args) {

    }
}
