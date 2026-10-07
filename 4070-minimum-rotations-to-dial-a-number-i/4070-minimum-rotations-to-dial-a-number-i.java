class Solution {
    public int minRotations(String s) {
        int rotations = 0;
        int current = 0;

        for (byte b : s.getBytes()) {
            int next = b - '0'; // '0' is 48 in ASCII
            int diff = Math.abs(current - next);
            rotations += Math.min(diff, 10 - diff);
            current = next;
        }

        return rotations;
    }
}