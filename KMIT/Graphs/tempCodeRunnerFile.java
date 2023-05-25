
        g.addEdge(1, 5);
        g.addEdge(0, 2);
        g.addEdge(2, 4);
        System.out.println("Graph DFS:");
        g.DFS();
        System.out.println(
            "\nNumber of Connected Components: "
            + g.ConnectedComponents());
    }
}