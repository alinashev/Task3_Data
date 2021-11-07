import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Objects;

public class Parser {

    private Reader reader;
    private JSONParser parser = new JSONParser();
    private JSONObject jsonObjectQuestions;

    public Parser(Reader reader){
        this.reader = reader;
    }

    public JSONObject parsing(){
         try{
             jsonObjectQuestions = (JSONObject) parser.parse(reader.reading());
             System.out.println("Parse!");
         }catch (ParseException ex){
             System.out.println(ex);
         }
         return jsonObjectQuestions;
     }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public JSONParser getParser() {
        return parser;
    }

    public void setParser(JSONParser parser) {
        this.parser = parser;
    }

    public JSONObject getJsonObjectQuestions() {
        return jsonObjectQuestions;
    }

    public void setJsonObjectQuestions(JSONObject jsonObjectQuestions) {
        this.jsonObjectQuestions = jsonObjectQuestions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parser parser1 = (Parser) o;
        return Objects.equals(reader, parser1.reader) && Objects.equals(parser, parser1.parser) && Objects.equals(jsonObjectQuestions, parser1.jsonObjectQuestions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reader, parser, jsonObjectQuestions);
    }

    @Override
    public String toString() {
        return "Parser{" +
                "reader=" + reader +
                ", parser=" + parser +
                ", jsonObjectQuestions=" + jsonObjectQuestions +
                '}';
    }
}
