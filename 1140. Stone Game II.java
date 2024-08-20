class Solution {
    Map<String, Integer> map;

    public int stoneGameII(int[] piles) {
        map=new HashMap<>();
        return dfs(true, 0, 1, piles);
    }

    public int dfs(boolean isAliceTurn, int i, int M, int[] piles){
        if (i==piles.length) return 0;
        if (map.containsKey(isAliceTurn+""+i+""+M)) return map.get(isAliceTurn+""+i+""+M);

        int res=0;
        if (!isAliceTurn) res=Integer.MAX_VALUE;
        int total=0;

        for (int X=1; X<=2*M; X++){
            if (i+X > piles.length) break;
            total+=piles[i+X-1];
            if (isAliceTurn)
                res=Math.max(res, total+dfs(!isAliceTurn, i+X, Math.max(M, X), piles));
            else
                res=Math.min(res, dfs(!isAliceTurn, i+X, Math.max(M, X), piles));
        }
        map.put(isAliceTurn+""+i+""+M, res);
        return res;
    }
}
