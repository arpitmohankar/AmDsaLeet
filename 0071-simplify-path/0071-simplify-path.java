class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.isEmpty() || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pollLast();
                }
            } else {
                stack.addLast(part);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append('/').append(dir);
        }
    return result.toString();
    // String[] DIRS = path.split("/");
    // Stack<String> stack = new Stack<>();

    // for (String dir : DIRS) {
    //   if (dir.isEmpty() || dir.equals("."))
    //     continue;
    //   if (dir.equals("..")) {
    //     if (!stack.isEmpty())
    //       stack.pop();
    //   } else {
    //     stack.push(dir);
    //   }
    // }

    // return "/" + String.join("/", stack);
    }
}