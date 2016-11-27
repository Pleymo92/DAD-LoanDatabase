package dbloansdad;

//@author Pleymo

public class Loan {
    
    String id, codeStudent, codeBook, dateLoan, dateReturn, status;
    
    public Loan() { }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public String getDateLoan() {
        return dateLoan;
    }

    public void setDateLoan(String dateLoan) {
        this.dateLoan = dateLoan;
    }

    public String getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(String dateReturn) {
        this.dateReturn = dateReturn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
