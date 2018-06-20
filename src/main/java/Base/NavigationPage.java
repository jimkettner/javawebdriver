package Base;

public class NavigationPage {

    public String getUrl(String pageName) {
        String url = "url";


        switch (pageName){
            case "CabelasHomePage":
                url = "https://www.cabelas.com";
            break;

            case "CanadaHomePage":
                url = "https://www.cabelas.ca";
            break;

            case "CabelasClubPage":
                url = "https://www.cabelas.com/custserv/custserv.jsp?pageName=clubhome";
            break;

            case "CabelasFAQPage":
                url = "https://cabelas.custhelp.com/app/answers/list";
            break;

            case "CabelasFreeShippingPage":
                url = "https://www.cabelas.com/custserv/custserv.jsp?pageName=Shipping";
            break;

            case "HuntingPage":
                url = "https://www.cabelas.com/category/Hunting/104791680.uts";
            break;

            case "FishingPage":
                url = "https://www.cabelas.com/category/Fishing/104793480.uts";
            break;

            case "ShootingPage":
                url = "https://www.cabelas.com/category/Shooting/104792580.uts";
            break;

            case "LearnPage":
                url = "https://www.cabelas.com/category/Its-In-Your-Nature/540412380.uts";
            break;

            case "BargainCavePage":
                url = "https://www.cabelas.com/category/Bargain-Cave/105591780.uts";
            break;

            case "CustomerServiceEmailPage":
                url = "https://cabelas.custhelp.com/app/ask";
        }


        return url;

    }

}
