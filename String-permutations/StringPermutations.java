
import java.util.Scanner;

public class StringPermutations {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		String usrInput= input.nextLine();
		System.out.println("You have entered : "+ usrInput);
		System.out.println("The permutations are");
		char[] permutation = new char[usrInput.length()];
		int [] used = new int[usrInput.length()];
		for(int x: used){
			x= 0;
		}
		Permutations(0, permutation, used, usrInput );

	}
	static void Permutations(int depth, char[] permutation, int[] used, String usrInput){
		int length = usrInput.length();
		if(depth == length){
			System.out.println(permutation);
		}

		int temp;
		for (int i = 0; i < length; i++) {
			temp= used[i];
			if(temp==0){
				used[i]=1;
				permutation[depth] = usrInput.charAt(i);
				Permutations(depth+1, permutation, used, usrInput);
				used[i]=0;
			}
		}

	}

}
