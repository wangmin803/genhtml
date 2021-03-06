package asdfsaf;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Locale;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**

 */
public class FreeMarkerUtil {


    
    public static void writeToContent( Map<String, Object> map, String templatePath,
    		String templateName, String htmlPath,String channel) throws IOException, TemplateException {
    	Configuration freemarkerCfg = new Configuration();
    	freemarkerCfg.setObjectWrapper(new DefaultObjectWrapper());

    	freemarkerCfg.setClassForTemplateLoading(FreeMarkerUtil.class, "/asdfsaf/template/");
    	Template template = freemarkerCfg.getTemplate("content.ftl", "UTF-8");
		freemarkerCfg.setEncoding(Locale.getDefault(), "UTF-8");
		template.setEncoding("UTF-8");
	    New newnews = (New)map.get("new");
	 
	    
	    File dir = new File(templatePath+File.separator+newnews.getChannelname());
	    if(!dir.exists()){
	    	dir.mkdir();
	    }
	    

	    File htmlFile = new File(templatePath+File.separator+newnews.getChannelname()+File.separator +"show"+newnews.getAddtimestring()+"-"+newnews.getId()+".html");
		Writer out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(htmlFile), "UTF-8"));


		template.process(map, out);
		out.flush();
		out.close();
	}
    
    
    public static void writeToContentsy( Map<String, Object> map, String templatePath,
    		String templateName, String htmlPath,String channel) throws IOException, TemplateException {
    	Configuration freemarkerCfg = new Configuration();
    	freemarkerCfg.setObjectWrapper(new DefaultObjectWrapper());

    	freemarkerCfg.setClassForTemplateLoading(FreeMarkerUtil.class, "/asdfsaf/template/");
    	Template template = freemarkerCfg.getTemplate("shouye.ftl", "UTF-8");
		freemarkerCfg.setEncoding(Locale.getDefault(), "UTF-8");
		template.setEncoding("UTF-8");
	    New newnews = (New)map.get("new");
	    
	    File dir = new File(templatePath);
	    if(!dir.exists()){
	    	dir.mkdir();
	    }

	    File htmlFile = new File(templatePath+File.separator +"index.html");
		Writer out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(htmlFile), "UTF-8"));
		template.process(map, out);
		out.flush();
		out.close();
	}
    
    public static void writeToContentlm( Map<String, Object> map, String templatePath,
    		String templateName, String htmlPath,String channel) throws IOException, TemplateException {
    	Configuration freemarkerCfg = new Configuration();
    	freemarkerCfg.setObjectWrapper(new DefaultObjectWrapper());

    	freemarkerCfg.setClassForTemplateLoading(FreeMarkerUtil.class, "/asdfsaf/template/");
    	Template template = freemarkerCfg.getTemplate("channel.ftl", "UTF-8");
		freemarkerCfg.setEncoding(Locale.getDefault(), "UTF-8");
		template.setEncoding("UTF-8");
		NewSy newsy = (NewSy)map.get("newsy");
		

	    
	    File dir = new File(templatePath);
	    if(!dir.exists()){
	    	dir.mkdir();
	    }

	    File htmlFile = new File(templatePath+File.separator +newsy.getChannelname()+".html");
		Writer out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(htmlFile), "UTF-8"));
		template.process(map, out);
		out.flush();
		out.close();
	}
}