package CricketPack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import OperationsPack.Cricket;
import OperationsPack.CricketOperations;

public class CrkApp {

	public static void main(String[] args) throws Exception {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		Cricket crk = null;
		CricketOperations  crkOp = new CricketOperations();
		
		while(true)
		{
			System.out.println("1. Add New Cricketer\n2. View All Cricketers\n3. Search Cricketer\n4. Update Cricketer Name\n5. Delete Cricketer\n6. Exit");
			System.out.println("Pick ur Choice ");
			int ch = Integer.parseInt(br.readLine());
			
			switch(ch)
			{
			case 1:
				crk = new Cricket();
				System.out.println("Cric Number");
				crk.setCrno(Integer.parseInt(br.readLine()));
				System.out.println("Cric Name ");
				crk.setCrname(br.readLine());
				System.out.println("Cric Runs");
				crk.setRuns(Integer.parseInt(br.readLine()));
				crkOp.AddNewCricketer(crk);
				System.out.println("Added...");
				break;
			
			case 2:
				
				List<Cricket>  lstCrk = crkOp.ViewAll();
				
				for(Cricket c : lstCrk)
				{
					System.out.println(c.getCrno() + "<===>" + c.getCrname() + "<===>" + c.getRuns());
				}				
				break;
			case 3:
				System.out.println("Enter Cric Number");
				int cno = Integer.parseInt(br.readLine());
				
				crk = crkOp.SearchCricketer(cno);
				
				if(crk!=null)
					System.out.println(crk.getCrno() + "<===>" + crk.getCrname() + "<===>" + crk.getRuns());
				else
					System.out.println("Not Found...");
				break;
			case 4:
				System.out.println("Enter Cric Number");
				cno = Integer.parseInt(br.readLine());
				
				crk = crkOp.SearchCricketer(cno);
				
				if(crk!=null)
				{
					System.out.println("Present name of Cricketer : " + crk.getCrname());
					System.out.println("Enter new name of Cricketer to Modify ");
					crk.setCrname(br.readLine());
					crkOp.UpdateCricketerName(crk);
				}
				else
					System.out.println("Cric Not Found");
				break;
			case 5:
				System.out.println("Enter Cric Number");
				cno = Integer.parseInt(br.readLine());
				
				if(crkOp.SearchCricketer(cno)!=null)
				{
					crkOp.DeleteCricketer(cno);
				}
				else
					System.out.println("Cric Not Found");
				break;
			case 6:
				System.out.println("Thanks for using App");
				System.exit(0);
			}
		}
	}
}
