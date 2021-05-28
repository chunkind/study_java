package service;

import java.util.InputMismatchException;
import java.util.Scanner;

import common.Const;
import vo.Member;
import vo.Student;
import vo.Teacher;

public class ManageService {
	private Scanner sc = null;
	private Member[] memberList = null;
	private Member member = null;
	
	public ManageService() {
		memberList = new Member[0];
		start();
	}
	
	public void start() {
		while (true) {
			try {
				int result = selectedStartMenu();
				System.out.println(result + "번 매뉴가 선택 되었습니다.");
				if(1 == result) {
					registeMember(resterMemberInputValues());
				}else if(2 == result) {
					updateMember(updateMemberInputValues());
				}else if(3 == result) {
					showMemberOne();
				}else if(4 == result) {
					showMemberList();
				}else if(5 == result) {
					deleteMemberOne();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private void deleteMemberOne() {
		System.out.println("===맴버 삭제 입니다.===");
		System.out.println("삭제할 아이디를 입력하세요.");
		Member targetMember = new Member();
		boolean isTrue = false;
		
		sc = new Scanner(System.in);
		String searchId = sc.nextLine();
		for(int i=0; i<memberList.length; i++) {
			if(searchId.equals(memberList[i].getId())) {
				isTrue = true;
				memberList[i] = null;
			}
		}
		if(isTrue) {
			//삭제하는 로직...
			Member[] copyMemberList = new Member[memberList.length - 1];
			int copyListIdx = 0;
			for(int i=0; i<memberList.length; i++) {
				if(null != memberList[i]) {
					copyMemberList[copyListIdx] = memberList[i];
					copyListIdx++;
				}
			}
			memberList = copyMemberList;
		}else {
			System.out.println("삭제할 아이디가 없습니다.");
		}
	}

	public void showMemberOne() {
		System.out.println("===맴버 보기 입니다.===");
		System.out.println("찾으실 아이디를 입력하세요.");
		Member targetMember = new Member();
		boolean isTrue = false;
		
		sc = new Scanner(System.in);
		String searchId = sc.nextLine();
		for(int i=0; i<memberList.length; i++) {
			if(searchId.equals(memberList[i].getId())) {
				isTrue = true;
				targetMember = memberList[i];
			}
		}
		if(isTrue) {
			System.out.println(targetMember.toString());
		}else {
			System.out.println("찾으실 아이디가 없습니다.");
		}
	}

	public String[] resterMemberInputValues() throws Exception {
		System.out.println("===맴버 등록 입니다.===");
		String[] inputTxt = new String[Const.registMenuList.length-1];
		for(int i=0; i<Const.registMenuList.length; i++) {
			System.out.println(Const.registMenuList[i]);
			sc = new Scanner(System.in);
			inputTxt[i] = sc.nextLine();
			if(i==6) {
				break;
			}
		}
		
		if(inputTxt[0].equals("1")) {
			System.out.println(Const.registMenuList[7]);
			sc = new Scanner(System.in);
			inputTxt[7] = sc.nextLine();
		}else if(inputTxt[0].equals("2")) {
			System.out.println(Const.registMenuList[8]);
			sc = new Scanner(System.in);
			inputTxt[7] = sc.nextLine();
		}else {
			throw new Exception("1 또는 0을 입력하세요.");
		}
		
		return inputTxt;
	}
	
	public void registeMember(String[] inputTxt) throws Exception {
		int mlistSize = memberList.length;
		Member[] copyMemberList = new Member[mlistSize + 1];
		if(mlistSize>0) {
			for(int i=0; i<mlistSize; i++) {
				copyMemberList[i] = memberList[i];
			}
		}
		Member pvo = new Member();
		try {
			if("1".equals(inputTxt[0])) {
				pvo = new Student();
				((Student)pvo).setClassName(inputTxt[7]);
			}else {
				pvo = new Teacher();
				((Teacher)pvo).setSubject(inputTxt[7]);
			}
			pvo.setId(inputTxt[1]);
			pvo.setPw(inputTxt[2]);
			pvo.setName(inputTxt[4]);
			pvo.setGender(inputTxt[5]);
			pvo.setAge(Integer.parseInt(inputTxt[6]));// "32" => 32
		} catch(NumberFormatException e) {
			throw new Exception("나이는 숫자로 입력해 주세요.");
		}
		
		copyMemberList[copyMemberList.length-1] = pvo; 
		
		memberList = copyMemberList;
	}

	public String[] updateMemberInputValues() {
		System.out.println("===맴버 수정 입니다.===");
		String[] inputTxt = new String[Const.updateMenuList.length];
		for(int i=0; i<Const.updateMenuList.length; i++) {
			System.out.println(Const.updateMenuList[i]);
			sc = new Scanner(System.in);
			inputTxt[i] = sc.nextLine();
			if(i==4) {
				break;
			}
		}
		
		for(int i=0; i<memberList.length; i++) {
			if(inputTxt[0].equals(memberList[i].getId())) {
				member = memberList[i];
			}
		}
		if(null == member) {
			throw new NullPointerException();
		}
		
		if(member instanceof Student) {
			System.out.println(Const.updateMenuList[5]);
			sc = new Scanner(System.in);
			inputTxt[5] = sc.nextLine();
		}else {
			System.out.println(Const.updateMenuList[6]);
			sc = new Scanner(System.in);
			inputTxt[5] = sc.nextLine();
		}
		
		return inputTxt;
	}
	
	public void updateMember(String[] inputTxt) {
		try {
			member.setPw(inputTxt[1]);
			member.setName(inputTxt[3]);
			member.setAge(Integer.parseInt(inputTxt[4]));
			
			if(member instanceof Student) {
				((Student)member).setClassName(inputTxt[5]);
			}
			else {
				((Teacher)member).setSubject(inputTxt[5]);
			}
			
			System.out.println("===아래와 같이 변경 되었습니다===");
			System.out.println(member.toString());
		}catch (NullPointerException e) {
			System.out.println(inputTxt[0] + " 아이디가 없습니다.");
		}catch (NumberFormatException e) {
			System.out.println("나이는 숫자만 입력해 주세요.");
		}
	}
	
	public void showMemberList() {
		System.out.println("===맴버 리스트 입니다.===");
		for(int i=0; i<memberList.length; i++) {
			System.out.println(memberList[i].toString());
		}
	}

	public int selectedStartMenu() {
		int result = 0;
		try {
			System.out.println("===원하시는 메뉴를 선택해 주세요.===");
			for(int i=0; i<Const.startMenuList.length; i++) {
				System.out.println(Const.startMenuList[i]);
			}
			sc = new Scanner(System.in);
			result = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력해 주세요.");
		}
		return result;
	}
	
}
