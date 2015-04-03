package edu.nju.cineplex.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 每页显示记录数
	 * 默认值：15条
	 */
	protected int pageSize = 8;
	
	/**
	 * 获得HttpServletRequest对象
	 * @return HttpServletRequest
	 */
	protected HttpServletRequest getRequest(){
		return ServletActionContext.getRequest();
	}

	/**
	 * 获得HttpServletResponse对象
	 * @return HttpServletResponse
	 */
	protected HttpServletResponse getResponse(){
		return ServletActionContext.getResponse();
	}
	
	/**
	 * 获得HttpSession对象
	 * @param flag 如果当前session不存在是否重新创建session
	 * @return HttpSession
	 */
	protected HttpSession getSession(boolean flag){
		return this.getRequest().getSession(flag);
	}
	
	/**
	 * 获得response输出对象
	 * @return PrintWriter
	 * @throws IOException
	 */
	protected PrintWriter getOut() throws IOException {
		HttpServletResponse response = this.getResponse();
		return response.getWriter();
	}
	
	/**
	 * 使用response输出流输出信息
	 * @return PrintWriter
	 * @throws IOException
	 */
	protected void print(String info) throws IOException{
		HttpServletResponse response = this.getResponse();
		response.getWriter().print(info);
	}
	
	protected Enumeration<?> getParameterNames(){
		return this.getRequest().getParameterNames();
		
	}
	
	/**
	 * 获取参数值（字符串）
	 * @param parameterName 要获取参数的名称
	 * @return 参数的值
	 */
	protected String getParameterForString(String parameterName){
		return this.getRequest().getParameter(parameterName);
	}
	
	/**
	 * 获取参数值（长整型）
	 * @param parameterName 要获取参数的名称
	 * @return 参数的值
	 */
	protected long getParameterForLong(String parameterName) throws NumberFormatException{
		if (this.getRequest().getParameter(parameterName) == null || this.getRequest().getParameter(parameterName) == "") {
			return 0;
		}
		return Long.parseLong(this.getRequest().getParameter(parameterName));
	}
	
	/**
	 * 获取参数值（整型）
	 * @param parameterName 要获取参数的名称
	 * @return 参数的值
	 */
	protected int getParameterForInt(String parameterName) throws NumberFormatException{
		if (this.getRequest().getParameter(parameterName) == null || this.getRequest().getParameter(parameterName) == "") {
			return 0;
		}
		return Integer.parseInt(this.getRequest().getParameter(parameterName));
	}
	
	/**
	 * 获取参数值(字符串数组)
	 * @param parameterName 要获取参数的名称
	 * @return 参数的值
	 */
	protected String[] getParameterValues(String parameterName) throws Exception{
		return this.getRequest().getParameterValues(parameterName);
	}
	
	protected Map<?,?> getParameterMap() throws Exception{
		return this.getRequest().getParameterMap();
	}
	
	/**
	 * 往request里面设置值
	 * @param key 要设置的关键字
	 * @param obj 要设置的值
	 */
	protected void setAttribute(String key,Object obj){
		this.getRequest().setAttribute(key, obj);
	}
	
	/**
	 * 获得session的值
	 * @param <T> 泛型
	 * @param attrName 
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected <T>T getSessionAttr(String attrName,Class<T> clazz){
		return (T)this.getSession(false).getAttribute(attrName);
	}
	
	/**
	 * 往session里面设置值
	 * @param attrName 关键字
	 * @param obj 设置的值
	 */
	protected void setSessionAttr(String attrName,Object obj){
		this.getSession(false).setAttribute(attrName, obj);
	}
}