package analisesintatica;

import gramaticas.PortugaLexer;
import gramaticas.PortugaParser;
import java.io.IOException;
import java.util.Arrays;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class AnaliseSintatica {

    public static void main(String[] args) throws IOException {
        String path;
        if (args.length > 0) {
            path = args[0];
            try {
                ANTLRFileStream input = new ANTLRFileStream(path);

                PortugaLexer lexer = new PortugaLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                PortugaParser parser = new PortugaParser(tokens);

                //Remove o tratamento padrao, pra evitar duplicacao de mensagem
                parser.removeErrorListeners();

                //Adiciona nosso Listener
                MyError errorListener = new MyError();
                parser.addErrorListener(errorListener);
                ParseTree tree = parser.program();

                //Verifica se houve algum erro, e se sim throw antes de criar o viewer.
                if (!errorListener.errors.isEmpty()) {
                    throw new RuntimeException(String.join("\n", errorListener.errors));
                }

                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                viewer.open();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Você precisa informar um arquivo com o código fonte a ser analisado.");
        }
    }

}
