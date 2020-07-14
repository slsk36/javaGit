package com.mh.file;
//table과 1:1매핑

public class FileBoardDTO {
	private String title;
	private String content;
	private String filename;
	private int idx;
	
	public FileBoardDTO() {} //alt+shift+s+s tostring 메서드 호출
	
	@Override
	public String toString() {
		return "FileBoardDTO [title=" + title + ", content=" + content + ", filename=" + filename + ", idx=" + idx
				+ "]";
	}

	public FileBoardDTO(String title, String content, String filename, int idx) {
		super();
		this.title = title;
		this.content = content;
		this.filename = filename;
		this.idx = idx;
	}
	
	//getter setter 단축키, 생성자 단축키:  alt+shift+s->r,o
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
}
