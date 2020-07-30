package com.wages;


import java.time.LocalTime;


public class BabySitterWageCal {
	
	
	public int calculateWage() {
		int amountToBePaid;
		if(LocalTime.now()
         .isAfter( LocalTime.parse( "17:00" ) ) || LocalTime.now()
         .isBefore( LocalTime.parse( "04:00" ) ) ) {
			if(LocalTime.now()
			         .isAfter( LocalTime.parse( "17:00" ) ) && LocalTime.now()
			         .isBefore( LocalTime.parse( "20:00" ) )) {
				
				amountToBePaid=(3-(20-LocalTime.now().getHour()))*12;
				return amountToBePaid;
			}
			else if(LocalTime.now()
			         .isAfter( LocalTime.parse( "20:00" ) ) && LocalTime.now()
			         .isBefore( LocalTime.parse( "23:59" ) )) {
				amountToBePaid=3*12;
				amountToBePaid+=(4-(24-LocalTime.now().getHour()))*8;
				return amountToBePaid;
			}
			else {
				amountToBePaid=(4*8)+(3*12);
				amountToBePaid+=(4-(4-LocalTime.now().getHour()))*16;
				return amountToBePaid;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		BabySitterWageCal babySitting=new BabySitterWageCal();
		int amountToBePaid=babySitting.calculateWage();
		if(amountToBePaid>0) {
			System.out.println("Wage To be Paid =====>"+amountToBePaid);
		}
		else {
			System.out.println("Baby Sitter not yet started working");
		}
	}

}
