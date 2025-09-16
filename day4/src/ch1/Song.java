package ch1;

public class Song {

	String title;
	String artist;
	public Song(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
	
	
	void play() {
		System.out.println("노래를 재생합니다.");
	}
	
}
