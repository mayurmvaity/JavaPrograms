package myPackage;

abstract class Person
{
	String name;
	int age;
	public abstract void setName(String name);
	public abstract String getName();
	public abstract void setAge(int age);
	public abstract int getAge();
	
}

abstract class Student extends Person
{
	int studentId;
	String stream;
	public abstract void setStdentID(int stuid);
	public abstract int getStudentID();
	public abstract void setStream(String stream);
	public abstract String getStream();
}

abstract class Employee extends Person
{
	String dept;
	int empid;
	public abstract void setEmpId(int empid);
	public abstract int getEmpId();
	public abstract void setDept(String dept);
	public abstract String getDept();
}

class Science extends Student
{
	String subject;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
		
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setAge(int age) {
		this.age = age;
		
	}
	@Override
	public int getAge() {
		return age;
	}
	@Override
	public void setStream(String stream) {
		this.stream = stream;
		
	}
	@Override
	public String getStream() {
		
		return stream;
	}
	@Override
	public void setStdentID(int stuid) {
		this.studentId = stuid;
		
	}
	@Override
	public int getStudentID() {
		return studentId;
	}
}

class Arts extends Student
{
String subject;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
		
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setAge(int age) {
		this.age = age;
		
	}
	@Override
	public int getAge() {
		return age;
	}
	@Override
	public void setStream(String stream) {
		this.stream = stream;
		
	}
	@Override
	public String getStream() {
		
		return stream;
	}
	@Override
	public void setStdentID(int stuid) {
		this.studentId = stuid;
		
	}
	@Override
	public int getStudentID() {
		return studentId;
	}
}

class Commerce extends Student
{
String subject;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public void setStream(String stream) {
		this.stream = stream;
		
	}
	@Override
	public String getStream() {
		
		return stream;
	}
	@Override
	public void setName(String name) {
		this.name = name;
		
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setAge(int age) {
		this.age = age;
		
	}
	@Override
	public int getAge() {
		return age;
	}
	
	@Override
	public void setStdentID(int stuid) {
		this.studentId = stuid;
		
	}
	@Override
	public int getStudentID() {
		return studentId;
	}
}

class Engg extends Science
{
	String tools;

	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}
	
}

class Medical extends Science
{
	String apparatus;

	public String getApparatus() {
		return apparatus;
	}

	public void setApparatus(String apparatus) {
		this.apparatus = apparatus;
	}
	
}

class Manager extends Employee
{
	
	int mgrid;
	
	
	public int getMgrid() {
		return mgrid;
	}

	public void setMgrid(int mgrid) {
		this.mgrid = mgrid;
	}

	@Override
	public void setDept(String dept) {
		this.dept = dept;
		
	}

	@Override
	public String getDept() {
		
		return dept;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
		
	}

	@Override
	public int getAge() {
		
		return age;
	}

	@Override
	public void setEmpId(int empid) {
		this.empid = empid;
	}

	@Override
	public int getEmpId() {
		return empid;
	}
	
}

class TeamLeader extends Employee
{
	int teamLeaderid;
	
	

	public int getTeamLeaderid() {
		return teamLeaderid;
	}

	public void setTeamLeaderid(int teamLeaderid) {
		this.teamLeaderid = teamLeaderid;
	}

	@Override
	public void setDept(String dept) {
		this.dept = dept;
		
	}

	@Override
	public String getDept() {
		
		return dept;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
		
	}

	@Override
	public int getAge() {
		
		return age;
	}
	
	@Override
	public void setEmpId(int empid) {
		this.empid = empid;
	}

	@Override
	public int getEmpId() {
		return empid;
	}
}

class Developer extends Employee
{
	int developerId;
	

	public int getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}

	@Override
	public void setDept(String dept) {
		this.dept = dept;
		
	}

	@Override
	public String getDept() {
		
		return dept;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
		
	}

	@Override
	public int getAge() {
		
		return age;
	}
	
	@Override
	public void setEmpId(int empid) {
		this.empid = empid;
	}

	@Override
	public int getEmpId() {
		return empid;
	}
}

class FrontEndDeveloper extends Developer
{
	int frontEndDeveloperId;

	public int getFrontEndDeveloperId() {
		return frontEndDeveloperId;
	}

	public void setFrontEndDeveloperId(int frontEndDeveloperId) {
		this.frontEndDeveloperId = frontEndDeveloperId;
	}
	
	
	
}

class BackEndDeveloper extends Developer
{
	int backEndDeveloperId;

	public int getBackEndDeveloperId() {
		return backEndDeveloperId;
	}

