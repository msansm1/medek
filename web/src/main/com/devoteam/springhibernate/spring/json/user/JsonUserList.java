package com.devoteam.springhibernate.spring.json.user;

import java.util.List;

import com.devoteam.springhibernate.spring.json.JsonResponse;

public class JsonUserList extends JsonResponse {
	private Integer total;
	private Integer page;
	private Integer records;
	private List<JsonUser> rows;
	
	public JsonUserList() {
		super();
	}

	public JsonUserList(Integer total, Integer page, Integer records,
			List<JsonUser> rows) {
		super();
		this.total = total;
		this.page = page;
		this.records = records;
		this.rows = rows;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}

	public List<JsonUser> getRows() {
		return rows;
	}

	public void setRows(List<JsonUser> rows) {
		this.rows = rows;
	}
	
}
