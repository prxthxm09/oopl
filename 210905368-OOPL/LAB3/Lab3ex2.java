class Time
{
int hours;
int mins;
int secs;
void setTime(int h,int m,int s)
{
hours=h;
mins=m;
secs=s;
}
void display()
{
System.out.println("The time is "+hours+":"+mins+":"+secs);
}
Time addTime(Time t1, Time t2)
{
Time result = new Time();
result.hours = t1.hours + t2.hours;
result.mins = t1.mins + t2.mins;
result.secs = t1.secs + t2.secs;
if(result.secs>59)
{
result.mins += result.secs/60;
result.secs = result.secs%60;
}
if(result.mins>59)
{
result.hours += result.mins/60;
result.mins = result.mins%60;
}
if(result.hours>23)
result.hours=result.hours%24;
return result;
}

Time subTime(Time t1, Time t2)
{
Time result = new Time();
if(t1.secs<t2.secs)
{
t1.mins -= 1;
t1.secs += 60;
}
result.secs = t1.secs - t2.secs;
if(t1.mins<t2.mins)
{
t1.hours -= 1;
t1.mins += 60;
}
result.mins = t1.mins - t2.mins;
if(t1.hours<t2.hours)
{
t1.hours +=24;
}
result.hours = t1.hours - t2.hours;
return result;
}

int compareTime(Time t1,Time t2)
{
int flag = 0;
for(;;)
{
if(t1.secs!=t2.secs)
{
flag=1;
//System.out.println("seconds are not same");
break;
}
if(t1.mins!=t2.mins)
{
flag=1;
break;
}
if(t1.hours!=t2.hours)
{
flag=1;
break;
}}
return flag;
}} 

class Lab3ex2
{
public static void main(String[] args)
{
Time time1 = new Time();
Time time2 = new Time();
Time result1 = new Time();
Time result2 = new Time();
time1.setTime(16,55,59);
time2.setTime(23,16,15);
time1.display();
time2.display();
result1=result1.addTime(time1,time2);
System.out.print("The time after addition is: ");
result1.display();
result2=result2.subTime(time1,time2);
System.out.print("The time after subtraction is: ");
result2.display();
System.out.println("The result of comparison is: ");
int compare = result2.compareTime(time1,time2);
if(compare == 0)
System.out.println("Times are same");
else
System.out.println("Times are different");
}
}