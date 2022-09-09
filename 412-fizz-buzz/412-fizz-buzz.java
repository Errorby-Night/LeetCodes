class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ab = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0)
                ab.add("FizzBuzz");
            else if(i % 3 == 0)
                ab.add("Fizz");
            else if(i % 5 == 0)
                ab.add("Buzz");
            else
                ab.add(Integer.toString(i));
        }
        return ab;
    }
}