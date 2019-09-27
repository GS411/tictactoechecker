import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class B
{
public static void main(String args[])
{
String[] s={"xxo",
	"oox",
	"xxx"};
char winner='.';
for(int i=0;i<3;i++)
{
if(!Pattern.matches("[xo-]{3}+",s[i]))
{
System.out.println("wrong input");
System.exit(0);
}
}
for(int i=0;i<s.length;i++)
{
if(s[i].charAt(0)==s[i].charAt(1)&&s[i].charAt(1)==s[i].charAt(2))
winner=s[i].charAt(0);
else if(s[0].charAt(i)==s[1].charAt(i)&&s[1].charAt(1)==s[2].charAt(i))
winner=s[0].charAt(i);
else if(s[0].charAt(0)==s[1].charAt(1)&&s[1].charAt(1)==s[2].charAt(2))
winner=s[0].charAt(0);
else if(s[0].charAt(2)==s[1].charAt(1)&&s[1].charAt(1)==s[2].charAt(0))
winner=s[0].charAt(2);
}
System.out.println(winner=='.'?"Draw" : "Winner is "+winner);
}
}
