package statik.variable.test;

public class UserStaticVariable {

	public void use(){
		String result = StaticRepository.getMap().get(1);
		System.out.println("1: " + result);
		result = StaticRepository.getMap().get("AIG");
		System.out.println("AIG: " + result);
	}
}
