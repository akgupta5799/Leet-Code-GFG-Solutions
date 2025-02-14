class ProductOfNumbers {
    List<Integer> list;
    public ProductOfNumbers() {
        this.list = new ArrayList<>();
    }
    
    public void add(int num) {
        list.add(num);
    }
    
    public int getProduct(int k) {
        int product = 1;
        int lastIdx = list.size()-1;
        while(k > 0){
            product *= list.get(lastIdx);
            k--;
            lastIdx--;
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */