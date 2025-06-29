package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {
	
	private int discountPercent = 10;

	@Override
	public int discount(Member member, int itemPrice) {
		// TODO Auto-generated method stub
		
		if (member.getGrade() == Grade.VIP) {
			return itemPrice * discountPercent / 100;
		} else {
			return 0;			
		}
		
	}
	
}
