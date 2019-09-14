import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class new_project {
	public static void main(String[] args) {
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
		     
			   String repo=row.select("h1.h3.lh-condensed").text();
			   String description=row.select("p.col-9.text-gray.my-1.pr-4").text();	
			   
			   String arr[]=repo.split(" ");
			   String repo_name="";
			   for(String str:arr){
				   repo_name+=str;
			   }
			   
			  System.out.println("Ripo_name :"+repo_name);
		       System.out.println("Description :"+description);
		       System.out.println("Link     :https://github.com/"+repo_name);
			   System.out.println("  ");
		}
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		
	}


