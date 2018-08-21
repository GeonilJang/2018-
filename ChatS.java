import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatS implements Runnable{
	Socket sk;
	
	public ChatS() {
		System.out.println("Server Start");
		String msg = "";
		
		try {
			ServerSocket ssk = new ServerSocket(6060);
			sk = ssk.accept();
			System.out.println("Connected with Client");
			
			//키보드로 부터 값 입력받을 스트림 생성.
			InputStreamReader inR = new InputStreamReader(System.in);
			BufferedReader buR = new BufferedReader(inR);
			
			//클라이언트로 보낼 스트림 생성.
			PrintWriter pout = new PrintWriter(sk.getOutputStream(), true);//플러시 추가
			
			Thread thr = new Thread(this);
			thr.start();
			
			while((msg = buR.readLine()) != null) {
				pout.println(msg);
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
			
			String clientMsg = "";
			while(true) {
				clientMsg = buR.readLine();
				System.out.println("Client > "+clientMsg);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		new ChatS();
	}
}
