package edu.hzu.javaweb.labs.se1414080902119;

public class BookType {
	public String name; // 图书类别名字
	private Boolean isHasBook; // 该类别下是否有图书标志

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsHasBook() {
		return isHasBook;
	}

	public void setIsHasBook(Boolean isHasBook) {
		this.isHasBook = isHasBook;
	}

	public BookType(String name, Boolean isHasBook) {
		super();
		this.name = name;
		this.isHasBook = isHasBook;
	}

	public BookType() {
		super();
	}
}
