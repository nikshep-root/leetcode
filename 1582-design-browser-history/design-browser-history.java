class BrowserHistory {
    private final Deque<String> backStack = new ArrayDeque<>();
    private final Deque<String> forwardStack = new ArrayDeque<>();

    public BrowserHistory(String homepage) {
        backStack.push(homepage);
    }
    
    public void visit(String url) {
        backStack.push(url);
        forwardStack.clear();
    }
    
    public String back(int steps) {
        while(steps > 0 && backStack.size() > 1){
            forwardStack.push(backStack.pop());
            steps--;
        }
        return backStack.peek();
    }
    
    public String forward(int steps) {
        while(steps > 0 && !forwardStack.isEmpty()){
            backStack.push(forwardStack.pop());
            steps--;
        }
        return backStack.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */