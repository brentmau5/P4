import java.util.LinkedList;
import java.util.List;
public class Node {
	private int x;
	private int y;
	private double hCost;
	private double fCost;
	private int hp;
	private Node parent;
	private double gCost;
	private List<Node> neighbors = new LinkedList<Node>();
	/**
	 * Creates a node for the A* search
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @param totalCost the g(n) cost from the parent node
	 * @param hCost the heuristic cost from the 
	 * @param parent the parent of the Node
	 */
	public Node(int x, int y,double totalCost, double hCost, Node parent) {
		this.x = x;
		this.y = y;
		this.gCost = totalCost;
		this.parent = parent;
		this.hCost = hCost;
		fCost = gCost + hCost;
	}
	public void setHP(int hp){
		this.hp= hp;
	}
	public int getHP(){
		return hp;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Node getParent() {
		return parent;
	}
	public double gethCost() {
		return hCost;
	}
	public double getfCost() {
		return fCost;
	}
	public double getgCost() {
		return gCost;
	}
	public List<Node> getNeighbors() {
		return neighbors;
	}
	public void setNeighbors(List<Node> nodes) {
		neighbors.clear();
		for (Node n : nodes) {
			neighbors.add(n);
		}
	}
}
