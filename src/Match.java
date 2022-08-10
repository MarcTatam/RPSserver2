public class Match {
    private String selection1, selection2;

    public void setSelection1(String selection1) throws InvalidCaseException{
        switch (selection1){
            case "r":
                this.selection1 = "r";
                break;
            case "p":
                this.selection1 = "p";
                break;
            case "s":
                this.selection1 = "s";
                break;
            default:
                throw new InvalidCaseException("Expected r,p,s got " + selection1);
        }
    }

    public void setSelection2(String selection2) throws InvalidCaseException{
        switch (selection2){
            case "r":
                this.selection2 = "r";
                break;
            case "p":
                this.selection2 = "p";
                break;
            case "s":
                this.selection2 = "s";
                break;
            default:
                throw new InvalidCaseException("Expected r,p,s got " + selection2);
        }
    }

    public String executeMatch() throws NotSetException{
        if (this.selection1 == null || this.selection2 == null){
            throw new NotSetException("One of the players is not set");
        }
        if(this.selection1.equals(this.selection2)){
            return "draw";
        }
        switch (this.selection1){
            case "r":
                if(this.selection2.equals("s")){
                    return "win";
                } else {
                    return "loss";
                }
            case "p":
                if(this.selection2.equals("r")){
                    return "win";
                } else {
                    return "loss";
                }
            case "s":
                if(this.selection2.equals("p")){
                    return "win";
                } else {
                    return "loss";
                }
        }
        throw new NotSetException("One of the players is not set");
    }
}
