import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class helloworld {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

			  Socket socket =new Socket("10.1.91.132",8899);
			  //2����ȡ���������������˷�����Ϣ
			  OutputStream os = socket.getOutputStream();//�ֽ������
			  PrintWriter pw =new PrintWriter(os);//���������װ�ɴ�ӡ��
			  pw.println("�û�����admin�����룺123");
			  pw.flush();
			  socket.shutdownOutput();
			  //3����ȡ������������ȡ�������˵���Ӧ��Ϣ
			  InputStream is = socket.getInputStream();
			  BufferedReader br = new BufferedReader(new InputStreamReader(is));
			  String info = null;
			  while((info=br.readLine())!=null){
			  System.out.println("���ǿͻ��ˣ�������˵��"+info);
			 
		}
	}

}
