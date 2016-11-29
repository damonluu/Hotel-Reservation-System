import java.util.ArrayList;

public class AccountManager 
{
	private ArrayList<Account> acc;
	
	public AccountManager() 
	{
		acc = new ArrayList<Account>();
	}
	public Account getAccount(String loginID)
	{
		for(Account a : acc)
		{
			if(a.getLoginID().equals(loginID))
				return a;
		}
		return null;
	}

}
