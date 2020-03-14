package asdfsaf;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import freemarker.template.TemplateException;


 
class MyRadio {
	private JFrame jFrame = new JFrame("wjm");// 定义一个窗体
	private Container container = jFrame.getContentPane();// 得到窗体容器
	
	
	private JTextArea jta = new JTextArea("结果显示");

	private JPanel panel = new JPanel();// /定义一个面板
	private JPanel panel1 = new JPanel();// /定义一个面板
	private JButton developer = new JButton("生成文件");
	
 
	public MyRadio() {
		panel.setBorder(BorderFactory.createTitledBorder("生成文件"));// 定义一个面板的边框显示条
		panel.setLayout(new GridLayout(2, 6));// 定义排版，一行三列
	
		
		//http://data.zz.baidu.com/update?site=https://www.jzn360.com&token=eMF5yE1vV5fBasdfeqE
		
		panel1.setBorder(BorderFactory.createTitledBorder("生成文件"));// 定义一个面板的边框显示条
		panel1.setLayout(new GridLayout(1, 2));// 定义排版，一行三列
		panel1.add(jta);
		
	
		panel.add(this.developer);


		developer.addMouseListener(new MouseAdapter() {
			
			
			
	
			
			
			
		public void mouseClicked(MouseEvent event) {
			jta.setText("");
			String url="";
			String panduan="qqqqqqq";
			
			
			
			getn();
	
			 }});
		
		
		container.add(panel,BorderLayout.NORTH);// 加入面板
		container.add(panel1,BorderLayout.CENTER);// 加入面板
		this.jFrame.setSize(1000, 590);// 设置窗体大小
		this.jFrame.setVisible(true);// 显示窗体
		this.jFrame.addWindowListener(new WindowAdapter() { // 加入事件监听
					public void windowClosing(WindowEvent arg0) { // 复写窗口关闭的方法
						System.exit(1);// 系统退出
					}
				});
 
	}
	
	private static void getn(){

	    Connection conn = getConn();
/*	    String sql = "select * from area1";*/
/*	    String sql1 = "select * from area3";*/
	    
	    String sql1 = "select a.title ,a.id,a.content,a.add_time,a.seo_title,a.seo_keywords,a.seo_description,"
	    		+ " a.channel_id,"
	    		+ " b.name as channelname,"
	    		+ " b.title as channeltitle,"
	    		+ " a.source,"
	    		+ " a.author,"
	    		+ " a.category_id as category_id,"
	    		+ " c.title as category_title"
	    		+ " from dt_channel_article_food a,dt_site_channel b,dt_article_category c "
	    		+ "where "
	    		+ " a.channel_id = b.id and a.channel_id = c.channel_id and c.channel_id = b.id "
	    		+ " and a.category_id = c.id"
	    		+ "    order by id desc";
		Map<String,Object> root = new HashMap<String, Object>();
		
	
	    
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql1);
	        ResultSet rs = pstmt.executeQuery();
	        int col = rs.getMetaData().getColumnCount();
	        System.out.println("============================");
	        int j=1;
	        while (rs.next()) {
	        	New newnew  = new New();
	        	newnew.setTitle(rs.getString("title"));
	          	newnew.setId(rs.getString("id"));
	          	newnew.setContent(rs.getString("content"));
	           	newnew.setAddtime(rs.getString("add_time"));
	           	newnew.setSeodescription(rs.getString("seo_title"));
	           	newnew.setSeokeywords(rs.getString("seo_keywords"));
	           	newnew.setSeotitle(rs.getString("seo_description"));
	
	           	newnew.setSource(rs.getString("source"));
	           	newnew.setAuthor(rs.getString("author"));
	           	newnew.setCategoryId(rs.getString("category_id"));
	           	newnew.setCategoryTitle(rs.getString("category_title"));
	           	newnew.setChannelId(rs.getString("channel_id"));
	          	newnew.setChannelname(rs.getString("channelname"));
	          	newnew.setChanneltitle(rs.getString("channeltitle"));
	          	
	          	if(null!=newnew.getAddtime()&&!newnew.getAddtime().equals("")){
	          		String tmp = newnew.getAddtime();
	          		tmp=tmp.replace("-", "");
	          	   	newnew.setAddtimestring(tmp.substring(0, 7));
	          	}
	          		
	          		
	          	
	       
	          
	          	
	        	root.put("new",newnew);
	        	genFremarker(root);
	        	
	        	
	          
	            System.out.println(j);
	         
	           
	            j++;
	        }
	            System.out.println("============================");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	  
	
		
		
	}
	
	
	private static void genFremarker(Map map) {
		// TODO Auto-generated method stub
		try {
			FreeMarkerUtil.writeToContent(map, "", "", "", "");
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Connection getConn() {
		
	    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	    String url = "jdbc:sqlserver://14.152.95.122:1433;databasename=wang";
	    String username = "sa22";
	    String password = "sa123465";
	    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,加载对应驱动
	        conn = (Connection) DriverManager.getConnection(url, username, password);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
	}
	
	public static String Post(String PostUrl,String[] Parameters,String puanduan){  
        if(null == PostUrl || null == Parameters || Parameters.length ==0){  
            return null;  
        }  
        String result="";  
        PrintWriter out=null;  
        BufferedReader in=null;  
        try {  
            //建立URL之间的连接  
            URLConnection conn=new URL(PostUrl).openConnection();  
            //设置通用的请求属性  
            if(puanduan.equals("5")){
                conn.setRequestProperty("Host","data.zhanzhang.sm.cn"); 
            }else{
                conn.setRequestProperty("Host","data.zz.baidu.com");  
            }
        
            
            conn.setRequestProperty("User-Agent", "curl/7.12.1");  
            conn.setRequestProperty("Content-Length", "83");  
            conn.setRequestProperty("Content-Type", "text/plain");  
               
            //发送POST请求必须设置如下两行  
            conn.setDoInput(true);  
            conn.setDoOutput(true);  
               
            //获取conn对应的输出流  
            out=new PrintWriter(conn.getOutputStream());  
            //发送请求参数  
            String param = "";  
            for(String s : Parameters){  
                param += s+"\n";  
            
            }  
            out.print(param.trim());  
            //进行输出流的缓冲  
            out.flush();  
            //通过BufferedReader输入流来读取Url的响应  
            in=new BufferedReader(new InputStreamReader(conn.getInputStream()));  
            String line;  
            while((line=in.readLine())!= null){  
                result += line;  
            }  
               
        } catch (Exception e) {  
            System.out.println("发送post请求出现异常！"+e);  
            e.printStackTrace();  
        } finally{  
            try{  
                if(out != null){  
                    out.close();  
                }  
                if(in!= null){  
                    in.close();  
                }  
                   
            }catch(IOException ex){  
                ex.printStackTrace();  
            }  
        }  
        return result;  
    }  
}
 



public class JRadioButtonDemo {
	public static void main(String[] args) {
		new MyRadio();
	}
}
