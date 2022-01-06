public class Resources
{
	public int woodAmount = 0;
	public int planksAmount = 0;

	public int sticks = 0;

	public boolean hasResources(int resourceAmount, int amount)
	{
		if(amount < 0) return false;

		if(amount > resourceAmount)
		{
			System.out.println("Недостаточно ресурса, нужно = " + amount);
			System.out.println();
			return false;
		}

		return true;
	}

	public void createPlanks()
	{
		if(hasResources(woodAmount, 1) == false) return;

		woodAmount -= 1;
		planksAmount += 4;

		System.out.println("Вы создали 4 доски!");
		System.out.println();
	}

	public void createSticks()
	{
		if(hasResources(planksAmount, 2) == false) return;
		
		planksAmount -= 2;
		sticks += 4;
		
		System.out.println("Вы создали 4 палки");
		System.out.println();
	}
}
