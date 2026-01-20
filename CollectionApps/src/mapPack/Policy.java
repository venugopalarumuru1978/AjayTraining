package mapPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Policy {

	Map<Integer, String>  plcy = new TreeMap<Integer, String>();
	
	public void addPolicyDetails(int pid, String pname)
	{
		plcy.put(pid, pname);
	}
	
	public void ViewAllPolicies()
	{
		System.out.println("| Policy ID | Policy Name |");
		System.out.println("| --------- | ----------- |");
		for(Map.Entry<Integer, String> mapObj : plcy.entrySet())
		{
			System.out.println("| " + mapObj.getKey() + " | " + mapObj.getValue() + " | ");
		}
	}
	
	public List<Integer> searchBasedOnPolicyType(String ptype)
	{
		List<Integer>  pids = new ArrayList<Integer>();
		
		for(Map.Entry<Integer, String> mapObj : plcy.entrySet())
		{
			if(mapObj.getValue().contains(ptype))
			{
				pids.add(mapObj.getKey());
			}
		}		
		
		return pids;
	}
	
}
