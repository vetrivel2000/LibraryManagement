package load;

import com.Books;
import com.Member;

import java.util.ArrayList;
import java.util.HashMap;

public class LoadToMemory {
    HashMap<String ,HashMap<Integer, Books>> searchMap =new HashMap<>();
    HashMap<Integer,Books> booksMap;
    HashMap<Integer, Member> memberMap=new HashMap<>();
    public void addToSearchTitleMap(Books books)
    {
            booksMap= searchMap.get(books.getTitle());
            if (booksMap==null)
            {
                booksMap=new HashMap<>();
                searchMap.put(books.getTitle(),booksMap);
            }
            booksMap.put(books.getBookId(),books);
    }
    public void addToSearchAuthorMap(Books book)
    {
            booksMap= searchMap.get(book.getAuthor());
            if (booksMap==null)
            {
                booksMap=new HashMap<>();
                searchMap.put(book.getAuthor(),booksMap);
            }
            booksMap.put(book.getBookId(),book);
    }
    public void addToMemberMap(Member member)
    {
        memberMap.put(member.getMemberId(),member);
    }

    public HashMap<String, HashMap<Integer, Books>> getSearchMap() {
        return searchMap;
    }

    public HashMap<Integer, Books> getBooksMap() {
        return booksMap;
    }

    public HashMap<Integer, Member> getMemberMap() {
        return memberMap;
    }
}
