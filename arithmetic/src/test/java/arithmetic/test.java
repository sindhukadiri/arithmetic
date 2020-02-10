package arithmetic;
import java.util.Scanner;
import op1.*;
	public class test {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	op1 o=new op1();
	Scanner s=new Scanner(System.in);
	System.out.println("enter numbers");
	int x=s.nextInt();
	int y=s.nextInt();
	System.out.println("Calculator:\n1:add\n2:sub\n3:mul\n4:div\n");

	int opt=s.nextInt();

	switch(opt)
	{
	case 1:o.add(x, y);
	      break;
	case 2:o.subtract(x, y);
	        break;
	case 3:o.multiply(x, y);
	       break;
	case 4:o.divide(x,y);
	      break;
	default:
	System.out.println("invalid option");
	}
	s.close();
	}
	}

