package ch1;

public class InstagramPost {
	String name;
	String content;
	public InstagramPost(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}
	
	void post() {
		System.out.println(this.name + "가 올린 '" + this.content + "' 글입니다.");
	}
}
