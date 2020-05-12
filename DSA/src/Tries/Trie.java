package Tries;

import java.util.HashMap;
import java.util.Map;

public class Trie
{
	private class TrieNode 
	{
		HashMap<Character,TrieNode> hmChildren = new HashMap<Character,TrieNode>();
		boolean endOfWord=false;		
		
	}
	public final TrieNode root;
	public Trie()
	{
		root=new TrieNode();
	}
	

	public void insert(String s)
	{
		
		
		
		TrieNode ptr = root;
		
		for (int i = 0; i < s.length(); i++) 
		{
			
			TrieNode newNode = ptr.hmChildren.get(s.charAt(i));
			if(newNode==null)
			{
				newNode=new TrieNode();
				ptr.hmChildren.put(s.charAt(i),newNode );
			}
			ptr=newNode;
			
		}
		ptr.endOfWord=true;
		
	}
	public void print()
	{
		printTrie(root);
	}
	
	private void printTrie(TrieNode ptr)
	{
		if(ptr==null) return;
		
		for(Map.Entry<Character,TrieNode>p: ptr.hmChildren.entrySet())
		{
			System.out.print(p.getKey()+" ");
			printTrie(p.getValue());
		}
		
		
	}
	
	void printallKeysInANode(TrieNode ptr)
	{
		if(ptr==null) ptr=root;
		for(Map.Entry<Character, TrieNode> p:ptr.hmChildren.entrySet())
		{
			System.out.println(p.getKey());
			
		}
		
	}
	
	public static void main(String[] args) {
		Trie t = new Trie();
		t.insert("abandon");
		t.insert("abandoned");
		t.insert("ability");
		t.insert("able");
		t.insert("about");
		t.insert("above");
		
		//t.print();
		t.printallKeysInANode(null);
	}
	
}





