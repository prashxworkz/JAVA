class PaperRunner{
	
	public static void main(String[] args){
		
		Paper paper=new Paper(2.2);
		paper.setPaper("A3");
		paper.quality="opacity";
		paper.print();
		
		Paper paper1=new Paper(2.0);
		paper1.setPaper("A5");
		paper1.quality="Whiteness";
		paper1.print();
		
		
		Paper paper2=new Paper(1.2);
		paper2.setPaper("A4");
		paper2.quality="grammage";
		paper2.color="pink";
		paper2.print();
	}
	
}