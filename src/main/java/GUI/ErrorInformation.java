package GUI;

public class ErrorInformation {
    private Object offendingSymbol;
    private int line;
    private int charPositionInLine;
    private String msg;


    public Object getOffendingSymbol() {
        return offendingSymbol;
    }

    public void setOffendingSymbol(Object offendingSymbol) {
        this.offendingSymbol = offendingSymbol;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getCharPositionInLine() {
        return charPositionInLine;
    }

    public void setCharPositionInLine(int charPositionInLine) {
        this.charPositionInLine = charPositionInLine;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ErrorInformation(Object offendingSymbol, int line, int charPositionInLine, String msg) {
        this.offendingSymbol = offendingSymbol;
        this.line = line;
        this.charPositionInLine = charPositionInLine;
        this.msg = msg;
    }
}
