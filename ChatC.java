import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatC implements Runnable{
	
	String ip = "127.0.0.1";
	int port =6060;
	Socket sk;
	
	
	public ChatC() {
		
		try {
			String sendMsg ="";
			sk = new Socket(ip,port);
			System.out.println("Connected with CharServer...");
			
			//키보드 입력
			InputStreamReader inR = new InputStreamReader(System.in);
			BufferedReader buR = new BufferedReader(inR);
			
			//키보드 입력값 전송 출력.
			PrintWriter pout = new PrintWriter(sk.getOutputStream(), true);
			
			Thread thr = new Thread(this);
			thr.start();
			
			while((sendMsg = buR.readLine()) != null) {
				pout.println(sendMsg);
			}
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	
	
	public void run() {
		InputStream ins;
		
		try {
			ins = sk.getInputStream();
			BufferedReader buR = new BufferedReader(new InputStreamReader(ins));
			
			String serverMsg ="";
			while(true) {
				serverMsg = buR.readLine();
				System.out.println("Server > "+serverMsg);
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	
	
	
	public static void main(String[] args) {
		new ChatC();
	}
}
