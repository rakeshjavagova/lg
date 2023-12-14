package TestIng.Pom;

import Phonepay.PomResultInfo;

public class TestCustomResultProcessor implements PomCustomResultProcessor {
	
	

	
	

	
	
	
	public static void main(String[] args) {
		TestCustomResultProcessor s =new TestCustomResultProcessor();
		PomResultInfo pomResultInfo = new PomResultInfo();
		pomResultInfo.setAddress("ded");
		pomResultInfo.setCampaignName("hdwdu");
		pomResultInfo.setPimSessionId(System.currentTimeMillis());
		
		
		s.processCustomResultProcessor(pomResultInfo);
	}

	@Override
	public void processCustomResultProcessor(PomResultInfo pomResultInfo) {
		
		System.out.println("hello");
		System.out.println(pomResultInfo.toString());
	}






	

}
