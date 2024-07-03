package OOPConceptPart2;

public class HSBCbank implements USBank,BrazilBank{
	
	public void credit()
	{
		System.out.println("hsbc...credit");
	}
	public void debit()
	{
		System.out.println("hsbc...debit");
	}
	public void transfermoney()
	{
		System.out.println("hsbc...transfermoney");
		
	}

	public void eduloan()
	{
	System.out.println("hsbc...eduloan");
	}
	
	public void carloan()
	{
	System.out.println("hsbc...carloan");
	}
	
	 public void Mutualfund()
	 {
		 System.out.println("Brazil....mf");
	 }
}
