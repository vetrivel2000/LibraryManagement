package logical;

import com.Books;
import com.Member;
import load.LoadToMemory;

import java.util.ArrayList;
import java.util.HashMap;

public class LogicalLayer {
    LoadToMemory load= new LoadToMemory();
    public void loadToMap(Books books)
    {
        load.addToSearchTitleMap(books);
    }
    public void loadToMemberMap(Member member)
    {
        load.addToMemberMap(member);
    }
    public void loadToAuthorMap(Books books)
    {
        load.addToSearchAuthorMap(books);
    }
    public HashMap<String, HashMap<Integer, Books>> getSearchMap() {
        return load.getSearchMap();
    }

    public HashMap<Integer, Books> getBooksMap() {
        return load.getBooksMap();
    }

    public HashMap<Integer, Member> getMemberMap() {
        return load.getMemberMap();
    }
}
