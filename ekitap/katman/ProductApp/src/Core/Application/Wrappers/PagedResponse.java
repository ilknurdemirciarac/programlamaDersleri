package Core.Application.Wrappers;

public class PagedResponse<T> extends ServiceResponse<T>{
    public int pageNumber;
    public int pageSize;
    public int getPageNumber() {
        return pageNumber;
    }
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    

    
}
