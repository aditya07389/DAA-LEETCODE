class Solution {
    public String frequencySort(String s) {
        // Step 1: Count the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Create a list of characters and sort it based on frequency
        List<Character> characters = new ArrayList<>(frequencyMap.keySet());
        Collections.sort(characters, (a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

        // Step 3: Construct the result string
        StringBuilder result = new StringBuilder();
        for (char c : characters) {
            int count = frequencyMap.get(c);
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
