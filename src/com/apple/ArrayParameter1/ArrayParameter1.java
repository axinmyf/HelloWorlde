class ArrayParameter1
{
	public static void main(String args[])
	{
		int c[]={1,2,3,4,5,6,7,8,9};
		int j;
		System.out.println("Array c befor calling method:");
		for(j=0;j<c.length;j++)
			System.out.print(c[j]+" ");
                     arrayDouble(c);
                     System.out.println("Array c after calling method:");
		for(j=0;j<c.length;j++)
			System.out.print(c[j]+" ");
	}
	static void arrayDouble(int d[])
	{
		for(int i=0;i<d.length;i++)
			d[i]=d[i]*2;
        } 		
}