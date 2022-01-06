import java.util.*;

public class Game
{
	public int cobblestoneCount = 0;

	private Resources res;
	private Skills skills;
	private Blocks blocks;
	private Tools tools;

	public Game()
	{
		res = new Resources();
		skills = new Skills();
		blocks = new Blocks(res);
		tools = new Tools(res, blocks);

		System.out.println("Вы появляетесь в красивом лесу среди\nдубов и берёз, также вы видите какое-то \nстроение на горе неподалёку.");
		System.out.println("");
		System.out.println("Добро пожаловать в \"Игру Бога\"!");
		System.out.println("Напишите команду \"help\" чтобы узнать ос-\nновной геймплей этой игры.");
		System.out.println("");
		System.out.println("И напишите команду \"продолжить\" для про-\nдолжения игры.");

		Scanner scanner = new Scanner(System.in);
		while (true)
		{
			String command = scanner.nextLine();
			handleCommand(command);
		}
	}

	public void handleCommand(String command)
	{
		switch (command)
		{
			case "Нд":
				System.out.println("Вы решили нарубить дуб. + 6 брёвен.");
				res.woodAmount += 6;
				break;
			
			case "skills":
				skills.printSkills();
				break;
			
			case "Созд доски":
				res.createPlanks();
				break;
			
			case "Созд верстак":
				blocks.createWorkbench();
				break;
			
			case "Созд кирку":
				tools.createWoodPickaxe();
				break;
			
			case "Добыть камень":

				break;
			
			case "Создпалк":
				res.createSticks();
				break;
			
			case "Убить енота":
				skills.addProcent(33);
				
				System.out.println("Вы убили енота");
				break;
			
			default:
				System.out.println("Неизвестно!");
		}
	}

	public void empty()
	{
		System.out.println("");
	}

	public void print(String text)
	{
		System.out.println(text);
	}
}
