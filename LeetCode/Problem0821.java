// WIP
class Problem0821 {
    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];
        
        if (C == ' ') {
            return res;
        }
        
        for (int i = 0; i < res.length; i++) {
            if (S.charAt(i) != C) {
                int prev = 999999999;
                int after = 999999999;
                
                for (int j = 0; S.charAt(j) != C; j++) {
                    if (S.charAt(j) != C) {
                        if (prev == 999999999)
                            prev = 0;
                        prev++;
                    }
                    System.out.println(S.charAt(j));
                    System.out.println(prev);
                }
                
                for (int j = i+1; S.charAt(j-1) != C; j++) {
                    if (S.charAt(j) != C) {
                        if (after == 999999999)
                            after = 0;
                        after++;
                    }
                }
                
                if (prev < after) {
                    res[i] = prev;
                } else {
                    res[i] = after;
                }
            } else {
                res[i] = 0;
            }
        }
        
        return res;
        
    }
}