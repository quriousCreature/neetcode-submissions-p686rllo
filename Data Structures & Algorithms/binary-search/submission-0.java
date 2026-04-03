class Solution {
    public int search(int[] nums, int target) {
        int lower = 0;
        int upper = nums.length-1;

        // int mid = upper/2;

        // System.out.println("Upper :" + upper + "  Lower "+ lower);

        int take = 0;
        while( lower <= upper ) {
            // System.out.println("Take " + ++take +"Upper " + upper + "Lower "+ lower);
            if (upper == lower && target != nums[upper]) {
                return -1;
            }

            int mid = (upper + lower)/2;
            // System.out.println("Upper " + upper + "Lower "+ lower + "Mid" + mid);
            // System.out.println();
            if (target == nums[mid]) return mid;
            else if (target > nums[mid]) {
                lower = mid+1;
            } else {
                upper = mid-1;
            }

        }  
        return -1;      
    }
}
