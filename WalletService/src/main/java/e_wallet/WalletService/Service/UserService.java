package e_wallet.WalletService.Service;

import e_wallet.WalletService.Model.User;
import e_wallet.WalletService.Model.UserResponse;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.*;
public class UserService
{
    @Autowired
    private RestTemplate rt;
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public List<User> getAllUsers(){
        ResponseEntity<UserResponse> forEntity =
                rt.getForEntity("http://127.0.0.1:8080/users", UserResponse.class);
        logger.info(forEntity.getHeaders().toString());
        if(forEntity.getStatusCode().equals(HttpStatus.NOT_FOUND)){
            return null;
        }
        return forEntity.getBody().getList();
    }

    public User getAUser(String userId){
        final String uri = "http://127.0.0.1:8080/users/{userId}";
        Map<String, String> params = new HashMap<String, String>();
        params.put("userId", userId);

        ResponseEntity<User> forEntity =
                rt.getForEntity(uri,  User.class,params);
        if(forEntity.getStatusCode().equals(HttpStatus.NOT_FOUND)){
            return null;
        }
        return forEntity.getBody();
    }
}
