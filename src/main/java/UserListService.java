import static java.util.UUID.randomUUID;

public class UserListService {

    public ResponseView getUsersListId(RequestView request) {
        return new ResponseView(randomUUID().toString());
    }

}
