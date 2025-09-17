public class OsnovneOperacije {
    public static void main(String[] args) {
    	
    	int a = 24;
    	int b = 12;
    	
    	char operation = '+'; 
//    	treba da se promeni vrednost iznad da bi se dobijo drugaciji rezultat
    	
    	if (operation == '+') {
    		int rezultat = a + b;
    		System.out.println(a + " + " + b + " = " + rezultat);
    	}
    	
    	if (operation == '-') {
    		if (a > b) {
    			int rezultat = a - b;
    			System.out.println(a + " - " + b + " = " + rezultat);
            } else {
                int rezultat = b - a;
                System.out.println(b + " - " + a + " = " + rezultat);
            }
        }
        
        if (operation == '*') {
            int rezultat = a * b;
            System.out.println(a + " * " + b + " = " + rezultat);
        }
        
        if (operation == '/') {
            int rezultat = a / b;
            System.out.println(a + " / " + b + " = " + rezultat);
        }
    }
}