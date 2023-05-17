package com.introop.solid.openclose;

public class BookWithPages extends Book {

    public BookWithPages(String name, String author) {
        super(name, author);
    }

    public int getPagesNum(){
        return getName().length();
    }
}
