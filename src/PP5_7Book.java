public class PP5_7Book {
    public String title, author, publisher;
    public int copyrightYear;

    public PP5_7Book(String t,String a,String p, int cy){
        title = t;
        author = a;
        publisher = p;
        copyrightYear = cy;
    }

    public void setTitle(String t){
        title = t;
    }

    public void setAuthor(String a){
        author = a;
    }

    public void setPublisher(String p){
        publisher = p;
    }

    public void setCopyrightYear(int cy){
        copyrightYear = cy;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getPublisher(){
        return publisher;
    }

    public int getCopyrightYear(){
        return copyrightYear;
    }

    public String toString(){
        return "book title: " + title + "\nby author name: " + author + "\npublish on year: "+ copyrightYear + " \nby publisher name: " + publisher;
    }
}
