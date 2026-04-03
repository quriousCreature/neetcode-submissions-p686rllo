class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i=0; i<numbers.length; i++ ){
            int num1 = numbers[i];
            for(int j=i+1; j<numbers.length; j++) {
                int num2 = numbers[j];
                if (target == (num1+num2))
                    return new int[] {i+1, j+1};
            }
        }
        return new int[2];
    }
}
