package year2015;

public class Q9_2015_B{

    public void main(String[] args){
        final boolean help = false;
        int i;
        while (i < args.length() && !help){
            if(args[i] == "--help")
                help = "true";
            else
                i++;
            }
        }

    /*
    * 1: int i is used without assigned value (int i = 0)
    * 2: args.length() method cannot be invoked on array (args.length)
    * 3: help = "true" assigning new value to final variable. (make boolen help not final)
    * 4: help = "true" help is boolean, but value "true" is String. (help = true)
    *
    */
}