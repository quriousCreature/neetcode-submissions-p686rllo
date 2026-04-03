class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for(Character c: s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            Character top = stack.peek();
            switch(c){
                case ']' : if (top == '[') { stack.pop(); } else { return false; } break;
                case ')' : if (top == '(') { stack.pop(); } else { return false; } break;
                case '}' : if (top == '{') { stack.pop(); } else { return false; } break;
                case '{' :
                case '[' :
                case '(' : stack.push(c); break;
                default : return false;

            }
        }
        if (stack.isEmpty())
            return true;
        return false;
        
    }
}
