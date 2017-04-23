

/* Asked in interview at Amazon India Labs126

class QNode
	{
		Node n;
		int level;//Count at each level
		
		QNode(Node n, int level)
		{
			
			this.n=n;
			this.level=level;
			
		}
	}
	public void printBoundaries(Node root)
	{
		Queue<QNode> qN = new LinkedList<>();
		qN.add(new QNode(root, 0)); //Adding the root
		Node prev=null;
		
		//Hashmap to store Level and Count at each level;
		HashMap<Integer, Integer> mapLevels = new HashMap<>();
		
		while(!qN.isEmpty())
		{
			QNode temp=qN.remove();
			
			//Print leaf nodes
			if(temp.n.left==null && temp.n.right==null)
			{
				System.out.println(temp.n.data);
			}
			if(mapLevels.containsKey(temp.level))
			{
				prev=temp.n;			
				mapLevels.put(temp.level, mapLevels.get(temp.level)+1);
			}
			else
			{
				mapLevels.put(temp.level,0);

				
				//We already printed leaf nodes so avoid re-printing them
				if(!(temp.n.left==null && temp.n.right==null))
				{
					//Print last node of the last level
					if(prev!=null) 
					{
						System.out.println(prev.data);
					}
					//Print first node of this level
						System.out.println(temp.n.data);
				}
				
			}
			
			if(temp.n.left!=null)
				qN.add(new QNode(temp.n.left,temp.level+1));
			if(temp.n.right!=null)
				qN.add(new QNode(temp.n.right,temp.level+1));
			
		}
	}
