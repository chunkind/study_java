package step07;

class WhiteBoard{
	double price;
	int size;
	char color;
	
	Education kosta;

	public void setEdu(Education k){
		kosta = k;
	}
	public Education getEdu(){
		return kosta;
	}

	public void setInfo(double p, int s, char c){
		price = p;
		size = s;
		color = c;
	}
	public void getInfo(){
		System.out.println("Board Information : " + price + "\t" + size + "\t" + color);

	}
}