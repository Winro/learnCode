
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		// TODO: 给一个有工资收入和稿费收入的小伙伴算税:
		Income[] incomes = new Income[] { new Income(3000), new SalaryIncome(7500), new RoyaltyIncome(12000) };
		double total = 0;
		// TODO:
		System.out.println(total);
		printTotal(incomes);
	}
	public static void printTotal(Income...incomes) {
		double total = 0;
		for(Income income : incomes) {
			System.out.println(income.getTax());
		}
	}

}