	public void setBackEndDeveloperId(int backEndDeveloperId) {
		this.backEndDeveloperId = backEndDeveloperId;
	}
	
	
}

public class InhrtMain
{
public static void main(String args[])
{
	Engg e1 = new Engg();
	e1.setStdentID(1);
	e1.setName("ABC");
	e1.setAge(23);
	e1.setStream("Science");
	e1.setSubject("CS");
	e1.setTools("PC");
	System.out.println("Engg==========");
	System.out.println("Student ID: "+e1.getStudentID()+"\nName: "+e1.getName()+"\nAge: "+e1.getAge()+"\nStream: "+e1.getStream()+"\nSubject: "+e1.getSubject()+"\nTools: "+e1.getTools()+"\n");
	
	Medical m1 = new Medical();
	m1.setStdentID(2);
	m1.setName("XYZ");
	m1.setAge(25);
	m1.setStream("Science");
	m1.setSubject("BPharma");
	m1.setApparatus("test-tube");
	System.out.println("Medical==========");
	System.out.println("Student ID: "+m1.getStudentID()+"\nName: "+m1.getName()+"\nAge: "+m1.getAge()+"\nStream: "+m1.getStream()+"\nSubject: "+m1.getSubject()+"\nTools: "+m1.getApparatus()+"\n");
	
	FrontEndDeveloper f1 = new FrontEndDeveloper();
	f1.setEmpId(3);
	f1.setName("LMN");
	f1.setAge(26);
	f1.setDeveloperId(11);
	f1.setFrontEndDeveloperId(2);
	f1.setDept("App developement");
	System.out.println("Front end developer==========");
	System.out.println("emp ID: "+f1.getEmpId()+"\nName: "+f1.getName()+"\nAge: "+f1.getAge()+"\nDeveloperID: "+f1.getDeveloperId()+"\nFED ID: "+f1.getFrontEndDeveloperId()+"\nDept: "+f1.getDept()+"\n");
	
	BackEndDeveloper b1 = new BackEndDeveloper();
	b1.setEmpId(4);
	b1.setName("PQR");
	b1.setAge(21);
	b1.setDeveloperId(12);
	b1.setBackEndDeveloperId(9);
	b1.setDept("Server maintainance");
	System.out.println("Back end developer==========");
	System.out.println("emp ID: "+b1.getEmpId()+"\nName: "+b1.getName()+"\nAge: "+b1.getAge()+"\nDevID: "+b1.getDeveloperId()+"\nBED ID: "+b1.getBackEndDeveloperId()+"\nDept: "+b1.getDept()+"\n");
	
	Manager mgr1 = new Manager();
	mgr1.setEmpId(5);
	mgr1.setName("PQY");
	mgr1.setAge(22);
	mgr1.setMgrid(2);
	mgr1.setDept("HR");
	System.out.println("Manager==========");
	System.out.println("emp ID: "+mgr1.getEmpId()+"\nName: "+mgr1.getName()+"\nAge: "+mgr1.getAge()+"\nMgrid: "+mgr1.getMgrid()+"\nDept: "+mgr1.getDept()+"\n");
	
	TeamLeader tl =new TeamLeader();
	tl.setEmpId(6);
	tl.setName("PSR");
	tl.setAge(30);
	tl.setDept("App development");
	tl.setTeamLeaderid(3);
	System.out.println("Team Leader==========");
	System.out.println("emp ID: "+tl.getEmpId()+"\nName: "+tl.getName()+"\nAge: "+tl.getAge()+"\nDept: "+tl.getDept()+"\nTL ID: "+tl.getTeamLeaderid()+"\n");
	
	Arts ar = new Arts();
	ar.setStdentID(7);
	ar.setName("PPP");
	ar.setAge(26);
	ar.setStream("Arts");
	ar.setSubject("History");
	System.out.println("Arts==========");
	System.out.println("Student ID: "+ar.getStudentID()+"\nName: "+ar.getName()+"\nAge: "+ar.getAge()+"\nStream: "+ar.getStream()+"\nSubject: "+ar.getSubject()+"\n");

	Commerce c1 = new Commerce();
	c1.setStdentID(8);
	c1.setName("TTT");
	c1.setAge(22);
	c1.setStream("Commerce");
	c1.setSubject("Maths");
	System.out.println("Commerce========");
	System.out.println("Student ID: "+c1.getStudentID()+"\nName: "+c1.getName()+"\nAge: "+c1.getAge()+"\nStream: "+c1.getStream()+"\nSubject: "+c1.getSubject()+"\n");

}
}