package stringDemo;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="selenium-RC-IDE-WebDriver       ";
		String trims=name.trim();
		System.out.println(trims);
		System.out.println(name.charAt(0));
		
	String[] str=	name.split("-");
		for(int i=0;i<str.length;i++){
			System.out.println("Value for "+i +" is "+ str[i]);
			if(str[i].equalsIgnoreCase("RC")){
				System.out.println("Test Passed");
				break;
			}
		}

	}

}
