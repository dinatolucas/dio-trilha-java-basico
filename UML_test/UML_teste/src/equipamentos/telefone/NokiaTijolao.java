package equipamentos.telefone;

public class NokiaTijolao implements Telephone{
	
		public void call(String phoneNumber){
			System.out.println("CALLING NOKIA: " + phoneNumber);
		}
		public void answer(){
			System.out.println("ANSWERING NOKIA");
		}
		public void startVoicemail(){
			System.out.println("CALLING VOICE MAIL NOKIA");
		}

}
