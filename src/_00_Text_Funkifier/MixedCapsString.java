package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		for(int i = s.length(); i < 0; i --) {
		String a = Character.toString(s.charAt(i));
			if(i/2 == 0) {
				a.toUpperCase();
				System.out.println(s);
			}
		}
		return "";
	}

}
