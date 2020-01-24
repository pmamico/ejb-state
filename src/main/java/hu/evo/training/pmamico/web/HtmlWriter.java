package hu.evo.training.pmamico.web;

public class HtmlWriter {
    private static final String lineSeparator = "<br />";

    public static final String line(String str){
        return str.concat(lineSeparator);
    }

    public static final String h(int level, String str){
        if(level<1){
            level = 1;
        }
        if(level > 6){
            level = 6;
        }
        String start = "<h".concat(String.valueOf(level)).concat(">");
        String end   = "</h".concat(String.valueOf(level)).concat(">");
        return start.concat(str).concat(end);
    }
}
