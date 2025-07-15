public class Jade{
	public static void main(String[] args){
		int num1=20;
		int num2=30;
		boolean isEqual=(num1==num2);
		boolean isNotEqual=(num1!=num2);
		boolean isGreater=(num1>num2);
		boolean isLesser=(num1<num2);
		boolean isGreaterOrEqual=(num1>=num2);
		boolean isLesserOrEqual=(num1<=num2);
	
		System.out.println("num1==num2:" +isEqual);
		System.out.println("num1!=num2:" +isNotEqual);
		System.out.println("num1>num2:" +isGreater);
		System.out.println("num1 < num2 : " + isLesser);
        System.out.println("num1 >= num2 : " + isGreaterOrEqual);
        System.out.println("num1 <= num2 : " + isLesserOrEqual);   
	}
}
