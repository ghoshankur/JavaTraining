package JavaTrainingPackage;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to display array concepts
		int i[]=new int[4];
		i[0]=10;
		i[1]=77;
		i[2]=44;
		i[3]=55;
		
		for(int j=0;j<i.length;j++)
		{
			System.out.println("position "+j+" "+i[j]);
		}
		//If you want to store values of different data type in a single array you use a special type of array called Object array
		
		Object o[]=new Object[5];
		o[0]="Ankur";
		o[1]=5;
		o[2]=98.5;
		o[3]="London";
		o[4]='A';
		for(int j=0;j<o.length;j++)
		{
			System.out.println("position "+j+" "+o[j]);
		}
		 int x[][]= new int[2][3];
		 System.out.println(x.length);
		 System.out.println(x[1].length);
		 
		 x[0][0]=55;
		 x[0][1]=44;
		 x[0][2]=77;
		 x[1][0]=11;
		 x[1][1]=22;
		 
		 for (int i1=0;i1<x.length;i1++)
		 {
			 for(int k=0;k<x[i1].length;k++)
			 {
				 System.out.println("position "+i1+" "+k+" "+x[i1][k]);
			 }
		 }

	}

}
