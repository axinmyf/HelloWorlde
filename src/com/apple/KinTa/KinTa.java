public class KinTa{
    public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
		for(int i=1;i<8;i++){
		    for(int j=0;j<8-i;j++){
		        System.out.print(" ");
		    }
		    for(int k=0;k<2*i-1;k++){
		        System.out.print("*");
		    }
		    System.out.print("\n");
	     }
	}
}