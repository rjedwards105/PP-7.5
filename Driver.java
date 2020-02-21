public class Driver
{
    public static void main(String[] args)
    {
        Material animalFarm = new Novel("Things Fall Apart", "Chinua Achebe", "Penguin Books", 209, 25, true);
        Material roomOfOnesOwn = new Novel("1001 Things Every Teen Should Know Before They Leave Home", "Harry H. Harrison Jr.", "Thomas Nelson Publishers",  302, 20, false);
        Material biodegrade = new Journal("Effects of Sterilizing Agents on the Biodegradation of a Bioplastic Material", "Maria E. Gonzalez", "Taylor & Francis", 13, "International Journal of Polymeric Materials", 1, 1, 58, true);

        Material[] library = new Material[3];
        library[0] = animalFarm;
        library[1] = roomOfOnesOwn;
        library[2] = biodegrade;

        for (Material text : library)
        {
            System.out.println(text.toString());
            System.out.println();
        }
    }
}
