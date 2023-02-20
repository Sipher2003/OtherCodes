<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="AdRoator.aspx.cs" Inherits="WebApplication17.AdRoator" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>

            <br />
            <br />
            <br />
            <asp:AdRotator ID="AdRotator1" runat="server" AdvertisementFile  ="~/ads.xml"  />
            <br />
            <br />
            <br />
            <br />
            <br />
            <br />
            <br />
            <br />
            <br />

        </div>
    </form>
</body>
</html>


<!-- 
<?xml version="1.0" encoding="utf-8" ?>
<Advertisements>
	<Ad>
		<ImageUrl>https://m.media-amazon.com/images/I/61lDiPI70RL._SY355_.jpg</ImageUrl>
		<NavigateUrl>http://www.1800flowers.com</NavigateUrl>
		<AlternateText>
			Order flowers, roses, gifts and more
		</AlternateText>
		<Impressions>20</Impressions>
		<Keyword>flowers</Keyword>
	</Ad>

	<Ad>
		<ImageUrl>https://nationaltoday.com/wp-content/uploads/2021/05/Rose-640x514.jpg</ImageUrl>
		<NavigateUrl>http://www.babybouquets.com.au</NavigateUrl>
		<AlternateText>Order roses and flowers</AlternateText>
		<Impressions>20</Impressions>
		<Keyword>gifts</Keyword>
	</Ad>

	
</Advertisements>

 -->