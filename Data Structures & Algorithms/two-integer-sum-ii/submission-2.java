class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j= numbers.length -1;
        for (int i=0; i<=j;  ){
            int num1 = numbers[i];
            int num2 = numbers[j];
            int sum = num1 + num2 ;
            if (target == sum) {
                    return new int[] {i+1, j+1};
            }
            else if (target >sum ) {
                i++;
            } else {
                j--;
            }

        }
        return new int[2];
    }
}
