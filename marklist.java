package marklist;
import java.util.Scanner;
public class marklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a,b,c,d;
int e,f,g,h,i,j,k,l,m,n,o,p;
Scanner in=new Scanner(System.in);
System.out.println("Enter names");
a=in.next();
System.out.println("Name1");
b=in.next();
System.out.println("Name2");
c=in.next();
System.out.println("Name3");
d=in.next();
System.out.println("Name4");
e=in.nextInt();
System.out.println("Mark1");
f=in.nextInt();
System.out.println("Mark2");
g=in.nextInt();
System.out.println("Mark3");
h=in.nextInt();
System.out.println("Mark4");
i=in.nextInt();
System.out.println("Mark5");
j=in.nextInt();
System.out.println("Mark6");
k=in.nextInt();
System.out.println("Mark7");
l=in.nextInt();
System.out.println("Mark8");
m=in.nextInt();
System.out.println("Mark9");
n=in.nextInt();
System.out.println("Mark10");
o=in.nextInt();
System.out.println("Mark11");
p=in.nextInt();
System.out.println("Mark12");
System.out.println("****************************************************************************************************");
System.out.println("                            STUDENT MARKLIST");
System.out.println("*****************************************************************************************************");
System.out.println("ROLL	NAME	MARK1	MARK2	MARK3	TOTAL	RESULT	Average	GRADE                               ");
System.out.print("101");
System.out.print("\t"+a);
System.out.print("\t"+e);
System.out.print("\t"+f);
System.out.print("\t"+g);
int total1=e+f+g;
System.out.print("\t"+total1);
System.out.print("\tP");
double average1=total1/3;
System.out.print("\t"+average1);
if(average1>=80) {System.out.println("\tA");}
else if(average1>=75) {System.out.println("\tB+");}
else if(average1>=65) {System.out.println("\tB");}
else if(average1>=55) {System.out.println("\tC+");}
else if(average1>=50) {System.out.println("\tC");}
else if(average1>=40) {System.out.println("\tD");}
else {System.out.println("\tF");}
System.out.print("102");
System.out.print("\t"+b);
System.out.print("\t"+h);
System.out.print("\t"+i);
System.out.print("\t"+j);
int total2=h+i+j;
System.out.print("\t"+total2);
System.out.print("\tP");
double average2=total2/3;
System.out.print("\t"+average2);
if(average2>=80) {System.out.println("\tA");}
else if(average2>=75) {System.out.println("\tB+");}
else if(average2>=65) {System.out.println("\tB");}
else if(average2>=55) {System.out.println("\tC+");}
else if(average2>=50) {System.out.println("\tC");}
else if(average2>=40) {System.out.println("\tD");}
else {System.out.println("\tF");}
System.out.print("103");
System.out.print("\t"+c);
System.out.print("\t"+k);
System.out.print("\t"+l);
System.out.print("\t"+m);
int total3=k+l+m;
System.out.print("\t"+total3);
System.out.print("\tP");
double average3=total3/3;
System.out.print("\t"+average3);
if(average3>=80) {System.out.println("\tA");}
else if(average3>=75) {System.out.println("\tB+");}
else if(average3>=65) {System.out.println("\tB");}
else if(average3>=55) {System.out.println("\tC+");}
else if(average3>=50) {System.out.println("\tC");}
else if(average3>=40) {System.out.println("\tD");}
else {System.out.println("\tF");}
System.out.print("104");
System.out.print("\t"+d);
System.out.print("\t"+n);
System.out.print("\t"+o);
System.out.print("\t"+p);
int total4=n+o+p;
System.out.print("\t"+total4);
System.out.print("\tP");
double average4=total4/3;
System.out.print("\t"+average4);
if(average4>=80) {System.out.println("\tA");}
else if(average4>=75) {System.out.println("\tB+");}
else if(average4>=65) {System.out.println("\tB");}
else if(average4>=55) {System.out.println("\tC+");}
else if(average4>=50) {System.out.println("\tC");}
else if(average4>=40) {System.out.println("\tD");}
else {System.out.println("\tF");}




	}

}
