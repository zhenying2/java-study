//����ڿ��� 2���� ���� �Է¹޾� ���� �Է¹��� ���� ���߿� �Է��� ���� ������ ���α׷�
//HW3

import java.util.Scanner;
import java.util.InputMismatchException;

public class Divide
{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);

		while (true)
		{
			try{
				System.out.print("������ �Ǵ� ���ڸ� �Է��ϼ���: ");
				int divide1=scanner.nextInt();
				System.out.print("���� ���� �Է��ϼ���: ");
				int divide2=scanner.nextInt();
				System.out.println(divide1+"�� "+divide2+"�� ������ ���� "+divide1/divide2+"�Դϴ�.");
				break;
			} catch (ArithmeticException e){ //����1, ������ ���� ����ڰ� 0�� �Է����� �� �����
				System.out.println("0���� ���� �� �����ϴ�. ���ڸ� �ٽ� �Է��ϼ���.");
			} catch (InputMismatchException e){	//����2, �Է��� ���� ������ �ƴ� ��� �����.
				scanner=new Scanner(System.in);
				System.out.println("�Է��� ���� ������ �ƴմϴ�. �ٽ� �Է��ϼ���.");			
			}
		}
		scanner.close();
	}
}
