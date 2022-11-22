package ngtHub;

public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 5, b = 0, c = 0;
		String s = new String(" ");
		char ch[] = s.toCharArray();
		try {
			System.out.print("hello");
			System.out.println(ch[4]);
			System.out.print(s.charAt(0));
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println(" Math problem occur");
//			System.out.println(e.getLocalizedMessage());
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			System.out.println(e.getCause());
//			System.out.println(e.getStackTrace());
			System.out.println(e.initCause(e));
			e.printStackTrace();
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.print(" String problem occur");
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.print(" Array Index Problem occurs");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.print(" Problem occurs");
		} finally {
			System.out.print(" Stopped");
		}
	}
}
