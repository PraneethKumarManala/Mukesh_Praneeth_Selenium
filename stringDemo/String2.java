package stringDemo;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="welcome to selenium webdriver world";
		String name2 ="welcome to selenium";
		String name3 ="welcome to selenium webdriver WORLD";
		boolean status=name.equals(name2);
        System.out.println(status);
        boolean status2 =name.equalsIgnoreCase(name3);
        System.out.println(status2);
        boolean status3 = name.contains(name2);
        System.out.println(status3);
	}

}
