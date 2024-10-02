class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return new int[0];

        // Deep copy
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        map.put(arr2[0], rank);

        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] != arr2[i - 1]) {
                rank++;
            }
            map.put(arr2[i], rank);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
