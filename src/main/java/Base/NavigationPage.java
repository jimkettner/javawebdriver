package Base;

public class NavigationPage {

    public String getUrl(String pageName) {
        String url = "url";


        switch (pageName){
            case "HomePage":
                url.equals("https://www.cabelas.com");
            break;

            case "CanadaHomePage":
                url.equals("https://www.cabelas.ca");
            break;

            case "CabelasClubPage":
                url.equals("https://www.cabelas.com/custserv/custserv.jsp?pageName=clubhome");
            break;

            case "CabelasFAQPage":
                url.equals("https://cabelas.custhelp.com/app/answers/list");
            break;

            case "CabelasFreeShippingPage":
                url.equals("https://www.cabelas.com/custserv/custserv.jsp?pageName=Shipping");
            break;
        }


        return url;

    }

}
