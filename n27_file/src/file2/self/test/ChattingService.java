package file2.self.test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 채팅 로직을 작성...
 * 입력받은 내용의 TextArea의 내용을 특정한 디렉토리의 파일로 출력하는 로직 작성
 * 저장버튼을 클릭하면 팝업창(FileDialog창)이 뜨고 내용을 파일로 저장할수 있다
 * ::
 * GUI + Event Handler + FileStream 연결
 */
public class ChattingService {
	//1. gui구성
	Frame f;
	Panel p;
	TextField tf;
	TextArea ta;
	Button save;
	String nickName;
	
	ChattingService(String nickName){ //객체 생성시 닉네임을 넣겠다   패널에 필드하고 
		this.nickName = nickName;
		f = new Frame("Chatting Room....");
		tf = new TextField(30);
		ta = new TextArea();
		save = new Button("저장");
		p = new Panel();
		
		
	}
	public void lunchFrame(){
		f.setSize(300, 200);
		
		p.add(tf);
		p.add(save);
		f.add(ta,"Center");
		f.add(p,"South");
		
		f.setResizable(false);
		ta.setEditable(false);
		ta.setText("["+nickName+"] 님이 입장하셨습니다.");
		f.setVisible(true);
		tf.requestFocus();
		
		p.setBackground(Color.BLUE);
		ta.setBackground(Color.green);

		//2. 리스너 부착
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
					f.dispose();
					System.exit(0);
			}
			
		});
		tf.addActionListener(new EventHandler(this));
		save.addActionListener(new ButtonHandler(this));
	}
	
	public static void main(String[] args) {
		ChattingService service = new ChattingService("리길리");
				service.lunchFrame();
	}
}

