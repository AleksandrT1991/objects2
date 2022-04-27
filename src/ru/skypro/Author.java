package ru.skypro;

public class Author {
    private String authorFirstName;
    private String authorSecondName;

    public Author(String authorFirstName, String authorSecondName) {
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
    }
    public String getAuthorName(){
        return authorFirstName + " " + authorSecondName;
    }
    public String getAuthorFirstName(){
        return authorFirstName;
    }
    public String getAuthorSecondName(){
        return authorSecondName;
    }
}
