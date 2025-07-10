class Solution {
    public String simplifyPath(String path) {
    String[] DIRS = path.split("/");
    Stack<String> stack = new Stack<>();

    for (String dir : DIRS) {
      if (dir.isEmpty() || dir.equals("."))
        continue;
      if (dir.equals("..")) {
        if (!stack.isEmpty())
          stack.pop();
      } else {
        stack.push(dir);
      }
    }

    return "/" + String.join("/", stack);
    }
}