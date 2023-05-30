package com.Graph;

import java.util.ArrayList;

public class GraphBasic {

    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V]; // Arrays of array list

        for (int i = 0; i < graph.length; i++) {
            graph[i]  = new ArrayList<Edge>(); // difining each cell as arraylist
        }

        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(0, 2));
        graph[3].add(new Edge(4, 5));
        graph[4].add(new Edge(9, 10));

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                // System.out.println(graph[i].get(j).src+","+graph[i].get(j).dest);
                Edge edge = graph[i].get(j);
                System.out.println("Source: " + edge.src + ", Destination: " + edge.dest);
            }
        }
    }
}
