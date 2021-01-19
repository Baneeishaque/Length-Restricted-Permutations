class LengthRestrictedPermutations {

    private static void permutation(final char[] perm, final int pos, final String str) {

        if (pos == perm.length) {
        
            System.out.println(new String(perm));
        
        } else {
        
            for (int i = 0; i < str.length(); i++) {
        
                perm[pos] = str.charAt(i);
                permutation(perm, pos + 1, str);
            }
        }
    }

    public static void main(final String[] args) throws java.lang.Exception {

        final char[] perm = new char[6];
        permutation(perm, 0, "1234567890");
    }
}