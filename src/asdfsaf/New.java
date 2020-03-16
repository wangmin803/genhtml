package asdfsaf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class New {

	private String id;
	private String title;
	private String addtime;
	private String content;
	private String seotitle;
	private String seodescription;
	private String seokeywords;

	        
	private String source;
	private String author;
	private String channelId;
	private String channelname;
	private String channeltitle;
	private String categoryId;
	private String categoryTitle;
	private String addtimestring;
	private String imgurl;
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getAddtimestring() {
		return addtimestring;
	}
	public void setAddtimestring(String addtimestring) {
		this.addtimestring = addtimestring;
	}
	public String getCategoryTitle() {
		return categoryTitle;
	}
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getChannelname() {
		return channelname;
	}
	public void setChannelname(String channelname) {
		this.channelname = channelname;
	}
	public String getChanneltitle() {
		return channeltitle;
	}
	public void setChanneltitle(String channeltitle) {
		this.channeltitle = channeltitle;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getAddtime() {
		if(null!=addtime&&!addtime.equals("")){
			if(addtime.length()>18){
				addtime=addtime.substring(0, 19);
			}
			
		}
		
		return addtime;
	}
	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}
	public String getSeotitle() {
		return seotitle;
	}
	public void setSeotitle(String seotitle) {
		this.seotitle = seotitle;
	}
	public String getSeodescription() {
		return seodescription;
	}
	public void setSeodescription(String seodescription) {
		this.seodescription = seodescription;
	}
	public String getSeokeywords() {
		return seokeywords;
	}
	public void setSeokeywords(String seokeywords) {
		this.seokeywords = seokeywords;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
