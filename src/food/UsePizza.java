class UsePizza{
	//���ڸ� �Դ´�..
	public void eat(Pizza p){
		p.slice = 3;
	}
	//������ �����Ѵ�.
	public void setSlice(int slice){
		slice = 3;
	}
	public static void main(String[] args){
		Pizza p1 = new Pizza("Pizza Hut");
		Pizza p2 = new Pizza("Domino");

		UsePizza up = new UsePizza();
		up.setSlice(5);
		up.setSlice(p1.slice);//���ڿ� ������ ����.
		up.eat(p2);
	}
}
