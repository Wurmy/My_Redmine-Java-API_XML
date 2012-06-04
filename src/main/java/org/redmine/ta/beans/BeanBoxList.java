package org.redmine.ta.beans;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Tobias Feist
 *
 * to map the first attributes in the first tag that contains the actual data
 *
 * @param <T>
 */
public class BeanBoxList<T> extends ArrayList<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6273013202826501524L;
	
	//first response tag because Castor-unmarshalling
	private String type;
	private int total_count;
	private int offset;
	private int limit;
	
	public BeanBoxList() {
	}
	
	//generic... Castor XML Mapping
	public List<T> getT() {
		return this;
	}

	public void setT(List<T> t) {
		this.clear();
		this.addAll(t);
	}
	
//	//getter/setter for Issue Mapping
//	public List<T> getIssue() {
//		return getT();
//	}
//
//	public void setIssue(List<T> issue) {
//		setT(issue);
//	}
	
//	//getter/setter for Project Mapping
//	public List<T> getProject() {
//		return getT();
//	}
//
//	public void setProject(List<T> project) {
//		setT(project);
//	}
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotal_count() {
		return total_count;
	}

	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
		public String toString() {
			String tmp = "";
			for (int i = 0; i < this.size(); i++) {
				tmp += get(i).toString()+"\n";
			}
			return tmp;
		}
	
}
