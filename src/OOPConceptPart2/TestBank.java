package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		HSBCbank b1=new HSBCbank();
		b1.credit();
		b1.debit();
		b1.carloan();
		b1.eduloan();
		b1.transfermoney();
		b1.Mutualfund();
		System.out.println(USBank.min_bal);
		
		USBank ub=new HSBCbank();
		ub.credit();
		ub.debit();
		ub.transfermoney();
		
		

	}

}

