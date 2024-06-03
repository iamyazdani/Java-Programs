public class Array1 {
    public static void main(String[] args) {
        // int nums[] = {1,2,3,4,5,6};
        int nums1[] = new int[5];
        nums1[0] = 2;
        nums1[1] = 45;
        nums1[2] = 32;
        nums1[3] = 13;
        nums1[4] = 67;
        try {
            System.out.println(nums1[6]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(nums1.length);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);    
        }
    }
}
