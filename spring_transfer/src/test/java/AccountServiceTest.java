import com.it.AccountService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class AccountServiceTest {
    @Autowired
    public   AccountService accountService;

    @Test
    public void testTransfer() throws IOException{
        accountService.transfer("Tom","Jerry", 500D);
    }
}
