import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name ,int age){
        return "普通参数传递";
    }


//普通参数：请求参数名与形参名不同
    @RequestMapping("/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String username , int age){
        return "commonParamDifferentName";
    }

    //POJO参数
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        return "pojo";
    }

    //数组参数
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String likes){
        return "arrayParam";
    }

    //集合参数
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes){
        return "listParam";
    }
}
