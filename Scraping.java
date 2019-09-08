import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class new_project {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {

		      // fetch the document over HTTP
final Document document=Jsoup.connect("https://github.com/trending").get();
        // get the page title
String title =document.title();
System.out.println(title);
System.out.println("**********************************************");	 
for(Element row: document.select("article.Box-row"))
 {
       Elements links = row.select("a[href]");
	   String link=links.attr("href");
		
	   String head=row.select("h1.h3.lh-condensed").text();
	   String summery=row.select("p.col-9.text-gray.my-1.pr-4").text();
		 
	   System.out.println("Headline :"+head);
       System.out.println("Summery  :"+summery);
       System.out.println("Link     :https://github.com/"+link);
	   System.out.println("  ");
}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}