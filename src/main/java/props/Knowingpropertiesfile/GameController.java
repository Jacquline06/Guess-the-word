package props.Knowingpropertiesfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class GameController {
    @Autowired
   private WebConfig webService;
    @Autowired
   private GameUtili gameUtili;
    
    
    
    @GetMapping("/go-home")
    public String showgamehomepage(@RequestParam(value="guessedChar", required = false) String guessedChar, Model model) {
        // model.addAttribute("attr","attr");
        System.out.println("guessed word:" + guessedChar);
        
        String randomWord = webService.toString();
        model.addAttribute("wordToDisplay", randomWord);
        if(guessedChar !=null) {
        	boolean isGuessCorrect= webService.addGuess(guessedChar.charAt(0));
        	 randomWord = webService.toString();
        	 if(isGuessCorrect==false) {
        		 gameUtili.reduceTry();
        	 }
        }
        model.addAttribute("remainingTries", gameUtili.getTriesRemaining());
       System.out.println("no of tries remaining:"+gameUtili.getTriesRemaining());
        return "index";
    }
}