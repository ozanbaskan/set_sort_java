import java.util.Date;

public class Book implements Comparable<Book> {

    private String name;
    private String writer;
    private Date publishDate;
    private int pages;

    public Book (String name, int pages, String writer, Date publishDate)
    {
        this.name = name;
        this.pages = pages;
        this.writer = writer;
        this.publishDate = publishDate;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public String getWriter()
    {
        return writer;
    }

    public void setWriter(String writer)
    {
        this.writer = writer;
    }

    public Date getPublishDate()
    {
        return publishDate;
    }

    public void setPublishDate(Date publishDate)
    {
        this.publishDate = publishDate;
    }

    public int getPages()
    {
        return pages;
    }

    public void setPages(int pages)
    {
        this.pages = pages;
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.getName());
    }
}
