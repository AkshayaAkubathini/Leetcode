class Solution {

    public int maxLength(List<String> arr) {
        List<Integer> masks = new ArrayList<>();

        for (String s : arr) {
            Set<Character> seen = new HashSet<>();
            int mask = 0;
            for (char c : s.toCharArray()) {
                if (seen.contains(c)) {
                    mask = -1;
                    break;
                }
                seen.add(c);
                int i = c - 'a';
                mask |= 1 << i;
            }

            if (mask != -1) {
                masks.add(mask);
            }
        }

        return dfs(masks, 0, 0);
    }

    private int dfs(List<Integer> masks, int s, int usedMask) {
        int res = Integer.bitCount(usedMask);
        for (int i = s; i < masks.size(); ++i) {
            if ((usedMask & masks.get(i)) == 0) {
                res = Math.max(res, dfs(masks, i + 1, usedMask | masks.get(i)));
            }
        }
        return res;
    }
}