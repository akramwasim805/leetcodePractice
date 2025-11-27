package arrays;


public class BinarySearchRange {

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};

        // find leftmost index
        int leftIndex = findLeft(nums, target);

        // if not found, return [-1, -1]
        if (leftIndex == -1) {
            return result;
        }

        // find rightmost index
        int rightIndex = findRight(nums, target);

        result[0] = leftIndex;
        result[1] = rightIndex;

        return result;
    }

    private int findLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;          // potential leftmost index
                right = mid - 1;    // keep searching to the left
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    private int findRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;          // potential rightmost index
                left = mid + 1;     // keep searching to the right
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        BinarySearchRange sr = new BinarySearchRange();
        int[] result = sr.searchRange(new int[]{5,7,7,8,8,10}, 8);

        System.out.println(result[0] + ", " + result[1]);  // 3, 4
    }
}

