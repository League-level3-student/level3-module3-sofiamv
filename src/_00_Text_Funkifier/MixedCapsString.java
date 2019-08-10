package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String b = "";
		for(int i = 0; i < s.length(); i++) {
			if(i%2==1) {
			char a = s.toUpperCase().charAt(i);
			b+=a;
			}else{
			char c = s.toLowerCase().charAt(i);
			b+=c;
			}
			//System.out.println(b);
			}
		return b;
	}

}
