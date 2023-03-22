import java.util.*;
 class P35{
public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int j = 0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length && j < nums2.length ; i++){
           if( nums1[i] == nums2[j]){
            al.add(nums1[i]);
            j++;
           }else if(nums1[i] < nums2[j]){
                continue;
           }else{
            j++;
            i--;
           }
        }
        int intersection[] = new int[al.size()];
        for (int k = 0; k < al.size(); k++) {
            intersection[k] = al.get(k);
        }
        return intersection;
    }

    public static void main(String[] args){
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {2, 1};
        int[] intersection = intersect(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(intersection));
    }
}