class CanFinish {
    boolean valid = true;
    int[] visited;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> edges = new ArrayList<>(numCourses);
        visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            edges.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        for (int i = 0; i < numCourses && valid; i++) {
            if (visited[i] == 0) {
                dfs(edges, i);
            }
        }
        return valid;
    }

    public void dfs(List<List<Integer>> edges, int i) {
        visited[i] = 1;
        for (Integer edge : edges.get(i)) {
            if (visited[edge] == 0) {
                dfs(edges, edge);
                if (!valid) {
                    return;
                }
            } else if (visited[edge] == 1) {
                valid = false;
                return;
            }
        }
        visited[i] = 2;
    }
}
