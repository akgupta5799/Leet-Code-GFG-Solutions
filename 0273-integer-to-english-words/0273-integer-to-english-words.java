class Solution {
    private final String[] lessThenTen = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private final String[] lessThanTwenty = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] lessThanHundred = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        return find(num); 
    }

    private String find(int num) {
        String result = new String();
        if (num < 10) result = lessThenTen[num];
        else if (num < 20) result = lessThanTwenty[num -10];
        else if (num < 100) result = lessThanHundred[num/10] + " " + find(num % 10);
        else if (num < 1000) result = find(num/100) + " Hundred " +  find(num % 100);
        else if (num < 1000000) result = find(num/1000) + " Thousand " +  find(num % 1000);
        else if (num < 1000000000) result = find(num/1000000) + " Million " +  find(num % 1000000);
        else result = find(num/1000000000) + " Billion " + find(num % 1000000000);
        return result.trim();
    }
}