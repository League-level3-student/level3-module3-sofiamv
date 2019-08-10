package _00_Text_Funkifier;

public class OtherString extends SpecialString{

	public OtherString(String s) {
		super(s);
	}
	
	@Override
	public String funkifyText(String s) {
		String d = "";
		for(int i = 0; i < s.length(); i++) {
			d+=s.charAt(i);
			d+=" ";
			System.out.println(d);
		}
		return d;
		
	}


}
