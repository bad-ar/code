import java.util.Scanner;
class cp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		Scanner input = new Scanner(System.in);
		t = input.nextInt();
		for(int i = 0 ; i < t ; i++){
		    int n;
		    n = input.nextInt();
		    if(n%4==0){
		        System.out.println("Bob");
		    }
		    else{
		        System.out.println("Alice");
		    }
		}
        input.close();

	}
}
