public class Skills
{
	private int level = 0;
	private int procentLevel = 0;
	private int maxProcentLevel = 100;
	
	public int skillPoint = 0;
	public int BodyTypeSkill = 20;
	public int strongSkill = 0;
	public int agilitySkill = 0;
	public int intelligenceSkill = 0;
	public int luckSkill = 0;
	public int miningEngineeringSkill = 0;
	
	public void printSkills()
	{
		System.out.println();
		System.out.println("Уровень: +" + level + " (" + procentLevel + "%" + "/" + maxProcentLevel + "%)");
		System.out.println("Очки навыков: +" + skillPoint);
		System.out.println();
		System.out.println("Телосложение: +" + BodyTypeSkill);
		System.out.println("Сила: +" + strongSkill);
		System.out.println("Ловкость: +" + agilitySkill);
		System.out.println("Интеллект: +" + intelligenceSkill);
		System.out.println("Везение: +" + luckSkill);
		System.out.println("Горное дело: +" + miningEngineeringSkill);
	}
	
	public void addProcent(int procents)
	{
		procentLevel += procents;
		
		if(procentLevel >= maxProcentLevel)
		{
			procentLevel -= maxProcentLevel;
			maxProcentLevel += 20;

			level++;
			skillPoint++;
		}
	}
}
