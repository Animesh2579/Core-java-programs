import static java.lang.System.in;
import javax.swing.JOptionPane;
import java.util.Scanner;
class Picnic
{
static public void main(String...ar)
{
Scanner sc=new Scanner(System.in);
int choice=Integer.parseInt( JOptionPane.showInputDialog("............Picnic Spots near Indore...........\n1.Within 20km\n2.Within 40km\n3.Within 60km\n4.Within 80km\n5.Within 100km\nEnter your choice according to the range"));
switch(choice)
{
 case 5:String choice5=( JOptionPane.showInputDialog("......Picnic Spots Within 100km from city.....\nm.Omkareshwar\n n.Narmada ghat,Maheshwar\no.Mandu\nEnter your choice")); 
      switch(choice5)
     {
     case "m":JOptionPane.showMessageDialog(null,"....Omkareshwar....\nSpot details:\nSituated at the confluence of the rivers Narmada and Kaveri, the holy city of Omkareshwar is shaped in\n the form of Hindu religious symbol 'Om', due to the merging of two valleys and a central pool of Narmada waters.\n It is the perfect place to visit near Indore for those looking for a spiritual experience. The town derives its name \nfrom 'Omkara' which is just one other name of Lord Shiva. Situated on the Mandhata islands, Omkareshwar houses one \n of the 12 revered Jyotirlingas and hence, draws thousands of devotees each year\nAwareness:\nAvoid wearing western clothes\nIncidents:\ndfhkjshb jfamn jmafd  jkh kh\nTransportation :\nThe temple is situated at a distance of nearly 75 km from the Indore airport.Intercity buses are available\nEmergency Contacts:\n8959916509,0731-2456312\nStaying facility:\nVarious hotels are available");
     break;
     case "n":JOptionPane.showMessageDialog(null,"....Narmada Ghat-Maheshwar....\n");
     break;
     case "o":JOptionPane.showMessageDialog(null,"....Mandu....");
     break;
    } 
case 4:String choice4=( JOptionPane.showInputDialog("......Picnic Spots Within 80km from city.....\nj.Ujjain-The home of Mahakaleshwar\nk.Hatyari khoh\nl.Janapav kuti\nEnter your choice")); 
      switch(choice4)
     {
     case "j":JOptionPane.showMessageDialog(null,"....Ujjain-The home of Mahakaleshwar....");
     break;
     case "k":JOptionPane.showMessageDialog(null,"....Hatyari khoh....\n");
     break;
     case "l":JOptionPane.showMessageDialog(null,"....Janapav Kuti....\n");
     break;
    }    
case 3:String choice3=( JOptionPane.showInputDialog("......Picnic Spots Within 60km from city.....\ng.Sheetla mata waterfall\n e.Bamniya kund\nf.Tincha Waterfalls\nEnter your choice")); 
      switch(choice3)
     {
     case "g":JOptionPane.showMessageDialog(null,"....Sheetla mata waterfall......");
     break;
     case "h":JOptionPane.showMessageDialog(null,"....Bamniya kund....");
     break;
     case "i":JOptionPane.showMessageDialog(null,"....Tincha Waterfalls....");
     break;
    }    
case 2:String choice2=( JOptionPane.showInputDialog("......Picnic Spots Within 40km from city.....\nd.Patalpani\n e.Gomatgiri\nf.Choral Dam\nEnter your choice")); 
      switch(choice2)
     {
     case "d":JOptionPane.showMessageDialog(null,"....Patalpani....");
     break;
     case "e":JOptionPane.showMessageDialog(null,"....Gomatgiri.....");
     break;
     case "f":JOptionPane.showMessageDialog(null,"....Choral Dam....");
     break;
    }   
case 1:String choice1=( JOptionPane.showInputDialog("......Picnic Spots Within 20km from city.....\na.Piplyapala regional park\n b.Ralamandal Wild Life sanctuary\nc.Gulawat lotus valley\nEnter your choice"));
      switch(choice1)
     {
     case "a":JOptionPane.showMessageDialog(null,"....Pipliyapala regional park....\nSpot deatils:\nSpreading over an area of a whopping 122 acres and housing a ginormous 80-acre lake, \nthe Pipliyapala Regional Park is an absolute treat for adults and children alike. Engage \n in some fun-filled activities like pedal-boating and motor-boating and witness the \n magical allure of the Mist and Musical Fountain, French Gardens, Labyrinths, Artist Village, etc.\n Be sure to try the savoury delicacies available at the Fast Food Zone\nAwareness:\nCarry your id cards as it is compulsory.\nIncidents:\nHigh drama was witnessed at Regional Park on Tuesday afternoon when a group of\n right wing activists resorted to moral policing and thrashed two youths who were present\n there along with school girls. The activists claimed that the girls, residents of Mhow, had skipped \ntheir school and had come to the park with their boyfriends, who belonged to\n different community.\nTransportation facility:\ncity bus,ibus availab     le to the nearest square.\nEmergency contacts:\n09179644880,0731-2493581\nStay facility:\nNot avaliable");
     break;     
    case "b":JOptionPane.showMessageDialog(null,"...Ralamandal Wild Life sanctuary....\nSpot details:\nThe oldest sanctuary of Madhya Pradesh, the Ralamandal Wildlife Sanctuary packs a treat for\n wildlife and avifauna enthusiasts alike. The River Narmada, which is 150 million \nyears older than River Ganga, graces the sanctuary with its presence. Home to deer, wild hare,\n tigers and an umpteen variety of birds, this sanctuary \nis nothing short of paradise.\nAwareness:\nCarry your id cards as it is compulsory.\nIncidents:\nCouples visiting such places hate to attract attention. This helped the culprits who filmed\n the act and then blackmailed many victims.They become easy targets of goons. Indore \nPolice team has busted a gang that targeted only couples visiting Kajligarh \nPicnic Spot, situated 16 km from Indore.\nTransportation facility-\nYou can go by train, road or flight in which you will feel comfortable. The Indore\n Junction railway station is the closest one to reach the sanctuary which is at a d    istance\n of only 9 km. The Devi Ahilyabai\n Holkar international airport in Indore is also very near to the sanctuary about 14 km \nfrom the park. The buses are available from the Indore city\nEmergency contacts:\n08979418768,0731-2495682\nStay Facility-many beautiful hotels near it");
    break;     
    case "c":JOptionPane.showMessageDialog(null,"...Gulawat Lotus Valley...\nSpot Details:\nIt is quite big forest,with small ponds in between;water to which comes from Yashwant \n sagar dam.In these ponds, blossoms beautiful lotus.This adds to the beauty of the place.\nAwareness:\nCarry eatables as there is no food available nearby.\nTransportation:\nThrough cab or personal vehicle\nEmergency contacts: \n 0731-2456891,8823823616\nStay facility:\n not available");
    break;    
    }
}
}
}