package Phonepay;

public class PomResultInfo {
	private String campaignName;
    private int jobId;
    private long pimSessionId;
    private String contactId;
    private String contactGroupName;
    private String address;
    private String result;
    
    
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public long getPimSessionId() {
		return pimSessionId;
	}
	public void setPimSessionId(long pimSessionId) {
		this.pimSessionId = pimSessionId;
	}
	public String getContactId() {
		return contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}
	public String getContactGroupName() {
		return contactGroupName;
	}
	public void setContactGroupName(String contactGroupName) {
		this.contactGroupName = contactGroupName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
	
	public PomResultInfo() {};
	
	public PomResultInfo(String campaignName, int jobId, long pimSessionId, String contactId, String contactGroupName,
			String address, String result) {
		super();
		this.campaignName = campaignName;
		this.jobId = jobId;
		this.pimSessionId = pimSessionId;
		this.contactId = contactId;
		this.contactGroupName = contactGroupName;
		this.address = address;
		this.result = result;
	}
	
	
	
	
	@Override
	public String toString() {
		return "PomResultInfo [campaignName=" + campaignName + ", jobId=" + jobId + ", pimSessionId=" + pimSessionId
				+ ", contactId=" + contactId + ", contactGroupName=" + contactGroupName + ", address=" + address
				+ ", result=" + result + "]";
	}
    
    
	
    
}
