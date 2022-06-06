package cryptographylearn;

public class CaesarcipherEncrpt {

	public static void main(String[] args) {
		for(int i=1;i<26;i++) {
			CaesarcipherEncrpt cn = new CaesarcipherEncrpt(i);
//			String rs = cn.encrypt("can you imagine life without the internet and computers in your pocket?");
			String rs = cn.encrypt("uybi gfqgykii jgziegv uigeixdiex smiizzin");
//			String rs = cn.encrypt("ha uvvu il pu aol jvumlylujl yvvt dpao fvby oha vu mvy h zbywypzl whyaf. flss svbk!");
			System.out.println(i+" - "+rs);
		}
		
	}
	private String alphabet;
	private String shiftedAlphabet;
	
	public CaesarcipherEncrpt(int key){
		alphabet = "abcdefghijklmnopqrstuvwxyz";
		shiftedAlphabet = alphabet.substring(key) +
 						   alphabet.substring(0,key);
	}
	
 	public String encrypt(String input){
 		StringBuilder sb = new StringBuilder(input);
 		for(int i = 0; i < sb.length();i++){
 			char c = sb.charAt(i);
 			int idx = alphabet.indexOf(c);
 			if(idx != -1){
 				c = shiftedAlphabet.charAt(idx);
 				sb.setCharAt(i,c);
 			}
 		}
 		return sb.toString();
 	}

}
