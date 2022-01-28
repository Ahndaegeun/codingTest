package main.sub;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Graph {

    public static List<String> bfs(Map<String, List<String>> graph, String startNode) { // 너비 우선 탐색
        List<String> visited = new ArrayList<>();
        List<String> needVisit = new ArrayList<>();
        needVisit.add(startNode);

        while(needVisit.size() > 0) {
            String node = needVisit.remove(0);

            if(!visited.contains(node)) {
                visited.add(node);
                needVisit.addAll(graph.get(node));
            }
        }

        return visited;
    }

    public static List<String> dfs(Map<String, List<String>> graph, String startNode) { // 깊이 우선 탐색
        List<String> visited = new ArrayList<>();
        List<String> needVisit = new ArrayList<>();
        needVisit.add(startNode);

        while(needVisit.size() > 0) {
            String node = needVisit.remove(needVisit.size() - 1);

            if(!visited.contains(node)) {
                visited.add(node);
                needVisit.addAll(graph.get(node));
            }
        }

        return visited;
    }

    public static void main(String[] args) {

    }
}
