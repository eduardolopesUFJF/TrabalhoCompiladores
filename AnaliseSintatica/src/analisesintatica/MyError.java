package analisesintatica;

import org.antlr.v4.runtime.*;
import java.util.ArrayList;
import java.util.List;

public class MyError extends BaseErrorListener {

    public final List<String> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        errors.add(String.format("[%d:%d] %s", line, charPositionInLine, msg));
    }
}