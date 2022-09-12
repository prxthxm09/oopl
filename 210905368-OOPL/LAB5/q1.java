import java.util.*;
class Student
{
	int reg_no;
	String f_name;
	GregorianCalendar cal = new GregorianCalendar();
	short semester;
	float gpa,cgpa;
	SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMM-yyyy");
	String dateFormatted = formattedDate.format( cal.getTime());
	Student()
	{
		reg_no=1450;
		f_name="TDL";
		cal.set(cal.DATE,25);
		cal.set(cal.MONTH,9);
		cal.set(cal.YEAR,2003);
		semester=3;
		gpa=9.4f;
		cgpa=8.7f;
	}
	Student(int num,String name,int p,int q,int r,short sem,float gpaa,float cgpaa)
	{
		reg_no=num;
		f_name=name;
		cal.set(cal.DATE,p);
		cal.set(cal.MONTH,q);
		cal.set(cal.YEAR,r);
		semester=sem;
		gpa=gpaa;
		cgpa=cgpaa;
	}
	void Display()
	{
		System.out.println("Name : "+f_name+" Reg Num : "+reg_no+" DOJ : "+dateFormatted+"Semester : "+semester+"GPA : "+gpa+"CGPA : "+cgpa);
	}
}
class q1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextShort(),sc.nextFloat(),sc.nextFloat());
		s1.Display();
		s2.Display();
	}
}