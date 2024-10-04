package 도서관리;

public class Book {
	//field
	private String title;
	private String writer;
	private int price;
	private String bNum;
	
	//constructor
	
	//method
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getbNum() {
		return bNum;
	}
	public void setbNum(String bNum) {
		this.bNum = bNum;
	}
	@Override
	public String toString() {
		return bNum + "\t" + title + "\t" + writer + "\t" + price + "원"; 
	}
	
	
}
