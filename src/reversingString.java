public class reversingString {
	public static void main(String[] args) {
		System.out.println(reverse("hello"));
	}
	public static String reverse(String a){
		if(a.length() == 1){
			return a;
		}	
		else{
			
			return reverse(a.substring(1))+ a.charAt(0);
			}
		}
}
