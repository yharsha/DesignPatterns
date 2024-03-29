package prototype;

import java.util.List;

public class Statement implements Cloneable {
	
	private String sql;
	private List<String> parameters;
	private Record record;
	
	public Statement(String sql, List<String> parameters, Record record) {
		super();
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}
	


	public Statement Clone()
	{
		try {
			return (Statement) super.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();	
		}
		return null;
	}
	

	public String getSql() {
		return sql;
	}
	public List<String> getParameters() {
		return parameters;
	}
	public Record getRecord() {
		return record;
	}
	
	@Override
	public String toString() {
		return "Statement [sql=" + sql + ", parameters=" + parameters + ", record=" + record + "]";
	}

}
