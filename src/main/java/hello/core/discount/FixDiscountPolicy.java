package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
	
	private int discountFixAmount = 1000;		//1000원 할인

	@Override
	public int discount(Member member, int Itemprice) {
		// TODO Auto-generated method stub
		if (member.getGrade() == Grade.VIP) {
			return discountFixAmount;
		} else {
			return 0;
		}
		
	}

}
