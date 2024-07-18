class JuiceRunner
{
	public static void main(String[] args)
	{
		if(args.length==5)
		{
			String name=args[0];
			String brand=args[1];
			String flavour=args[2];
			String price=args[3];
			String quantity=args[4];
		    float convertedprice=Float.parseFloat(price);
			int convertedQuantity=Integer.parseInt(quantity);
			
			Juice.juiceInfo(name,brand,flavour,convertedprice,convertedQuantity);
		}
		else
		{
			System.out.println("Enter four arguments");
		}
	}
}