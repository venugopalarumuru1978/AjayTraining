package mapPack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class PolicyMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Policy ply = new Policy();
		while(true)
		{
			System.out.println("1. Add Policy\n2. View All Policies\n3. Search Policy\n4. Exit");
			System.out.println("Pick ur Choice : ");
			int ch = Integer.parseInt(br.readLine());
			
			switch(ch)
			{
			case 1:
				System.out.println("Policy ID");
				int pid = Integer.parseInt(br.readLine());
				System.out.println("Policy Name ");
				String pname = br.readLine();
				ply.addPolicyDetails(pid, pname);
				System.out.println("Policy Added..");
				break;
			case 2:
				ply.ViewAllPolicies();
				break;
			case 3:
				System.out.println("Enter Policy Type(Health/Two Wheelar) : ");
				String ptype = br.readLine();
				
				List<Integer>  pidList = ply.searchBasedOnPolicyType(ptype);
				
				if(pidList.isEmpty())
					System.out.println("No Policies Exist");
				else
					System.out.println(pidList);
				break;
			case 4:
				System.out.println("Thanks for using App");
				System.exit(0);
			}
		}
	}
}
