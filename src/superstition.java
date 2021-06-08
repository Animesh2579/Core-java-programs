import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
class Superstitions 
{
static public void main(String...ar)
{
Scanner sc=new Scanner(System.in);
out.println("List of top 10 Superstition in India and possible logic behind them:");
out.println("1.Hanging lemon and 7 green chilies");
out.println("2.If a black cat crosses your path, it's a bad omen");
out.println("3.Breaking mirror brings bad luck");
out.println("4.Twitching of the eye is inauspicious");
out.println("5.Removing evil eye (Nazar Utaarna)");
out.println("6.Adding one rupee to a gift sum");
out.println("7.Do not sweep after sunset");
out.println("8.Don't go near a Peepal tree in the night");
out.println("9.Cutting nails on saturday");
out.println("10.Do not sleep with your head facing the North");
out.println("For detailed information enter your choice");
int choice=sc.nextInt();
switch(choice)
{
case 1:out.println("Hanging lemon and 7 green chilies");
           out.println("It is believed in India that 'Alakshmi', the goddess of misfortune can bring bad luck to the shop owners or business. Since, she likes sour, pungent and hot things, shop owners in India hang lemon and 7 green chilies at their door so that the goddess eat her favourite food, satisfy her hunger and leave without entering the shop.");
           out.println("For more information go on link->https://www.youtube.com/watch?v=2A5fNj6dWDo");
           break;
case 2:out.println("If a black cat crosses your path, it's a bad omen");
           out.println("Just because they are black cats? Not just in India but this is a popular belief in the west too. The origin of this superstition has come from the Egyptians who believed that black cats were evil creatures and they bring bad luck. In India, black colour is generally associated with the Lord Shani. It is said that if a black cat crosses your path, then you should let somebody else pass before you do. This way, the first person will have all the bad luck and you won't.");
           out.println("For more information go on link->https://www.youtube.com/redirect?q=http%3A%2F%2Fbit.ly%2FSubToColeAndMarmalade&redir_token=nqEFR8bQfMgHOlOeCRPwidKLn2V8MTU2ODAxNzEyMEAxNTY3OTMwNzIw&event=video_description&v=i9GQbI5fFTk");
           break;
case 3:out.println("Breaking mirror brings bad luck");
           out.println("It is said that in earlier times, mirror used to be very expensive but brittle. To avoid the negligence, the ancient people from Rome started preaching that breaking mirrors will bring you 7 years of bad luck. Why 7 years? This is because Romans believe that it takes 7 years for a life to renew itself. So, the image of a person, who does not have a good health, will break the mirror and after 7 years, his life will renew itself and he'll be in good health.");
           out.println("For more information go on link->https://www.youtube.com/watch?v=vr0q43w3G4w");
           break;
case 4:out.println("Twitching of the eye is inauspicious");
           out.println("The superstition is different in different cultures. It is considered good luck in some cultures and bad in some other. It differs according to gender as well. Since it is related to eyes, there are many scientific reasons behind the twitching of the eyes. Eye twitching could be due to stress, alcohol, tiredness, allergies, strain or just dry eyes.");
           out.println("For more information go on link->https://www.youtube.com/watch?v=QXseRuvJR2A");
           break;
case 5:out.println("Removing evil eye (Nazar Utaarna)");
           out.println("Putting a little dot of kohl on the side of a child's forehead is very common in India. The practice is called Nazar Utaarna. It is done to protect the little kid from any evil eyes and prevent anyone from putting a negative vibe over the kid. The evil eye can cause severe damage to whom it turns. It is said that putting a black spot on a child's forehead will make the child look ugly to the evil powers and hence, the kid will stay protected.");
           out.println("For more information go on link->https://www.youtube.com/watch?v=P40mRPMdaQI");
           break;
case 6:out.println("Adding one rupee to a gift sum");
           out.println("On weddings and special occasions, we Indians generally like to gift money and it won't be 100 or 1,000 but 101 or 1,001. We add one rupee coin to the entire sum. It is considered a blessing, love and luck. But, the main reason to add that extra coin is to make the entire sum an odd number and it will be indivisible, it is good for the married couple. If we don't add one rupee coin, the sum will end in a zero which means 'the end'.");
           out.println("For more information go on link->https://www.youtube.com/watch?v=32vnic3UPsE");
           break;
case 7:out.println("Do not sweep after sunset");
           out.println("Goddess Lakshmi will walk out of your house if you sweep you place after sunset. In a country, where we pray to goddess Lakshmi so that she bestows wealth on us, any idea that leads to her walking out is considered inauspicious. Why sunset? This is because, it is believed that the goddess generally pays a visit after sunset so, if you sweep your place after sunset, she won't come in.");
           out.println("For more information go on link->https://www.youtube.com/watch?v=pLReZ5TEvP0");
           break;
case 8:out.println("Don't go near a Peepal tree in the night");
           out.println("Peepal is one tree the ghosts like to hover around and if you sleep around a peepal tree at night, the ghosts will kill you. Do you know that plants and living beings keep a balance in nature. In the morning, when the photosynthesis is occurring in them, they absorb carbon dioxide, change it into energy and give out oxygen in the air which we breathe in but in the night, the opposite reaction occurs. At night, plants exhale carbon dioxide while there is lack of sunlight. Animals sleep under trees all the time, why don't we see all of them dead, next morning?");
           out.println("For more information go on link->https://www.youtube.com/watch?v=K6_L7JOYz7U");
           break;
case 9:out.println("Cutting nails on saturday");
           out.println("Hindus believe that it’s inauspicious to cut hair and nails on Saturday because it angers planet Saturn (Shani), which then brings bad luck. Moreover, one must not cut one’s nails after sunset. The origin of this belief could be that in sweeping away the cut nails in the darkness, one could inadvertently sweep away small valuables because of poor visibility (Not sweeping after dark is also a superstition in India) One almost funny superstition associated with washing hair is that a student must never wash his/her hair before an exam. Doing so will ensure that everything the student has learned will be washed away.");
           out.println("For more information go on link->https://www.youtube.com/watch?v=KeCKIwQ97q8");
           break;
case 10:out.println("Do not sleep with your head facing the North");
           out.println("Our ancestors probably knew about the relation between Earth's magnetic field and the human body's field ( biomagnetism ).  They probably made this rule of sleeping with your head in the South because of the harmful effects related to blood pressure and other diseases that asymmetry with the Earth's magnetic field would create. However, today we only get to hear that 'sleeping with one's head in the north is inviting death' not why.");
           out.println("For more information go on link->https://www.youtube.com/watch?v=AW1ca9_NOuA");
           break;
default:out.println("Invalid choice");
            break;
}
}
}


