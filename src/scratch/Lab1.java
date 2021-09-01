package scratch;

import java.util.Random;

public class Lab1 {
	public static int aaaCount;
	public static void main(String[] args)
	{
		//loop through and print 1000 kmers
		for (int i = 0; i < 1000; i++) 
		{
			String k = makeKmer();
			System.out.println(k);
		}
		System.out.println("AAA Found " + aaaCount + " times.");
		
		aaaCount = 0;
		//loop through and print 1000 ODD kmers
		for (int i = 0; i < 1000; i++) 
		{
			String k = makeOddKmer();
			System.out.println(k);
		}
		System.out.println("AAA Found " + aaaCount + " times.");
	}
	public static String makeKmer() 
	{
		//this is a uniform 25% per base function
		Random random = new Random();
		String kmer = "";
		for (int i = 0; i < 3; i++) 
		{
			int num = random.nextInt(4);
			if(num==0) 
			{
				kmer += "A";
			} else if (num==1) 
			{
				kmer += "C";
			} else if (num==2) 
			{
				kmer += "T";
			} else if (num==3) 
			{
				kmer += "G";
			}
				
		}
		if(kmer.equals("AAA"))
		{
			aaaCount += 1;
			//you would expect to see AAA 15-16 times out of 1,000. Mine is close / sometimes dead on.
		}
		return kmer;
	}
	
	public static String makeOddKmer() 
	{
		//this is a diff per base function
		Random random = new Random();
		String kmer = "";
		for (int i = 0; i < 3; i++) 
		{
			float f = random.nextFloat();
			if(f>=0 && f <=.11) 
			{
				kmer += "A";
			} else if (f>=.12 && f <=.49) 
			{
				kmer += "C";
			} else if (f>=.51 && f <=.88) 
			{
				kmer += "T";
			} else if (f>=.89) 
			{
				kmer += "G";
			}
				
		}
		if(kmer.equals("AAA"))
		{
			aaaCount += 1;
			//you would expect to see AAA 1-2 times out of 1,000 with these ratios. Mine is close / sometimes dead on.
		}
		return kmer;
	}

}
