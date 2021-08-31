package apiTestExamples;

public class jsonpayload {

	int page;

	int per_page;
	
	int total;
	
	int total_pages;
	
	support support;
	
	data data;
	
	public jsonpayload( int page, int per_page, int total, int total_pages, data data, support support) {
		this.page =page;
		this.per_page= per_page;
		this.total= total;
		this.total_pages= total_pages;
		this.data=data;
		this.support=support;
	}
	
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPer_page() {
		return per_page;
	}

	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}

	public support getSupport() {
		return support;
	}

	public void setSupport(support support) {
		this.support = support;
	}

	public data getData() {
		return data;
	}

	public void setData(data data) {
		this.data = data;
	}

	
}
