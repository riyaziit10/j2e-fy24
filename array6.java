package student.banasthali.abhilasha;


import java.io.*;
import java.util.*;
public class array6 {

static ArrayList<Integer> nums = new ArrayList<Integer>();
static ArrayList<Integer> curr = new ArrayList<Integer>();
static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
static ArrayList<Boolean> visited = new ArrayList<Boolean>();


static void backtrack()
{

	
	if (curr.size() == nums.size())
	{
	ans.add(curr);
	for(int i = 0; i < curr.size(); i++)
	{
		System.out.print(curr.get(i) +" ");
	}
	System.out.println();
	}

	
	for (int i = 0; i < (int)nums.size();
		i++)
	{

	
	if (i > 0 && (nums.get(i) == nums.get(i - 1)) && !visited.get(i - 1))
		continue;

	
	visited.set(i, true);

	
	curr.add(nums.get(i));

	
	backtrack();

	
	visited.set(i, false);

	
	curr.remove(curr.size() - 1);
	}
}

static ArrayList<ArrayList<Integer>> permuteDuplicates()
{
	
	Collections.sort(nums);

	for(int i = 0; i < nums.size(); i++)
	{
	visited.add(false);
	}

	
	backtrack();

	return ans;

}


static void getDistinctPermutations()
{
	ans = permuteDuplicates();


}


public static void main (String[] args)
{

	// Input
	nums.add(1);
	nums.add(2);
	nums.add(2);

	
	getDistinctPermutations();
    array6 s=new array6();
}
}



    

