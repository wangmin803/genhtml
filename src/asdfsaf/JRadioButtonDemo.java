package asdfsaf;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
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
import java.util.Map.Entry;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


 
class MyRadio {
	private JFrame jFrame = new JFrame("wjm");// 定义一个窗体
	private Container container = jFrame.getContentPane();// 得到窗体容器
	
	


	private JPanel panel = new JPanel();// /定义一个面板
	private JPanel panel1 = new JPanel();// /定义一个面板
	private JButton developer = new JButton("生成内容页");
	private static JButton developer1 = new JButton("生成首页");
	private static JButton developer2 = new JButton("生成栏目页");
	private static JTextField jtextField2 = new JTextField("丰胸_隆胸_女人丰胸的最快方法_如何快速有效果的丰胸_关于怎么隆胸什么可以丰胸_雅客_丰胸网");
	private static JTextField jtextField4 = new JTextField("雅客_丰胸网");
	private static JTextField jtextField5 = new JTextField("结果");
	
	private static JTextField jtextField6 = new JTextField("D:\\aaa");
	
	
	
 
	public MyRadio() {
		
		
		panel.setBorder(BorderFactory.createTitledBorder("生成文件"));// 定义一个面板的边框显示条
		panel.setLayout(new GridLayout(2, 6));// 定义排版，一行三列
	
		
		//http://data.zz.baidu.com/update?site=https://www.jzn360.com&token=eMF5yE1vV5fBasdfeqE
		
		panel1.setBorder(BorderFactory.createTitledBorder("生成文件"));// 定义一个面板的边框显示条
		panel1.setLayout(new GridLayout(1, 2));// 定义排版，一行三列
		panel1.add(jtextField5);
		panel.add(jtextField2);
		panel.add(jtextField6);
		
		panel.add(jtextField4);
		panel.add(this.developer);
		panel.add(this.developer1);
	    jFrame.addWindowListener(
			
		
			new WindowAdapter() {
		        @Override
		        public void windowClosing(WindowEvent e)
		        {
                  super.windowClosing(e);
		           System.exit(0);
		        }
			}
		);


	    
	    developer1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent event) {
				String url="";
				developer1.setEnabled(false);
				developer1.setText("正在执行");
				
				
				 new Thread() {
		                {
		                    this.setDaemon(true);
		                }
		                public void run() {
		            		getnsy();
		                 
		                }
						
		            }.start();
			
		
		
				 }
	    	
	    	
	    	
	    });
	    
	    developer2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent event) {
				String url="";
				developer2.setEnabled(false);
				developer2.setText("正在执行");
				
				
				 new Thread() {
		                {
		                    this.setDaemon(true);
		                }
		                public void run() {
		            		getnlm();
		                 
		                }
						
		            }.start();
			
		
		
				 }
	    	
	    	
	    	
	    });
	    
	    
		developer.addMouseListener(new MouseAdapter() {
			
		public void mouseClicked(MouseEvent event) {
			String url="";
			developer.setEnabled(false);
			developer.setText("正在执行");
			
			
			 new Thread() {
	                {
	                    this.setDaemon(true);
	                }
	                public void run() {
	            		getn();
	                 
	                }
	               
	            }.start();
		
	
	
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
	
	private static void getnsy(){
		String text="";
	    Connection conn = getConn();
/*	    String sql = "select * from area1";*/
/*	    String sql1 = "select * from area3";*/
	    
	    String sql1 = "SELECT * FROM ( SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_news a ,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc,img_url desc " + 
	    		") a " + 
	    		"UNION ALL " + 
	    		"SELECT * FROM ( " + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_tech a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc " + 
	    		") a" + 
	    		
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_yule a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_game a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_sports a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_finance a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_military a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_world a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_fashion a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_travel a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_discovery a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_baby a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_regimen a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_essay a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_history a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_food a,dt_site_channel b  where a.channel_id=b.id " + 
	    		
	    		"order by a.id desc" + 
	    		") a";
	    
	    System.out.println(sql1);
	    
	    
	    
	    
	    
	    //
/*	    SELECT * FROM ( SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time
	    		 FROM dt_channel_article_news a,dt_site_channel b
				 where a.channel_id=b.id
	    		order by id desc,img_url desc 	) a
UNION ALL 
SELECT * FROM ( 
	    		SELECT TOP 10 a.id,channel_id, b.name channel_name,b.title channel_title,a.title,a.img_url,a.add_time 
	    		  FROM dt_channel_article_tech a,dt_site_channel b
				 where a.channel_id=b.id
	    		order by id desc 
) a*/


	    
	    
		Map<String,Object> root = new HashMap<String, Object>();
		
	
		Map<String,List<New>> map  = new HashMap<String,List<New>>();
	
	    
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
	           	newnew.setAddtime(rs.getString("add_time"));
	           	newnew.setChannelId(rs.getString("channel_id"));
	           	newnew.setChannelname(rs.getString("channel_name"));
	           	newnew.setChanneltitle(rs.getString("channel_title"));
	           	newnew.setImgurl(rs.getString("img_url"));
	          	if(null!=newnew.getAddtime()&&!newnew.getAddtime().equals("")){
	          		String tmp = newnew.getAddtime();
	          		tmp=tmp.replace("-", "");
	          	   	newnew.setAddtimestring(tmp.substring(0, 8));
	          	}
	          	
	          	String key = rs.getString("channel_id");
	          	if(map.get(key)!=null){
	          		List list = map.get(key);
	          		list.add(newnew);
	          		map.put(key, list);
	          	}else {
	          		ArrayList list = new ArrayList();
	          		list.add(newnew);
	        		map.put(key, list);
	          	}
	          	
	        
	     
	        }
	        List<NewSy> listsy = new ArrayList();
	        Map<String, List<New>> mapnew = new HashMap<String, List<New>>();
	        for(Map.Entry<String, List<New>> entry :map.entrySet()){
	        	List<New> list = entry.getValue();
	        	NewSy newsy = new NewSy();
	        	newsy.setChannelId(list.get(0).getChannelId());
	        	newsy.setChannelname(list.get(0).getChannelname());
	        	newsy.setChanneltitle(list.get(0).getChanneltitle());

	        	newsy.setList(list);
	        	listsy.add(newsy);
	        	
	        }
	        System.out.println(listsy.size());
	        root.put("listsy",listsy);
			genFremarkersy(root);
			 
	  		jtextField5.setText("生成完毕");
       		jtextField5.paintImmediately(jtextField5.getBounds());
       		developer1.setEnabled(true);
       
	            System.out.println("============================");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	  
	
		
		
	
	}
	
	
	private static void getnlm(){
		String text="";
	    Connection conn = getConn();
/*	    String sql = "select * from area1";*/
/*	    String sql1 = "select * from area3";*/
	    
	    String sql1 = "SELECT * FROM ( SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_news a ,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc,img_url desc " + 
	    		") a " + 
	    		"UNION ALL " + 
	    		"SELECT * FROM ( " + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_tech a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc " + 
	    		") a" + 
	    		
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_yule a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_game a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_sports a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_finance a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_military a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_world a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_fashion a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_travel a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_discovery a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_baby a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_regimen a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_essay a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_history a,dt_site_channel b  where a.channel_id=b.id " + 
	    		"order by a.id desc" + 
	    		") a" + 
	    		
	    		" UNION ALL " + 
	    		"SELECT * FROM (" + 
	    		"SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time" + 
	    		"  FROM dt_channel_article_food a,dt_site_channel b  where a.channel_id=b.id " + 
	    		
	    		"order by a.id desc" + 
	    		") a";
	    
	    System.out.println(sql1);
	    
	    
	    
	    
	    
	    //
/*	    SELECT * FROM ( SELECT TOP 10 a.id,channel_id,  b.name channel_name,b.title channel_title,  a.title,a.img_url,a.add_time
	    		 FROM dt_channel_article_news a,dt_site_channel b
				 where a.channel_id=b.id
	    		order by id desc,img_url desc 	) a
UNION ALL 
SELECT * FROM ( 
	    		SELECT TOP 10 a.id,channel_id, b.name channel_name,b.title channel_title,a.title,a.img_url,a.add_time 
	    		  FROM dt_channel_article_tech a,dt_site_channel b
				 where a.channel_id=b.id
	    		order by id desc 
) a*/


	    
	    
		Map<String,Object> root = new HashMap<String, Object>();
		
	
		Map<String,List<New>> map  = new HashMap<String,List<New>>();
	
	    
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
	           	newnew.setAddtime(rs.getString("add_time"));
	           	newnew.setChannelId(rs.getString("channel_id"));
	           	newnew.setChannelname(rs.getString("channel_name"));
	           	newnew.setChanneltitle(rs.getString("channel_title"));
	           	newnew.setImgurl(rs.getString("img_url"));
	          	if(null!=newnew.getAddtime()&&!newnew.getAddtime().equals("")){
	          		String tmp = newnew.getAddtime();
	          		tmp=tmp.replace("-", "");
	          	   	newnew.setAddtimestring(tmp.substring(0, 8));
	          	}
	          	
	          	String key = rs.getString("channel_id");
	          	if(map.get(key)!=null){
	          		List list = map.get(key);
	          		list.add(newnew);
	          		map.put(key, list);
	          	}else {
	          		ArrayList list = new ArrayList();
	          		list.add(newnew);
	        		map.put(key, list);
	          	}
	          	
	        
	     
	        }
	        List<NewSy> listsy = new ArrayList();
	        Map<String, List<New>> mapnew = new HashMap<String, List<New>>();
	        for(Map.Entry<String, List<New>> entry :map.entrySet()){
	        	List<New> list = entry.getValue();
	        	NewSy newsy = new NewSy();
	        	newsy.setChannelId(list.get(0).getChannelId());
	        	newsy.setChannelname(list.get(0).getChannelname());
	        	newsy.setChanneltitle(list.get(0).getChanneltitle());

	        	newsy.setList(list);
	        	listsy.add(newsy);
	        	
	        }
	        System.out.println(listsy.size());
	        
	        for(NewSy newsy:listsy) {
	            root.put("newsy",newsy);
				genFremarkerlm(root);
	        }
	        
	
			 
	  		jtextField5.setText("生成完毕");
       		jtextField5.paintImmediately(jtextField5.getBounds());
       		developer1.setEnabled(true);
       
	            System.out.println("============================");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	  
	
		
		
	
	}
	
	private static void getn(){
		String text="";

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
	           	newnew.setSeodescription(rs.getString("seo_keywords")+","+jtextField2.getText()+","+ rs.getString("seo_title")+"-"+rs.getString("seo_description"));
	           	newnew.setSeokeywords(rs.getString("seo_keywords"));
	           	newnew.setSeotitle(rs.getString("seo_keywords")+","+jtextField2.getText()+"-"+rs.getString("seo_title")+"-"+jtextField4.getText());
	
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
	          	   	newnew.setAddtimestring(tmp.substring(0, 8));
	          	}
	          		
	          		
	          	
	       
	          
	          	
	        	root.put("new",newnew);
	        	genFremarker(root);
	        	
	        	
	          
	     
	         
	           
	            j++;
	            text="==============id " + newnew.getId() + "生成开始=====第"+j+"条 \r\n";
	            System.out.println("==============id " + newnew.getId() + "生成开始====="+"\r\n");
	        
	 
	       		jtextField5.setText(text);
	       		
	       		jtextField5.paintImmediately(jtextField5.getBounds());
	       		
	       	
	  		
	        }
	            System.out.println("============================");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	  
	
		
		
	}
	
	
	private static void genFremarker(Map map) {
		// TODO Auto-generated method stub
		try {
			FreeMarkerUtil.writeToContent(map, jtextField6.getText(), "", "", "");
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private static void genFremarkersy(Map map) {
		// TODO Auto-generated method stub
		try {
			FreeMarkerUtil.writeToContentsy(map, jtextField6.getText(), "", "", "");
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private static void genFremarkerlm(Map map) {
		// TODO Auto-generated method stub
		try {
			FreeMarkerUtil.writeToContentsy(map, jtextField6.getText(), "", "", "");
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

/*	 List<News> list = new ArrayList();
	if(newsMap.get(c.getChannelCode())!=null){
		List l = newsMap.get(c.getChannelCode());
		if(l.size()>10){
			list = l.subList(0, 10);
			list=getRandomList(l,10);
		
		}else{
			list=getRandomList(l,l.size());
		}
		
		
	
	}*/
	
	public static List getRandomList(List paramList,int count){
        if(paramList.size()<count){
            return paramList;
        }
        Random random=new Random();
        List<Integer> tempList=new ArrayList<Integer>();
        List<Object> newList=new ArrayList<Object>();
        int temp=0;
        for(int i=0;i<count;i++){
            temp=random.nextInt(paramList.size());//将产生的随机数作为被抽list的索引
            if(!tempList.contains(temp)){
                tempList.add(temp);
                newList.add(paramList.get(temp));
            }
            else{
                i--;
            }   
        }
        return newList;
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
