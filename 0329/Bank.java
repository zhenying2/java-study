public class Bank{
	public static void main(String args[]){
		Account hong=new Account("ȫ�浿");
		hong.deposit(20);	
		//hong.deposit(-100);	//MalformedData ���� �߻�

		try{
				//1st-1 try: normal
				hong.withdraw(15);
				//2nd try: abnormal
				//hong.withdraw(-50);		//BalanceOutOfBoundsException ���� �߻�
		} catch (BalanceOutOfBoundsException be){
				be.printStackTrace();
		} catch (MalformedData me){
			me.printStackTrace();
		}
		hong.check();

		//1st try : abnormal
		//hong.withdraw(1);	//BalanceOutOfBoundsException ���� �߻�

		/* 2nd try-catch */
		try{
			hong.withdraw(10);
			//BalanceOutOfBoundsException ���� �߻�
		} catch (BalanceOutOfBoundsException be){
			be.printStackTrace();
		}

		System.out.println("normal termination");
	}
}

