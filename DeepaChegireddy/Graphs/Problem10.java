public class Problem10 {
    private int count;
    public int countComponents(int n, int[][] edges) {
        this.count = n;
        int[] root = new int[n];
        for (int i = 0; i < n; ++i) root[i] = i;
        for (int[] edge : edges) {
            union(root, edge[0], edge[1]);
        }

        return this.count;
    }

    private int find(int[] root, int i) {
        if (root[i] == i) return i;
        return find(root, root[i]);
    }

    private void union(int[] root, int src, int dst) {
        int srcRoot = find(root, src);
        int dstRoot = find(root, dst);
        if (srcRoot != dstRoot) {
            root[srcRoot] = dstRoot;
            --this.count;
        }
    }

    public static void main(String[] args) {
        int[][] edges = new int[][] {{0,1},{1,2},{3,4},{2,4},{1,4},{0,4}};
        int n = 7;
        Problem10 nc = new Problem10();
        System.out.println(nc.countComponents(n, edges));
    }
}