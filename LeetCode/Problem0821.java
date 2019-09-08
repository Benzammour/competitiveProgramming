class Problem0821 {
    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];
        
        int prev = -99999;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C)
                prev = i;
            res[i] = i - prev;
        }

        prev = 99999;
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == C)
                prev = i;
            res[i] = Math.min(res[i], prev - i);
        }

        return res;
    }
}