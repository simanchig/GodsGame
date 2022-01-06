public class Tools
{
	public boolean hasPickaxe = false;

	private Blocks blocks;
	private Resources res;

	public Tools(Resources resources, Blocks _block)
	{
		res = resources;
		blocks = _block;
	}

	public void createWoodPickaxe()
	{
		if(hasPickaxe)
		{
			System.out.println("У вас уже есть кирка");
			System.out.println();
			return;
		}
		
		if(res.hasResources(res.sticks, 2) == false) return;
		if(res.hasResources(res.planksAmount, 3) == false) return;

		if(blocks.hasWorkbench == false)
		{
			System.out.println("У вас нету верстака");
			System.out.println();
			return;
		}

		res.sticks -= 2;
		res.planksAmount -= 3;
		hasPickaxe = true;
		
		System.out.println("Вы создали кирку!");
		System.out.println("Чтобы её использовать вам требуеться:\n1 Горное дело\n1 Везение\n2 Интелект");
		System.out.println();
	}
}
