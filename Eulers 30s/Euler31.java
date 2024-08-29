/**
 * In England the currency is made up of pound, £, and pence, p, and there are 
 * eight coins in general circulation:
 * 
 * 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
 * It is possible to make £2 in the following way:
 * 
 * 1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
 * How many different ways can £2 be made using any number of coins?
 * 
 * @author Grace Kasper
 * @version Start: 17 February 2017 End: 21 February 2017
 */
public class Euler31
{
    /*
     * solidGold = 2Pounds = 200pence (max = 1)
     * goldRim = 1pound = 100pence (max = 2)
     * fifty = 50pence (max = 4)
     * twenty = 20pence (max = 10)
     * ten = 10pence (max = 20)
     * five = 5pence (max = 40)
     * two = 2pence (max = 100)
     * penny = 1pence (max = 200)
     */
    public static void main()
    {
        int sum = 0;
        int counter = 0;
        for(int solidGold = 0; solidGold<2; solidGold++)//1
        {
            for(int goldRim = 0; goldRim<3; goldRim++)//2
            {
                for(int fifty = 0; fifty<5; fifty++)//4
                {
                    for(int twenty = 0; twenty<11; twenty++)
                    {
                        for(int ten = 0; ten<21; ten++)//20
                        {
                            for(int five = 0; five<41; five++)//40
                            {
                                for(int two = 0; two<101; two++)//100
                                {
                                        for(int penny = 0; penny<201; penny++)//200
                                        {
                                            sum = penny + two*2 + five*5 + ten*10 + twenty*20+ fifty*50 + goldRim*100 + solidGold*200;
                                            if(sum==200)
                                            {
                                                counter++;
                                                System.out.println(solidGold+", "+goldRim+", "+fifty+", "+twenty+", "+ten+", "+five+", "+two+", "+penny);
                                                System.out.println("Counter: " + counter);
                                            }
                                            //sum = 0;
                                        }
                                    }
                                }
                            }
                        }
                }
            }
            //System.out.println("hey");
        }
        //return true;
    }
}
