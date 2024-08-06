class ChocolateRunner{
	
	
	public static void main (String sweet[]){
		
		
		Chocolate chocolate=new Chocolate(50);
		chocolate.setChocolate("strawberry");
		chocolate.size='l';
		chocolate.display();
		
		Chocolate chocolate1=new Chocolate(150);
		chocolate1.setChocolate("oreo");
		chocolate1.size='m';
		chocolate1.display();
		chocolate1.brand="dairy milk";
		
		Chocolate chocolate2=new Chocolate(5);
		chocolate2.setChocolate("vanilla");
		chocolate2.size='s';
		chocolate2.display();
	}
}