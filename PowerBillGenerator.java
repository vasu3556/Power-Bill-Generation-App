 package importjava.util.scanner;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class PowerBillGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER USE NUMBER");
		int use = sc.nextInt();
		System.out.println("ENTER THE PRESENT READING");
		int pres = sc.nextInt();
		int units = pres - 10;
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();

		if (pres > 0) {
			System.out.println("               TSNPDCL");
			System.out.println("           ELECTRICITY BILL");
			System.out.println("              CUM NOTICE");
			System.out.println("  ____________________________________________");
			System.out.println("BILL NO;3556  DT" + date);
			System.out.println("TIME" + time);
			System.out.println("NAME A C GUARDS" + "" + "GRP:M");
			System.out.println("____________________________________________");
			System.out.println("USE NO:" + use + "" + "AREA  : 500082");
			System.out.println("NAME             :PALLE VASU GOUD");
			System.out.println("ADDR             :PUNJAGUTTA OFFICERS COLONY");
			System.out.println("H.NO             : 5-6-788/A");
			System.out.println("                  AMEERPET,HYD");
			System.out.println("CAT :2        SC :0         PH:5");
			System.out.println("LOAD:150.75                 MF:1000");
			System.out.println("____________________________________________");
			System.out.println("READING MONTH STATUS");
			System.out.println("PRES             :" + pres + "        10/23" + "01");
			System.out.println("PREV             :" + 10 + "          10/23" + "01");
			System.out.println("UNITS            :" + units + "       AVG:150");
			System.out.println("____________________________________________");
			System.out.println("ED  INTREST      : 5%");
			System.out.println("READING MONTH STATUS: 1");
			System.out.println("INT.ON.ACD       :");
			System.out.println();
			System.out.println("ADJ AMOUN        :0");
			System.out.println("LOSS/GAIN        :0");
			System.out.println("ARES UPTO 10     :");
			System.out.println("ARES FROM 11/23  :");

			if (units <= 500) {
				if (units <= 100) {
					double b = units * 2;
					double addchrges=units*0.06;
					double ed;
				 	ed=(b)/(5%100);
					double a = b+30+ed+ addchrges;//cust charges 30
					int energycharges=2;
					int custcharges=30;
					double totallamount=a; 
					
					System.out.println("BILL AMOUNT      :"+b);
					System.out.println("ADDL CHARGES     :₹"+ addchrges);
					System.out.println("ED               : ₹"+ed);
					System.out.println("ENERGY CARGES    :₹"+ energycharges);
					System.out.println("ENERGY CARGES    :₹"+ energycharges);
					System.out.println("CUST CHARGES     :₹"+custcharges);
					System.out.println("TOTAL MOUNT      :₹" + totallamount);
					System.out.println("NET AMOUNT       :₹"  +totallamount);
					System.out.println("ACD DUE          :");
					System.out.println("AGL SERVICE DUES :0");
					System.out.println("____________________________________________");
					System.out.println("For AAo ERO/PUNJAGUTTA");
					System.out.println("AE Phone : **********");
					System.out.println("AAO Phn  : ********** ");
					System.out.println("TOLL FREE 1912/18004250028");
					System.out.println("https://tsnpdcl.in");





				}
			}
			if (units > 100 && units <= 200) {
				int c = units * 3;
				double addchrges=units*0.06;
				double ed;
				ed=(c)/(5%100);
				double a=c+50+ed;//cust charges+50
				int custcharges=50;
				int energycharges=3;
				double totallamount = a;
				
				System.out.println("BILL AMOUNT      :"+c);
				System.out.println("ADDL CHARGES     :₹"+ addchrges);
				System.out.println("ED               : ₹"+ed);
				System.out.println("ENERGY CARGES    :₹"+ energycharges);
				System.out.println("CUST CHARGES     :₹"+custcharges);
				System.out.println("TOTAL MOUNT      :₹" + totallamount);
				System.out.println("NET AMOUNT       :₹"  +totallamount);
				System.out.println("ACD DUE          :0");
				System.out.println("AGL SERVICE DUES :0");
				System.out.println("____________________________________________");
				System.out.println("For AAo ERO/PUNJAGUTTA");
				System.out.println("AE Phone : **********");
				System.out.println("AAO Phn  : ********** ");
				System.out.println("TOLL FREE 1912/18004250028");
				System.out.println("https://tsnpdcl.in");

			}
		}

		if (units > 200 && units <= 400) {
			double addchrges=units*0.06;
			int d = units * 5;
			double ed;
			ed=(d)/(5%100);
			double a=d+75+ed;//cust charges+75
			int custcharges=75;
			int energycharges=5;
			double totallamount = a;
			
			System.out.println("BILL AMOUNT      :"+d);
			System.out.println("ADDL CHARGES     :₹"+ addchrges);
			System.out.println("ED               : ₹"+ed);
			System.out.println("ENERGY CARGES    :₹"+ energycharges);
			System.out.println("CUST CHARGES     :₹"+custcharges);
			System.out.println("TOTAL MOUNT      :₹" + totallamount);
			System.out.println("NET AMOUNT       :₹"  +totallamount);
			System.out.println("ACD DUE          :0");
			System.out.println("AGL SERVICE DUES :0");
			System.out.println("____________________________________________");
			System.out.println("For AAo ERO/PUNJAGUTTA");
			System.out.println("AE Phone : **********");
			System.out.println("AAO Phn  : ********** ");
			System.out.println("TOLL FREE 1912/18004250028");
			System.out.println("https://tsnpdcl.in");


		}
		if (units > 400 && units <= 500) {
			double addchrges=units*0.06;
			double e = units * 6;
			double ed;
			ed=(e)/(5%100);
			double a=e+80+ed;//cust charges+80
			int custcharges=80;
			int energycharges=6;
			double totallamount = a;

			
			System.out.println("BILL AMOUNT      :"+e);
			System.out.println("ADDL CHARGES     :₹"+ addchrges);
			System.out.println("ED               : ₹"+ed);
			System.out.println("ENERGY CARGES    :₹"+ energycharges);
			System.out.println("CUST CHARGES     :₹"+custcharges);
			System.out.println("TOTAL MOUNT      :₹" + totallamount);
			System.out.println("NET AMOUNT       :₹"  +totallamount);
			System.out.println("ACD DUE          :0");
			System.out.println("AGL SERVICE DUES :0");
			System.out.println("____________________________________________");
			System.out.println("For AAo ERO/PUNJAGUTTA");
			System.out.println("AE Phone : **********");
			System.out.println("AAO Phn  : ********** ");
			System.out.println("TOLL FREE 1912/18004250028");
			System.out.println("https://tsnpdcl.in");


		}

		else if (units > 500) {

			if (units > 500 && units <= 600) {
				double addchrges=units*0.06;
				int h = units * 8;
				double ed;
				ed=(h)/(5%100);
				double a=h+80+ed;//cust charges+80
				int custcharges=80;
				int energycharges=8;
				double totallamount = a;
				
				System.out.println("BILL AMOUNT      :"+h);
				System.out.println("ADDL CHARGES     :₹"+ addchrges);
				System.out.println("ED               : ₹"+ed);
				System.out.println("ENERGY CARGES    :₹"+ energycharges);
				System.out.println("CUST CHARGES     :₹"+custcharges);
				System.out.println("TOTAL MOUNT      :₹" + totallamount);
				System.out.println("NET AMOUNT       :₹"  +totallamount);
				System.out.println("ACD DUE          :0");
				System.out.println("AGL SERVICE DUES :0");
				System.out.println("____________________________________________");
				System.out.println("For AAo ERO/PUNJAGUTTA");
				System.out.println("AE Phone : **********");
				System.out.println("AAO Phn  : ********** ");
				System.out.println("TOLL FREE 1912/18004250028");
				System.out.println("https://tsnpdcl.in");


			}
			if (units > 700 && units <= 800) {
				double addchrges=units*0.06;
				int i = units * 9;
				double ed;
				ed=(i)/(5%100);
				double a=i+80+ed;//cust charges+80
				int custcharges=80;
				int energycharges=9;
				double totallamount = a;
				
				System.out.println(" BILL AMOUNT      :"+i);
				System.out.println("ADDL CHARGES     :₹"+ addchrges);
				System.out.println("ED               : ₹"+ed);
				System.out.println("ENERGY CARGES    :₹"+ energycharges);
				System.out.println("CUST CHARGES     :₹"+custcharges);
				System.out.println("TOTAL MOUNT      :₹" + totallamount);
				System.out.println("NET AMOUNT       :₹"  +totallamount);
				System.out.println("ACD DUE          :0");
				System.out.println("AGL SERVICE DUES :0");
				System.out.println("____________________________________________");
				System.out.println("For AAo ERO/PUNJAGUTTA");
				System.out.println("AE Phone : **********");
				System.out.println("AAO Phn  : ********** ");
				System.out.println("TOLL FREE 1912/18004250028");
				System.out.println("https://tsnpdcl.in");


			}
			if (units > 800 && units <= 900) {
				double addchrges=units*0.06;
				int j = units * 10;
				double ed;
				ed=(j)/(5%100);
				double a=j+85+ed;//cust charges+85
				int custcharges=85;
				int energycharges=10;
				double totallamount = a;
				
				System.out.println("BILL AMOUNT      :"+j);
				System.out.println("ADDL CHARGES     :₹"+ addchrges);
				System.out.println("ED               : ₹"+ed);
				System.out.println("ENERGY CARGES    :₹"+ energycharges);
				System.out.println("CUST CHARGES     :₹"+custcharges);
				System.out.println("TOTAL MOUNT      :₹" + totallamount);
				System.out.println("NET AMOUNT       :₹"  +totallamount);
				System.out.println("ACD DUE          :0");
				System.out.println("AGL SERVICE DUES :0");
				System.out.println("____________________________________________");
				System.out.println("For AAo ERO/PUNJAGUTTA");
				System.out.println("AE Phone : **********");
				System.out.println("AAO Phn  : ********** ");
				System.out.println("TOLL FREE 1912/18004250028");
				System.out.println("https://tsnpdcl.in");

			}

			if (units > 900 && units <= 1000) {
				double addchrges=units*0.06;
				int k = units * 11;
				double ed;
				ed=(k)/(5%100);
				double a=k+85+ed;//cust charges+85
				int custcharges=85;
				int energycharges=11;
				double totallamount = a;
				
				System.out.println("BILL AMOUNT      :"+k);
				System.out.println("ADDL CHARGES     :₹"+ addchrges);
				System.out.println("ED               : ₹"+ed);
				System.out.println("ENERGY CARGES    :₹"+ energycharges);
				System.out.println("CUST CHARGES     :₹"+custcharges);
				System.out.println("TOTAL MOUNT      :₹" + totallamount);
				System.out.println("NET AMOUNT       :₹"  +totallamount);
				System.out.println("ACD DUE          :0");
				System.out.println("AGL SERVICE DUES :0");
				System.out.println("____________________________________________");
				System.out.println("For AAo ERO/PUNJAGUTTA");
				System.out.println("AE Phone : **********");
				System.out.println("AAO Phn  : ********** ");
				System.out.println("TOLL FREE 1912/18004250028");
				System.out.println("https://tsnpdcl.in");


			}
			if (units > 1000) {
				double addchrges=units*0.06;
				double l = units * 12;
				double ed;
				ed=(l)/(5%100);
				double a=l+85+ed;//cust charges+85
				int custcharges=85;
				int energycharges=12;
				double totallamount = a;
				
				System.out.println("BILL AMOUNT      :"+l);
				System.out.println("ADDL CHARGES     :₹"+ addchrges);
				System.out.println("ED               : ₹"+ed);
				System.out.println("ENERGY CARGES    :₹"+ energycharges);
				System.out.println("CUST CHARGES     :₹"+custcharges);
				System.out.println("TOTAL MOUNT      :₹" + totallamount);
				System.out.println("NET AMOUNT       :₹"  +totallamount);

				System.out.println("ACD DUE          :0");
				System.out.println("AGL SERVICE DUES :0");
				System.out.println("____________________________________________");
				System.out.println("For AAo ERO/PUNJAGUTTA");
				System.out.println("AE Phone : **********");
				System.out.println("AAO Phn  : ********** ");
				System.out.println("TOLL FREE 1912/18004250028");
				System.out.println("https://tsnpdcl.in");


			}
		}
	

	}
}