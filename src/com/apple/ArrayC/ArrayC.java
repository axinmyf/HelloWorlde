class ArrayC
{
	public static void main(String args[])
	{
		int a[],b[],i,j; a=new int[3]; b=new int[5];
		System.out.println("a.length="+a.length);
		for(i=0;i<a.length;i++)
			{    a[i]=i; System.out.print(a[i]+"     ");}
		System.out.println();
		System.out.println("Before array assignment");
		System.out.println("b.length="+b.length);
		for(j=0;j<b.length;j++)
			{b[j]=j*10;System.out.print(b[j]+"     ");}
		System.out.println();
		b=a;
		System.out.println("After array assignment");
		System.out.println("b.length="+b.length);
		for(j=0;j<b.length;j++)
			{	System.out.print(b[j]+"     ");}
		System.out.println();
	}
}
