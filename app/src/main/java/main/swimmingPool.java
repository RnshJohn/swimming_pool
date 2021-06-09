package main;

public class SwimmingPool {
	public int swimming(boolean weekend, int age, boolean  group,boolean primeM, int in_hour)throws Exception
	{
		int price;



		if((in_hour >=5 && in_hour <= 22) && (age >=3 && age <= 75))
		{
			if(primeM)
			{
				if(weekend)
				{
					price = 125;

				}
				else
				{
					price = 100;

				}
			}else {
				if(weekend)
				{
					price = 250;

				}
				else {
					if(group)
					{
						price = 140;
					}
					else
					{
						if(in_hour < 7 || age >= 60 || age <= 12)
						{
							price = 160;
						}
						else {
							price = 200;
						}
					}
				}
			}



		}else {
			throw new Exception("Can not come in");
		}

		return price;





	}

}
