class Solution {
    public List<String> generateParenthesis(int n) 
    {
        List<String> ans = new ArrayList<>();
        generate(n, n, new StringBuilder(), ans);
        return ans;
    }

  private void generate(int l, int r, final StringBuilder sb, List<String> ans) {
    if (l == 0 && r == 0) {
      ans.add(sb.toString());
      return;
    }

    if (l > 0)
    {
      sb.append("(");
      generate(l - 1, r, sb, ans);
      sb.deleteCharAt(sb.length() - 1);
    }
    if (l < r) 
    {
      sb.append(")");
      generate(l, r - 1, sb, ans);
      sb.deleteCharAt(sb.length() - 1);
    }
    }
}