package chatting.server.gui;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveButtonHandler implements ActionListener {
	ServerGUI sg;
	SaveButtonHandler(ServerGUI sg) {
		this.sg=sg;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		FileDialog fd = new FileDialog(sg.f, "파일저장", FileDialog.SAVE);
		fd.setVisible(true);
		
		String temp = sg.ta.getText();
		String[] temp1 = temp.split("\n");
		String fileName = fd.getDirectory()+fd.getFile();// fd에서 디렉토리와 파일명을 얻어온다.
		
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(fileName));
			for(int i = 0; i < temp1.length; i++) {
				pw.println(temp1[i]);
			}
			
//			pw.println();
			pw.close();
		} catch (IOException e1) {
			sg.ta.append(e1.getMessage() + "\n");
		}
				
		/*
		 * File Stream 사용부분
		 * 출력용 스트림 생성.
		 * 그곳으로 출력
		 */

	}
}
