public class B9 {
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y; // find the XOR of x and y
        int distance = 0;
        // count the number of set bits in xor
        while (xor != 0) {
            distance++;
            xor &= xor - 1; // clear the least significant set bit
        }
        return distance;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        System.out.println(hammingDistance(x, y)); // Output: 2

        x = 3;
        y = 1;
        System.out.println(hammingDistance(x, y)); // Output: 1
    }
}
