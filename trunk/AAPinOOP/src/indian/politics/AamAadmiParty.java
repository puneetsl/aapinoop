package indian.politics;
//Version 0.1
//Author: Puneet Singh
public class AamAadmiParty extends Congress implements Socialism, Communism, Populism, Mobocracy{

	//Created Kejriwal using singleton design pattern, can't create so honest man again
	public Kejriwal kej = Kejriwal.getInstance();
	public void getDonations(int money){
		this.putItInWebsite(money);
	}
	public void putItInWebsite(int money) {
		System.out.println(money);
	}
	
	private boolean doKhulaseAndRunAway(boolean isFormedGovernmentWithCongress)
	{
		if(!isFormedGovernmentWithCongress)
		{
			isFormedGovernmentWithCongress = this.madePeopleFoolEnough();
			return doKhulaseAndRunAway(isFormedGovernmentWithCongress);
		}
		else
		{
			return true;
		}
	}
	public void before2014()
	{
		kej.honesty();
	}
	private void after2014()
	{
		indian.politics.Congress i = null;//null as in the number if seats expected in 2014
		mergeWithCongress(i);
	}
	private void mergeWithCongress(Congress c) {
		System.out.println("We are againt communal forces!!");

	}
	private boolean madePeopleFoolEnough() {
		return false;
	}
}
