class UsePizza{
	//피자를 먹는다..
	public void eat(Pizza p){
		p.slice = 3;
	}
	//갯수를 조정한다.
	public void setSlice(int slice){
		slice = 3;
	}
	public static void main(String[] args){
		Pizza p1 = new Pizza("Pizza Hut");
		Pizza p2 = new Pizza("Domino");

		UsePizza up = new UsePizza();
		up.setSlice(5);
		up.setSlice(p1.slice);//피자에 영향이 없다.
		up.eat(p2);
	}
}
