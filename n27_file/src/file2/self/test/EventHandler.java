package file2.self.test;
/*
 * TextField에 입력받은 내용을 TextArea에 append 시킨다
 * 그런 다음 TextField를 초기화 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {
		ChattingService cs;
		EventHandler(ChattingService cs){
			this.cs = cs;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
				
				String message = cs.tf.getText();
				if(message.equals("")) return;
				
				cs.ta.append("\n " + message);
				cs.tf.setText("");
	}

}
