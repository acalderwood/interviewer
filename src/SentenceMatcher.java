import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.Sentence;
import edu.stanford.nlp.parser.lexparser.LexicalizedParser;
import edu.stanford.nlp.process.*;
import edu.stanford.nlp.trees.*;

import java.io.StringReader;
import java.util.Collection;
import java.util.List;

/**
 * Created by Alastair on 8/29/2015.
 */
public class SentenceMatcher {

    public static void main(String[] args) {
        String parserModel = "edu/stanford/nlp/models/lexparser/englishPCFG.ser.gz";
        if (args.length > 0) {
            parserModel = args[0];
        }
        LexicalizedParser lp = LexicalizedParser.loadModel(parserModel);

        if (args.length == 0) {
            demoAPI(lp);
        } else {
            String textFile = (args.length > 1) ? args[1] : args[0];
            demoDP(lp, textFile);
        }
    }

    public static void demoDP(LexicalizedParser lp, String filename) {
        // This option shows loading, sentence-segmenting and tokenizing
        // a file using DocumentPreprocessor.
        TreebankLanguagePack tlp = lp.treebankLanguagePack(); // a PennTreebankLanguagePack for English
        GrammaticalStructureFactory gsf = null;
        if (tlp.supportsGrammaticalStructures()) {
            gsf = tlp.grammaticalStructureFactory();
        }
        // You could also create a tokenizer here (as below) and pass it
        // to DocumentPreprocessor
        for (List<HasWord> sentence : new DocumentPreprocessor(filename)) {
            Tree parse = lp.apply(sentence);
            parse.pennPrint();
            System.out.println();

            if (gsf != null) {
                GrammaticalStructure gs = gsf.newGrammaticalStructure(parse);
                Collection tdl = gs.typedDependenciesCCprocessed();
                System.out.println(tdl);
                System.out.println();
            }
        }
    }

    public static void demoAPI(LexicalizedParser lp) {
        // This option shows parsing a list of correctly tokenized words
        String[] sent = { "This", "is", "an", "easy", "sentence", "." };
        List<CoreLabel> rawWords = Sentence.toCoreLabelList(sent);
        Tree parse = lp.apply(rawWords);
        parse.pennPrint();
        System.out.println();

        // This option shows loading and using an explicit tokenizer
        String sent2 = "This is another sentence.";
        TokenizerFactory<CoreLabel> tokenizerFactory =
                PTBTokenizer.factory(new CoreLabelTokenFactory(), "");
        Tokenizer<CoreLabel> tok =
                tokenizerFactory.getTokenizer(new StringReader(sent2));
        List<CoreLabel> rawWords2 = tok.tokenize();
        parse = lp.apply(rawWords2);

        TreebankLanguagePack tlp = lp.treebankLanguagePack(); // PennTreebankLanguagePack for English
        GrammaticalStructureFactory gsf = tlp.grammaticalStructureFactory();
        GrammaticalStructure gs = gsf.newGrammaticalStructure(parse);
        List<TypedDependency> tdl = gs.typedDependenciesCCprocessed();
        System.out.println(tdl);
        System.out.println();

        // You can also use a TreePrint object to print trees and dependencies
        TreePrint tp = new TreePrint("penn,typedDependenciesCollapsed");
        tp.printTree(parse);

    }
}
