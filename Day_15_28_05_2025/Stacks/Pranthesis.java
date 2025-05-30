import java.util.*;
public class Pranthesis {
    public static void main(String[] args) {
        // String str="(({}))";
        // String str="(({))";
        //    String str="({[]})[()]";
        String str=")))";
        Stack<Character> stack= new Stack<>();
        boolean isValid= true;
        for(char ch:str.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '[') {
                  stack.push(ch);
                }
            else if(ch==')'){
                if(!stack.isEmpty()){
                    if((stack.pop())!='('){
                        System.out.println("Not Valid");
                        isValid=false;
                        break;
                    }
                }else{
                    System.out.println("Not Valid");
                    isValid=false;
                    break;
                }
            }
            else if(ch=='}'){
                if(!stack.isEmpty()){
                    if((stack.pop())!='{'){
                        System.out.println("Not Valid");
                        isValid=false;
                        break;
                    }

                }else{
                    System.out.println("Not Valid");
                    isValid=false;
                    break;
                }
            }
            else if(ch==']'){
                if(!stack.isEmpty()){
                    if((stack.pop())!='['){
                        System.out.println("Not Valid");
                        isValid=false;
                        break;
                    }
                }else{
                    System.out.println("Not Valid");
                    isValid=false;
                    break;
                }
            }
        }
        if(isValid && (stack.isEmpty())){
            System.out.println("Is Valid");
        }
    }
}
