/**/
class Car{
	String color = "red";
	int price = 500;
	String name = "Benz";
	Wheel wheel; //�� �ڵ尡 ������ ���� ����??
	//Ŭ���� �ȿ��� �ڷ����� �� �� �ִµ�, �ڹ��� �ڷ����� �� 4���̴�.
	//���� �� Ŭ���� �ȿ��� ����, ����, �����̿ܿ��� ��ü���� �� �� �ִ�..
	//��ü �ڷ����� �ڷ����̴ϱ�
	//Ŭ������� ������ �̸��� �޼��带 ������ �����ڶ� �ϰ�,
	//�����ڴ� �̸������� �� �� �ֵ���, ��ü�� ���� Ÿ�ӿ�, ���� �ʱ�ȭ �۾��� ���� ��,
	//�۾��� �����ϴ� �뵵�� �޼����̴�.
	public Car(){
		this.wheel = new Wheel();
	};

	public static void main(String[] args){
		//�ڵ����� �����ϰ�
		//�ڵ����� �̸� ����ϰ�
		//�� �ڵ��� ������ �귣��, ����, ������ ��±��� �Ͻÿ�

		Car c1 = new Car();
		System.out.println("�ڵ����� �̸�: "+c1.name);
		//System.out.println("�ڵ��� ����: "+c1.wheel);
		System.out.println("�ڵ��� ������ �귣��: "+c1.wheel.brand);
		System.out.println("�ڵ��� ������ ����: "+c1.wheel.color);
		System.out.println("�ڵ��� ������ ����: "+c1.wheel.price);

	}
}
