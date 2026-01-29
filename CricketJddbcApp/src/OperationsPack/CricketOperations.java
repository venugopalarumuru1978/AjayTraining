package OperationsPack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ConnectionPack.DbConnection;

public class CricketOperations {

	private Connection conObj = null;
	private PreparedStatement psObj = null;
	
	public CricketOperations()
	{
		conObj = DbConnection.getConnection();
		System.out.println("Db Connected");
	}
	
	public void AddNewCricketer(Cricket cObj)
	{
		try {
			psObj = conObj.prepareStatement("INSERT INTO CRICKET(CRNO, CRNAME, RUNS) VALUES(?,?,?)");
			psObj.setInt(1, cObj.getCrno());
			psObj.setString(2, cObj.getCrname());
			psObj.setInt(3, cObj.getRuns());
			psObj.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public List<Cricket>  ViewAll()
	{
		List<Cricket>  crkList = new ArrayList<Cricket>();
		Cricket crk = null;
		try {
			psObj = conObj.prepareStatement("select * from cricket");
			ResultSet res = psObj.executeQuery();
			
			while(res.next())
			{
				crk = new Cricket();
				crk.setCrno(res.getInt("crno"));
				crk.setCrname(res.getString("crname"));
				crk.setRuns(res.getInt("runs"));
				crkList.add(crk);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return crkList;
	}
	
	
	public Cricket SearchCricketer(int crno)
	{
		Cricket crk = null;
		try {
			psObj = conObj.prepareStatement("select * from cricket where crno = ?");
			psObj.setInt(1, crno);
			ResultSet res = psObj.executeQuery();
			
			if(res.next())
			{
				crk = new Cricket();
				crk.setCrno(res.getInt("crno"));
				crk.setCrname(res.getString("crname"));
				crk.setRuns(res.getInt("runs"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return crk;		
	}
	
	public void DeleteCricketer(int crno)
	{
		try {
			psObj = conObj.prepareStatement("delete from cricket where crno = ?");
			psObj.setInt(1, crno);
			psObj.executeUpdate();
			System.out.println("Cricketer details are deleted");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}		
	}
	
	public void UpdateCricketerName(Cricket cObj)
	{
		try {
			psObj = conObj.prepareStatement("update cricket set crname=? where crno = ?");
			psObj.setString(1, cObj.getCrname());
			psObj.setInt(2, cObj.getCrno());
			psObj.executeUpdate();
			System.out.println("Cricketer details are Updated");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}		
	}
}
