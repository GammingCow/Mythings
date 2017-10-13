
public class ConstructGraph {
	
	int[][] graph;
	int[] vertices;
	ArayManager man;
	
	public ConstructGraph(int[] inputVertices, int[][] inputWeights) {
		vertices = inputVertices;
		graph = inputWeights;
	}
	
	public boolean graphCheck() {
		if (graph.length == vertices.length) {
			return true;
		}else {
			return false;
		}
	}
	
	public int[] nearistNabor() {
		int least = 0;
		int[] path;
		
		for (int i = 0; i > vertices.length; i++) {
			for (int z = 0; z > graph.length; z++) {
				if(graph[i][z] > graph[i][least]) {
					least = z;
				}
			}
		}
	}
}
