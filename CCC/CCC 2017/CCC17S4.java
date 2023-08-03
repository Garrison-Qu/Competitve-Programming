import java.io.*;
import java.util.*;

public class CCC17S4 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int V = (int) st.nval;
        st.nextToken();
        int M = (int) st.nval;
        st.nextToken();
        int D = (int) st.nval;

		List<Edge> graphEdges = new ArrayList<Edge>();
        for (int i = 0; i < M; i++) {
			st.nextToken();
			int A = (int) st.nval;
			st.nextToken();
			int B = (int) st.nval;
			st.nextToken();
			int C = (int) st.nval;
			if (C - D > 0) {
				C = C - D;
			} else {
				C = 0;
			}
            graphEdges.add(new Edge(A - 1, B - 1, C));
        }

        graphEdges.sort(new Comparator<Edge>() {
			@Override public int compare(Edge o1, Edge o2)
			{
				return o1.weight - o2.weight;
			}
		});

		System.out.println(kruskals(V, graphEdges));
    }

    public static class Edge extends CCC17S4 {
        int src, dest, weight;

		public Edge(int src, int dest, int weight)
		{
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}
    }

    public static class Subset extends CCC17S4 {
		int parent, rank;

		public Subset(int parent, int rank)
		{
			this.parent = parent;
			this.rank = rank;
		}
	}

    private static int kruskals(int V, List<Edge> edges)
	{
		int j = 0;
		int noOfEdges = 0;

		// Allocate memory for creating V subsets
		Subset subsets[] = new Subset[V];

		// Allocate memory for results
		Edge results[] = new Edge[V];

		// Create V subsets with single elements
		for (int i = 0; i < V; i++) {
			subsets[i] = new Subset(i, 0);
		}

		// Number of edges to be taken is equal to V-1
		while (noOfEdges < V - 1) {

			// Pick the smallest edge. And increment
			// the index for next iteration
			Edge nextEdge = edges.get(j);
			int x = findRoot(subsets, nextEdge.src);
			int y = findRoot(subsets, nextEdge.dest);

			// If including this edge doesn't cause cycle,
			// include it in result and increment the index
			// of result for next edge
			if (x != y) {
				results[noOfEdges] = nextEdge;
				union(subsets, x, y);
				noOfEdges++;
			}

			j++;
		}

		int minCost = 0;
		for (int i = 0; i < noOfEdges; i++) {
			minCost += results[i].weight;
		}
		
		return minCost;
	}

	// Function to unite two disjoint sets
	private static void union(Subset[] subsets, int x,
							int y)
	{
		int rootX = findRoot(subsets, x);
		int rootY = findRoot(subsets, y);

		if (subsets[rootY].rank < subsets[rootX].rank) {
			subsets[rootY].parent = rootX;
		}
		else if (subsets[rootX].rank
				< subsets[rootY].rank) {
			subsets[rootX].parent = rootY;
		}
		else {
			subsets[rootY].parent = rootX;
			subsets[rootX].rank++;
		}
	}

	// Function to find parent of a set
	private static int findRoot(Subset[] subsets, int i)
	{
		if (subsets[i].parent == i)
			return subsets[i].parent;

		subsets[i].parent = findRoot(subsets, subsets[i].parent);
		return subsets[i].parent;
	}
}

