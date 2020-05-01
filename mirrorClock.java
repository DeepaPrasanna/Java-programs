/* Write a pgm to give a mirror output of a analog clock ⏰

Eg.. 
Input.. 3 hr 20 min
Output  8:40*/
import java.util.*; public class MirrorClock
{
public static void main(String args[])
{
int mm,hh;
Mirror m = new Mirror();
Scanner scn = new Scanner(System.in);
System.out.println("Enter the HH:");
hh = scn.nextInt();
System.out.println("Enter the minute:");
mm = scn.nextInt();
m.mirror1(hh,mm);
}
}
class Mirror
{
int xh,xm;
void mirror1(int hh, int mm)
{
xm = 60 - mm;
if(hh<12)
{
if(mm==0)
{
xh = 12-hh;
}
else
{
xh=11-hh;
}
}
else
{
if(mm == 0)
{
xh=12;
}
else
{
xh=11;
}
}
System.out.println("mirror of"+hh+"::"+mm+"="+xh+":"+xm);
}
}
