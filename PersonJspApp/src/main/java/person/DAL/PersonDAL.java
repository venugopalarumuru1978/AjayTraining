package person.DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import person.connections.DbConnection;
import person.model.Person;

public class PersonDAL {

	private Connection conObj = null;
	private PreparedStatement  psObj = null;
	
	public PersonDAL()
	{
		conObj = DbConnection.getConnection();
	}
	
	public void AddPerson(Person  person)
	{
		try {
			psObj = conObj.prepareStatement("INSERT INTO PERSON(personNam, email, phone, pswd) values(?,?,?,?)");
			psObj.setString(1, person.getPname());
			psObj.setString(2, person.getEmail());
			psObj.setString(3, person.getPhone());
			psObj.setString(4, person.getPswd());
			psObj.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public List<Person>  ViewAll()
	{
		List<Person>  perList = new ArrayList<Person>();
		Person person = null;
		try {
			psObj = conObj.prepareStatement("select * from person");
			ResultSet res = psObj.executeQuery();
			
			while(res.next())
			{
				person = new Person();
				person.setPid(res.getInt("pid"));
				person.setPname(res.getString("personNam"));
				person.setPhone(res.getString("phone"));
				person.setEmail(res.getString("email"));
				person.setPswd(res.getString("pswd"));
				perList.add(person);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return perList;
	}

	public Person SearchPerson(int pid)
	{
		Person person = null;
		try {
			psObj = conObj.prepareStatement("select * from Person where pid = ?");
			psObj.setInt(1, pid);
			ResultSet res = psObj.executeQuery();
			
			if(res.next())
			{
				person = new Person();
				person.setPid(res.getInt("pid"));
				person.setPname(res.getString("personNam"));
				person.setPhone(res.getString("phone"));
				person.setEmail(res.getString("email"));
				person.setPswd(res.getString("pswd"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return person;		
	}
	
	public void DeletePerson(int pid)
	{
		try {
			psObj = conObj.prepareStatement("delete from Person where pid = ?");
			psObj.setInt(1, pid);
			psObj.executeUpdate();
			System.out.println("Cricketer details are deleted");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}		
	}
}
