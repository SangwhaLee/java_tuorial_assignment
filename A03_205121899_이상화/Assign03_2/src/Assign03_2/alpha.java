package Assign03_2;

public class alpha {
	final int length = 26;
	int alphabet_uppercase[]= new int[length];
	int alphabet_lowercase[]= new int[length];
	public void main(String[] args) {
		int A = 65;
		int a = 97;
		int i;
		for(i=0;i<26;i++) {
			alphabet_uppercase[i] = A++;
			alphabet_lowercase[i] = a++;
		}
	}
	
	public boolean which_bigger(char alpha1, char alpha2) {
		int dif = (int)alpha1 - (int)alpha2;
		if(dif>0) return true;
		else return false;
	}
	
	public int what_diff(char alpha1, char alpha2) {
		return (int)alpha1-(int)alpha2;
	}
}
