package props.Knowingpropertiesfile;

import org.springframework.stereotype.Component;

@Component
public class GameUtili {
private int MAX_TRIES=5;


public int reduceTry() {
	
	return MAX_TRIES = MAX_TRIES-1;
}
public int getTriesRemaining() {
	
	return MAX_TRIES;
}
}
