package equipamentos.browser;

public class InternetExplorer implements WebBrowser{

	@Override
	public void displayPage(String URL) {
		System.out.println("HOME IE: " + URL);
		
	}

	@Override
	public void addNewTab(String URL) {
		System.out.println("NEW TAB IE: " + URL);
		
	}

	@Override
	public void refreshPage() {
		System.out.println("REFRESHING IE");
		
	}

}
