class Solution {
    /**
     * Calculates the final value after performing a series of operations.
     *
     * @param operations An array of strings representing the operations to be performed.
     *                   Each string consists of a single character ('+' or '-') followed by 'X'.
     * @return The final value after performing the operations. The value is calculated by adding 1 for each '+' operation
     * and subtracting 1 for each '-' operation.
     */
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for (String str : operations) {
            // Check the second character in the string to determine the operation type.
            // If it is '+', increment the result by 1. Otherwise, decrement the result by 1.
            result += str.charAt(1) == '+' ? 1 : -1;
        }

        return result;
    }

}