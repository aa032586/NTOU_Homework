package softwareRegularMethod.homework1014;

/**
 * message
 * @author Jenny
 *
 */
public enum LoopTesting5_Common {
	  OK("���T")
	, ERR_LENGTH("���׿��~")
    , ERR_FORMAT ("�榡���~")
    ;
    private final String content;
    
    LoopTesting5_Common(String content) {
        this.content = content;
    }
    public String getContent() {
        return this.content;
    }
}