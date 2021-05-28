package step10;

import java.io.FileNotFoundException;

import step10.io.FileReading;

/**
 * @Auth : ck
 * @Date : Mar 2, 2019 Compile 계열의 Exception을 살펴보자
 * 컴파일러가 인식하는 예외이기 때문에 에러가 발생하면
 * 컴파일시 에러가 발생한다 IOException이 주를 이룬다... 
 * 파일에 내용을 읽거나 쓸때 무조건 발생한다.
 */
public class TestApp {
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "c:\\Kosta\\test\\hoho.txt";
		FileReading fr = new FileReading();
		System.out.println("readFile을 호출했습니다...");
		fr.readFile(fileName);

	}
}
