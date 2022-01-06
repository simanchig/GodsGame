public class Blocks
{
	public boolean hasWorkbench = false;
	
	private Resources res;

	public Blocks(Resources resources)
	{
		res = resources;
	}
	
	public void createWorkbench()
	{
		if(hasWorkbench)
		{
			System.out.println("У вас уже есть верстак");
			System.out.println();
			return;
		}

		if(res.hasResources(res.planksAmount, 4) == false) return;

		res.planksAmount -= 4;
		hasWorkbench = true;

		System.out.println("Вы создали Верстак");
		System.out.println();
	}
}
