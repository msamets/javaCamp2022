package dayOneAssignment;

public class Video17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj = "Bugün hava çok güzel";
		
		
		System.out.println(mesaj);
		System.out.println("Eleman sayısı: "+mesaj.length());
		System.out.println("5. eleman: "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" yaşasın!"));
		System.out.println(mesaj.startsWith("B"));//case sensitive o yüzden false döner.
		System.out.println(mesaj.endsWith("l"));
		System.out.println("****************");
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf('a'));
	}

}
