
public class BoardNode {
	private final byte INRANGE = 1;
	private final byte OUTOFRANGE = 2;
	private final byte UNKNOWN = 0;
		private boolean open = true;
		private boolean tower = false;
		private boolean goldMine = false;
		private boolean tree = false;
		private double probability = .1;
		private double cost=0;
		private byte hit = UNKNOWN;
		private boolean seen = false;
		private boolean steppedOn = false;
		public BoardNode(){
		}
		public boolean isOpen() {
		return open;
	}
			
		public void setOpen(boolean open) {
		this.open = open;
	}
	public boolean isTower() {
		
	return tower;	
}
	public void heuristic()
	{
		cost = 0;
		cost += probability*100;
		if(hit==INRANGE){
			cost += 10000;
		}
		this.cost = cost;
	}
	public void setTower(boolean tower) {
		this.tower = tower;
	}
	public boolean isGoldMine() {
		return goldMine;
	}
	public double getCost(){
		return cost;
	}
	public void setGoldMine(boolean goldMine) {
		this.goldMine = goldMine;
	}
	public double getProbability() {
		return probability;
	}
	public void setProbability(double d) {
		this.probability = d;
	}
	public boolean isTree() {
		return tree;
	}
	public void setTree(boolean tree) {
		this.tree = tree;
	}
	public boolean isSeen() {
		return seen;
	}
	public void setSeen(boolean seen) {
		this.seen = seen;
	}
	public boolean isSteppedOn() {
		return steppedOn;
	}
	public void setSteppedOn(boolean steppedOn) {
		this.steppedOn = steppedOn;
	}
	public byte getHit() {
		return hit;
	}
	public void setHit(byte hit) {
		this.hit = hit;
	}
}
