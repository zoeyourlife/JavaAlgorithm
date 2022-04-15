//****************
//���ϸ�: Television.java
//�ۼ���: ������
//�ۼ���: 2022-04-15
//����: �ڷ������� ������ �˷��ִ� ����(class �κ�)
//****************
package hw9_1;

public class Television { // private�� ���� ����
	private String model;
	private int price;
	private static int numberOfTVs = 0;
    //private �������� ����Ϸ��� getter setter(public)��� 
	public static int getNumberOfTVs() { 
		return numberOfTVs;
	}

	public static void setNumberOfTVs(int numberOfTVs) {
		Television.numberOfTVs = numberOfTVs;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
    // �Ű����� (����Ʈ ������). �𵨸� , ����, �ڷ����� �� ����
	public Television() {
		model = "MyTV";
		price = 0;
		numberOfTVs = numberOfTVs + 1;
	}

	// �𵨸��� �Ű������� �ް� �ʱ�ȭ. ���� 0����, �ڷ����� �� 1 ����
	public Television(String model) {
		this.model = model; // �Ű������� ���� �� �̸� ���� (this)
		price = 0;
		numberOfTVs = numberOfTVs + 1;
	}

	// �𵨸�� ������ �Ű������� �ް� �ʱ�ȭ. �ڷ����� �� 1����
	public Television(String model, int price) {
		this.model = model; //�� ��� ������ �Ű������� �޾� ����(this)
		this.price = price;
		numberOfTVs = numberOfTVs + 1;
	}

	// �ڷ������� ������ ���ڿ��� ����� ����
	public String toString() {
		return "�𵨸�: " + model + "����:" + price;
	}

}
