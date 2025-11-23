import java.time.LocalDate;
public class IssueRecord {
   private int id;
    private int bookId;
    private int userId;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    public IssueRecord() {}

    public IssueRecord(int bookId, int userId, LocalDate issueDate, LocalDate dueDate) {
        this.bookId = bookId;
        this.userId = userId;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public LocalDate getIssueDate() { return issueDate; }
    public void setIssueDate(LocalDate issueDate) { this.issueDate = issueDate; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public LocalDate getReturnDate() { return returnDate; }
    public void setReturnDate(LocalDate returnDate) { this.returnDate = returnDate;
    }
}
