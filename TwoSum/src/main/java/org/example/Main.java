package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        //  nums = [3,2,4], target = 6
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> nums = new ArrayList<>();
//        int target;
//        String str = scanner.nextLine();
//        nums.addAll(List.of(str.trim().split("target")[0].replaceAll("[^0-9]+", " ").trim().split(" ")));
//        target = Integer.parseInt(str.trim().split("target")[1].replaceAll("[^0-9]+", " ").trim());
//        Collections.sort(nums);
//        for (int i = 0; i < nums.size(); i++) {
//            if(Integer.parseInt(nums.get(i))>target){
//                break;
//            }
//            for (int j = i+1; j < nums.size(); j++) {
//                if (Integer.parseInt(nums.get(i))+Integer.parseInt(nums.get(j)) == target){
//                    System.out.println("["+nums.get(i) +","+nums.get(j)+"]");
//                    System.exit(123);
//                } else if (Integer.parseInt(nums.get(i))+Integer.parseInt(nums.get(j)) > target){
//                    break;
//                }
//            }
//        }
    }
    public static int[] twoSum(int[] nums1, int target) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (Integer element:nums1
             ) {
            nums.add(element);
        }
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > target){
                break;
            }
            for (int j = i+1; j < nums.size(); j++) {
                if (nums.get(i)+nums.get(j) == target){
                    return new int[]{nums.get(i), nums.get(j)};
                } else if (nums.get(i)+nums.get(j) > target){
                    break;
                }
            }
        }
        return null;
    }
}