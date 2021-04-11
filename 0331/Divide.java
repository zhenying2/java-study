//사용자에게 2개의 수를 입력받아 먼저 입력받은 수를 나중에 입력한 수로 나누는 프로그램
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
				System.out.print("나뉘게 되는 숫자를 입력하세요: ");
				int divide1=scanner.nextInt();
				System.out.print("나눌 수를 입력하세요: ");
				int divide2=scanner.nextInt();
				System.out.println(divide1+"을 "+divide2+"로 나누면 몫은 "+divide1/divide2+"입니다.");
				break;
			} catch (ArithmeticException e){ //예외1, 나누는 수로 사용자가 0을 입력했을 때 실행됨
				System.out.println("0으로 나눌 수 없습니다. 숫자를 다시 입력하세요.");
			} catch (InputMismatchException e){	//예외2, 입력한 수가 정수가 아닌 경우 실행됨.
				scanner=new Scanner(System.in);
				System.out.println("입력한 수가 정수가 아닙니다. 다시 입력하세요.");			
			}
		}
		scanner.close();
	}
}
