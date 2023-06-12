package maxNumberFinder;

public class MaximumNumberFinder {
	
	
		
				    public static int findMaximumNumber(Object[] arr) {
		        int max = Integer.MIN_VALUE;
		        for (Object element : arr) {
		            if (element instanceof Integer) {
		                int number = (int) element;
		                max = Math.max(max, number);
		            } else if (element instanceof Object[]) {
		                int subArrayMax = findMaximumNumber((Object[]) element);
		                max = Math.max(max, subArrayMax);
		            }
		        }
		        return max;
		    }

		    public static void main(String[] args) {
		        Object[] input = {2, 4, 10, new Object[]{12, 4, new Object[]{100, 99}, 4}, new Object[]{3, 2, 99}, 0};
		        int maxNumber = findMaximumNumber(input);
		        System.out.println("Maximum number: " + maxNumber);
		    }
		}

	